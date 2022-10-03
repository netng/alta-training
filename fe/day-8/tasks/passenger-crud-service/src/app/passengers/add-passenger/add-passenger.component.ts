import { Component, OnInit } from '@angular/core';
import { PassengerService } from '../services/passenger.service';

@Component({
  selector: 'app-add-passenger',
  templateUrl: './add-passenger.component.html',
  styleUrls: ['./add-passenger.component.css']
})
export class AddPassengerComponent implements OnInit {
  name = '';
  city = '';

  constructor(private passengerService: PassengerService) { }

  ngOnInit(): void {
  }

  onAddPassenger() {
    let passenger = {
      name: this.name,
      city: this.city,
    }
    this.passengerService.addPassenger(passenger);
  }

}
