import { Component, OnInit } from '@angular/core';
import { IArticle } from '../models/IArticle';
import { ArticleRestApiServiceTsService } from '../services/article-rest-api.service.ts.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  articles: IArticle[] = [];

  constructor(private apiArticleService: ArticleRestApiServiceTsService) { }

  ngOnInit(): void {
    this.getPublishedArticles();
    console.log('onInit');
  }

  getPublishedArticles() {
    this.apiArticleService.getArticles()
      .subscribe({
        next: (data) => {
          data.map((article) => {
            if (article.is_published == 1) {
              this.articles.push(article);
            }
          });
        },
        error: (e) => console.error(e)
      });
  }


}
