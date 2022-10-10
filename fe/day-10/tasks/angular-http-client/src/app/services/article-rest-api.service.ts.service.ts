import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { catchError, Observable, throwError, retry } from 'rxjs';
import { Article } from '../models/Article';
import { IArticle } from '../models/IArticle';

@Injectable({
  providedIn: 'root'
})
export class ArticleRestApiServiceTsService {

  apiURL: string = 'http://localhost:3000';

  constructor(private http: HttpClient) { }

  httpOptions = {
    headers: new HttpHeaders({
        'Content-Type': 'application/json',
      }),
  };

  getArticles(): Observable<Article[]> {
    return this.http
      .get<Article[]>(this.apiURL + '/articles');
  }

  getArticle(id: number): Observable<Article> {
    return this.http
      .get<Article>(`${this.apiURL}/articles/${id}`);
  }

  updateArticle(id: number, data: Article) {
    console.log('update');
  }
}
