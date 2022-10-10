import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { ButtonModule } from 'primeng/button';
import { SplitterModule } from 'primeng/splitter';
import {DividerModule} from 'primeng/divider';
import { TeamsComponent } from './teams/teams.component';
import { RecentBlogsComponent } from './recent-blogs/recent-blogs.component';

@NgModule({
  declarations: [
    AppComponent,
    TeamsComponent,
    RecentBlogsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ButtonModule,
    SplitterModule,
    DividerModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
