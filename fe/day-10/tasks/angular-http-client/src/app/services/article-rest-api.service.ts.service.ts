import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { IArticle, IBaseArticle } from '../models/IArticle';

const apiURL = 'http://localhost:3000';

@Injectable({
  providedIn: 'root'
})
export class ArticleRestApiServiceTsService {

  message?: string;

  constructor(
    private http: HttpClient,
    private router: Router
  ) { }

  httpOptions = {
    headers: new HttpHeaders({
        'Content-Type': 'application/json',
      }),
  };

  getArticles(): Observable<IArticle[]> {
    return this.http
      .get<IArticle[]>(apiURL + '/articles');
  }

  getArticle(id: number): Observable<IArticle> {
    return this.http
      .get<IArticle>(`${apiURL}/articles/${id}`);
  }

  updateArticle(id: number, data: IBaseArticle) {
    return this.http
      .put(`${apiURL}/articles/${id}`, data);
  }

  deleteArticle(id: number): Observable<any> {
    return this.http
      .delete(`${apiURL}/articles/${id}`);
  }

  cancel() {
    this.router.navigate(['/articles-management']);
  }
}
