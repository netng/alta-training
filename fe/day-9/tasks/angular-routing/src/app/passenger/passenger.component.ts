import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { IPassenger } from '../models/IPassenger';
import { PassengerService } from '../services/passenger.service';

@Component({
  selector: 'app-passenger',
  templateUrl: './passenger.component.html',
  styleUrls: ['./passenger.component.css']
})
export class PassengerComponent implements OnInit {

  passenger: IPassenger | undefined;

  constructor(
    private route: ActivatedRoute,
    private passengerService: PassengerService
  ) { }

  ngOnInit(): void {
    const id: number = this.route.snapshot.params['id'];
    this.passenger = this.passengerService.getPassengerDetails(id);
  }

  backToPassengers(): void {
    this.passengerService.navigateToPassengers();
  }
}
