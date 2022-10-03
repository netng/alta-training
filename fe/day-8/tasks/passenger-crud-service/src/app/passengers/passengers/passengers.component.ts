import { Component, OnInit } from '@angular/core';
import { IPassenger } from '../entities/IPassenger';
import { PassengerService } from '../services/passenger.service';

@Component({
  selector: 'app-passengers',
  templateUrl: './passengers.component.html',
  styleUrls: ['./passengers.component.css']
})
export class PassengersComponent implements OnInit {
  passengers!: IPassenger[];

  constructor(private passengerService: PassengerService) { }

  ngOnInit(): void {
    this.passengers = this.passengerService.passengers;
  }

}
