import { Component, OnInit } from '@angular/core';
import { Article } from '../models/Article';
import { IArticle } from '../models/IArticle';
import { ArticleRestApiServiceTsService } from '../services/article-rest-api.service.ts.service';

@Component({
  selector: 'app-articles-management',
  templateUrl: './articles-management.component.html',
  styleUrls: ['./articles-management.component.css']
})
export class ArticlesManagementComponent implements OnInit {

  articles: IArticle[] | null = null;
  message?: string;

  constructor(private articleApiService: ArticleRestApiServiceTsService) { }

  ngOnInit(): void {
    this.getArticles();
    this.message = this.articleApiService.message;
  }

  getArticles() {
    this.articleApiService.getArticles()
      .subscribe({
        next: (data) => {
          this.articles = data;
        },
        error: (e) => console.error(e)
      });
  }

}
