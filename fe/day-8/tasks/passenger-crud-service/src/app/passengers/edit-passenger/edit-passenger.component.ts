import { Component, OnInit } from '@angular/core';
import { IPassenger } from '../entities/IPassenger';
import { PassengerComponentEnum } from '../entities/passenger-component-enum';
import { PassengerService } from '../services/passenger.service';

@Component({
  selector: 'app-edit-passenger',
  templateUrl: './edit-passenger.component.html',
  styleUrls: ['./edit-passenger.component.css']
})
export class EditPassengerComponent implements OnInit {
  name = '';
  city = '';
  passenger: IPassenger | null = null;

  constructor(private passengerService: PassengerService) { }

  ngOnInit(): void {
    this.passenger = this.passengerService.selectedPassenger;
    if (this.passenger) {
      this.name = this.passenger.name;
      this.city = this.passenger.city;
    }
  }

  onUpdate() {
    let passenger: IPassenger = {
      id: this.passenger?.id,
      name: this.name,
      city: this.city,
    }
    this.passengerService.updatePassenger(passenger);
    this.passengerService.selectedComponentEvent.emit(
      PassengerComponentEnum.passengers
    );
  }

}
