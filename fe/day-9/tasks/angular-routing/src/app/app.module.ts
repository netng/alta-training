import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule, Routes } from '@angular/router';

import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { NavigationComponent } from './navigation/navigation.component';
import { PassengersComponent } from './passengers/passengers.component';
import { PassengersTableComponent } from './passengers-table/passengers-table.component';
import { PassengerComponent } from './passenger/passenger.component';

const appRoutes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'passengers', component: PassengersComponent },
  { path: 'passengers/:id', component: PassengerComponent },
];

@NgModule({
  declarations: [
    AppComponent,
    NavigationComponent,
    PassengersComponent,
    PassengersTableComponent,
    PassengerComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
