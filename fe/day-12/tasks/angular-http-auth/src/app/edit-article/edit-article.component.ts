import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { IArticle, IBaseArticle } from '../models/IArticle';
import { ArticleRestApiServiceTsService } from '../services/article-rest-api.service.ts.service';

@Component({
  selector: 'app-edit-article',
  templateUrl: './edit-article.component.html',
  styleUrls: ['./edit-article.component.css']
})
export class EditArticleComponent implements OnInit {

  article: IBaseArticle = {
    title: '',
    description: '',
    is_published: 0
  };

  id!: number;

  constructor(
    private route: ActivatedRoute,
    private apiArticleService: ArticleRestApiServiceTsService,
    private router: Router
    ) { }

  ngOnInit(): void {
    this.getArticle(this.route.snapshot.params['id']);
    this.id = this.route.snapshot.params['id'];
  }

  getArticle(id: number): void {
    this.apiArticleService.getArticle(id)
      .subscribe({
        next: (data) => {
          this.article = data;
          console.log(this.article);
        },
        error: (e) => console.log(e),
      });
  }

  onUpdateArticle(): void {
    this.apiArticleService.updateArticle(this.id, this.article)
      .subscribe({
        next: (res) => {
          console.log(res);
          this.apiArticleService.message = `successfully updating article with id ${this.id}`;
          this.router.navigate(['/articles-management']);
        },
        error: (e) => console.error(e),
      });
  }

  onCancel(): void {
    this.apiArticleService.cancel();
  }
}
