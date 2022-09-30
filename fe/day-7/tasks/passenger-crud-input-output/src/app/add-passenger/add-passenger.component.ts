import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { IPassenger } from '../models/IPassenger';

@Component({
  selector: 'app-add-passenger',
  templateUrl: './add-passenger.component.html',
  styleUrls: ['./add-passenger.component.css']
})
export class AddPassengerComponent implements OnInit {

  name: string = '';
  city: string = '';

  @Output() passengerAdded = new EventEmitter<IPassenger>();

  constructor() { }

  ngOnInit(): void {
  }

  onAddPassenger() {
    let passenger: IPassenger = {
      name: this.name,
      city: this.city,
    };
    this.passengerAdded.emit(passenger);
    this.name = '';
    this.city = '';
  }
}
