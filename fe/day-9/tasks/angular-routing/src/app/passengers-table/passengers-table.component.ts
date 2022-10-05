import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Router } from '@angular/router';
import { IPassenger } from '../models/IPassenger';
import { PassengerService } from '../services/passenger.service';

@Component({
  selector: 'app-passengers-table',
  templateUrl: './passengers-table.component.html',
  styleUrls: ['./passengers-table.component.css']
})
export class PassengersTableComponent implements OnInit {

  @Input() passengers: IPassenger[] | null = null;

  constructor(private passengerService: PassengerService) { }

  ngOnInit(): void {
  }

  showPassenger(id: number) {
    this.passengerService.navigateToPassenger(id);
  }

}
