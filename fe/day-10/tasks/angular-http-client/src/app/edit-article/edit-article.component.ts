import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Article } from '../models/Article';
import { ArticleRestApiServiceTsService } from '../services/article-rest-api.service.ts.service';

@Component({
  selector: 'app-edit-article',
  templateUrl: './edit-article.component.html',
  styleUrls: ['./edit-article.component.css']
})
export class EditArticleComponent implements OnInit {

  article: Article = {
    title: '',
    description: ''
  };

  constructor(
    private route: ActivatedRoute,
    private apiArticleService: ArticleRestApiServiceTsService
    ) { }

  ngOnInit(): void {
    this.getArticle(this.route.snapshot.params['id']);
  }

  getArticle(id: number): void {
    this.apiArticleService.getArticle(id)
      .subscribe({
        next: (data) => {
          this.article = data;
        },
        error: (e) => console.log(e),
      });
  }

  onUpdateArticle(): void {
    this.apiArticleService.updateArticle()
  }
}
