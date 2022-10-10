import { Component, EventEmitter, Input, OnChanges, OnInit, Output, SimpleChanges } from '@angular/core';
import { Router } from '@angular/router';
import { IArticle, IBaseArticle } from '../models/IArticle';
import { ArticleRestApiServiceTsService } from '../services/article-rest-api.service.ts.service';

@Component({
  selector: 'app-articles-table',
  templateUrl: './articles-table.component.html',
  styleUrls: ['./articles-table.component.css']
})
export class ArticlesTableComponent implements OnInit {

  @Input() articles: IArticle[] | null = null;
  @Output() message = new EventEmitter<string>();

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

  onPublish(id: number, article: IBaseArticle) {
    article.is_published = 1;
    this.articleApiService.publishArticle(id, article)
      .subscribe({
        next: (data) => {
          this.message.emit('successfully publishing data');
          this.router.navigate(['/articles-management']);
        }
      })
  }

  onUnPublish(id: number, article: IBaseArticle) {
    article.is_published = 0;
    this.articleApiService.publishArticle(id, article)
      .subscribe({
        next: (data) => {
          this.message.emit('successfully Un Publishing data');
          this.router.navigate(['/articles-management']);
        }
      })
  }
}
