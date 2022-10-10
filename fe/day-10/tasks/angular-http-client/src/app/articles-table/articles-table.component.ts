import { Component, Input, OnChanges, OnInit, SimpleChanges } from '@angular/core';
import { Router } from '@angular/router';
import { Article } from '../models/Article';
import { ArticleRestApiServiceTsService } from '../services/article-rest-api.service.ts.service';

@Component({
  selector: 'app-articles-table',
  templateUrl: './articles-table.component.html',
  styleUrls: ['./articles-table.component.css']
})
export class ArticlesTableComponent implements OnInit {

  @Input() articles: Article[] | null = null;

  constructor(
    private router: Router,
    private articleApiService: ArticleRestApiServiceTsService
  ) { }

  ngOnInit(): void {
  }

  onEditArticle(id: number): void {
    console.log('onEditArticle');
    this.router.navigate(['/articles', id, 'edit']);
  }

  onDeleteArticle(id: number): void {
    this.articleApiService.deleteArticle(id)
      .subscribe({
        next: (res) => {
          this.getArticles();
          this.router.navigate(['/articles-management']);
        },
        error: (e) => console.error(e),
      });
  }

  getArticles() {
    this.articleApiService.getArticles()
      .subscribe({
        next: (data) => {
          this.articles = data;
        },
        error: (e) => console.error(e),
      });
  }

}
