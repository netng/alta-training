import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { IArticle, IBaseArticle } from '../models/IArticle';

@Injectable({
  providedIn: 'root'
})
export class ArticleRestApiServiceTsService {

  apiURL: string = 'http://localhost:3000';
  message?: string;

  constructor(private http: HttpClient) { }

  httpOptions = {
    headers: new HttpHeaders({
        'Content-Type': 'application/json',
      }),
  };

  getArticles(): Observable<IArticle[]> {
    return this.http
      .get<IArticle[]>(this.apiURL + '/articles');
  }

  getArticle(id: number): Observable<IArticle> {
    return this.http
      .get<IArticle>(`${this.apiURL}/articles/${id}`);
  }

  updateArticle(id: number, data: IBaseArticle) {
    console.log('update');
    return this.http
      .put(`${this.apiURL}/articles/${id}`, data);
  }
}
