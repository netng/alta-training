import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ArticlesManagementComponent } from './articles-management/articles-management.component';
import { ArticlesTableComponent } from './articles-table/articles-table.component';
import { EditArticleComponent } from './edit-article/edit-article.component';
import { HomeComponent } from './home/home.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'articles-management', component: ArticlesManagementComponent },
  { path: 'articles/:id/edit', component: EditArticleComponent },
  { path: 'articles/:id', component: EditArticleComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
