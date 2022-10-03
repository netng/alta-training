import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PassengersComponent } from './passengers/passengers/passengers.component';
import { ListPassengersComponent } from './passengers/list-passengers/list-passengers.component';
import { AddPassengerComponent } from './passengers/add-passenger/add-passenger.component';
import { FormsModule } from '@angular/forms';
import { EditPassengerComponent } from './passengers/edit-passenger/edit-passenger.component';

@NgModule({
  declarations: [
    AppComponent,
    PassengersComponent,
    ListPassengersComponent,
    AddPassengerComponent,
    EditPassengerComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
