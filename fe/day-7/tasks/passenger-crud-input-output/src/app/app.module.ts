import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PassengersComponent } from './passengers/passengers.component';
import { SinglePassengerComponent } from './single-passenger/single-passenger.component';
import { AddPassengerComponent } from './add-passenger/add-passenger.component';

@NgModule({
  declarations: [
    AppComponent,
    PassengersComponent,
    SinglePassengerComponent,
    AddPassengerComponent
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
