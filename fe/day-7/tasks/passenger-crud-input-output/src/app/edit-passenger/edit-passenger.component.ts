import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { IPassenger } from '../models/IPassenger';

@Component({
  selector: 'app-edit-passenger',
  templateUrl: './edit-passenger.component.html',
  styleUrls: ['./edit-passenger.component.css']
})
export class EditPassengerComponent {

  @Input() passenger!: IPassenger;
  @Output() passengerUpdated = new EventEmitter<IPassenger>();
  name: string = '';
  city: string = '';

  constructor() { }

  ngOnChanges(): void {
    this.name = this.passenger.name;
    this.city = this.passenger.city;
  }

  onUpdatePassenger() {
    let passenger: IPassenger = {
      id: this.passenger.id,
      name: this.name,
      city: this.city
    };
    this.passengerUpdated.emit(passenger);
  }

  

}
