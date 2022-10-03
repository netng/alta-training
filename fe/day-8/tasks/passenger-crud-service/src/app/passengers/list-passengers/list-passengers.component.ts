import { Component, OnInit, Input } from '@angular/core';
import { IPassenger } from '../entities/IPassenger';
import { PassengerComponentEnum } from '../entities/passenger-component-enum';
import { PassengerService } from '../services/passenger.service';

@Component({
  selector: 'app-list-passengers',
  templateUrl: './list-passengers.component.html',
  styleUrls: ['./list-passengers.component.css']
})
export class ListPassengersComponent implements OnInit {

  @Input() passengers!: IPassenger[];
  @Input() passenger!: IPassenger | null;

  constructor(private passengerService: PassengerService) { }

  ngOnInit(): void {
  }

  onEditPassenger(passenger: IPassenger) {
    this.passenger = passenger;
    this.passengerService.selectedPassenger = this.passenger;
    this.passengerService.selectedComponentEvent.emit(
      PassengerComponentEnum.editPassenger
    );
  }

}
