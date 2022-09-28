import { Component, OnInit } from '@angular/core';
import { Passengers } from '../Passenger';

@Component({
  selector: 'app-passenger',
  templateUrl: './passenger.component.html',
  styleUrls: ['./passenger.component.css']
})
export class PassengerComponent implements OnInit {

  constructor() { }

  passengers: Passengers[] = [];
  newPassenger: any = {};

  ngOnInit(): void {
  }

  addPassenger() {
    const id: number = this.newPassenger.p_id;
    this.passengers[id] = {
      id,
      ...this.newPassenger
    };
    console.log(this.passengers);
    console.log(this.passengers.length);

  }

}
