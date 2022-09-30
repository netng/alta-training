import { Component, OnInit } from '@angular/core';
import { IPassenger } from '../models/IPassenger';

@Component({
  selector: 'app-passengers',
  templateUrl: './passengers.component.html',
  styleUrls: ['./passengers.component.css']
})
export class PassengersComponent implements OnInit {

  passengers: IPassenger[] = [
    {id: 1, name: 'nandang', city: 'bogor'},
  ];

  editPassengerDetails: IPassenger | null = null;

  constructor() { }

  ngOnInit(): void {
  }

  onPassengerAdd(passenger: IPassenger) {
    passenger.id = this.passengers.length + 1;
    this.passengers.push(passenger);
  }

  onPassengerEdited(passenger: IPassenger) {
    this.editPassengerDetails = passenger;
  }

}
