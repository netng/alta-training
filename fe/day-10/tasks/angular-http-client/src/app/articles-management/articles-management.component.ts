import { Component, OnInit } from '@angular/core';
import { Article } from '../models/Article';
import { ArticleRestApiServiceTsService } from '../services/article-rest-api.service.ts.service';

@Component({
  selector: 'app-articles-management',
  templateUrl: './articles-management.component.html',
  styleUrls: ['./articles-management.component.css']
})
export class ArticlesManagementComponent implements OnInit {

  articles: Article[] | null = null;

  constructor(private articleApiService: ArticleRestApiServiceTsService) { }

  ngOnInit(): void {
    this.getEmployees();
    console.log(this.articles);
  }

  getEmployees() {
    this.articleApiService.getArticles()
      .subscribe({
        next: (data) => {
          this.articles = data;
          console.log(data);
        },
        error: (e) => console.error(e)
      });
  }

}
