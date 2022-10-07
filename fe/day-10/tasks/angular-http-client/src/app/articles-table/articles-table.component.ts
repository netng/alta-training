import { Component, Input, OnInit } from '@angular/core';
import { Article } from '../models/Article';

@Component({
  selector: 'app-articles-table',
  templateUrl: './articles-table.component.html',
  styleUrls: ['./articles-table.component.css']
})
export class ArticlesTableComponent implements OnInit {

  @Input() articles: Article[] | null = null;

  constructor() { }

  ngOnInit(): void {
  }

}
