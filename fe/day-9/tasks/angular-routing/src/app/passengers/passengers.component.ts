import { Component, OnInit } from '@angular/core';
import { IPassenger } from '../models/IPassenger';
import { PassengerService } from '../services/passenger.service';

@Component({
  selector: 'app-passengers',
  templateUrl: './passengers.component.html',
  styleUrls: ['./passengers.component.css']
})
export class PassengersComponent implements OnInit {

  passengers: IPassenger[] | null = null; 

  constructor(private passengerService: PassengerService) {
  }

  ngOnInit(): void {
    this.passengers = this.passengerService.getPassengers();
  }

}
