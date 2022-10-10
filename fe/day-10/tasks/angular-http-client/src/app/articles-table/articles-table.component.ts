import { Component, Input, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Article } from '../models/Article';

@Component({
  selector: 'app-articles-table',
  templateUrl: './articles-table.component.html',
  styleUrls: ['./articles-table.component.css']
})
export class ArticlesTableComponent implements OnInit {

  @Input() articles: Article[] | null = null;

  constructor(private router: Router) { }

  ngOnInit(): void {
  }

  onEditArticle(id?: number): void {
    console.log('onEditArticle');
    this.router.navigate(['/articles', id, 'edit']);
  }

}
