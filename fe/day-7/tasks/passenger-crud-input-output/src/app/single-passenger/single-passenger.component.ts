import { Component, EventEmitter, Input, Output, OnInit } from '@angular/core';
import { IPassenger } from '../models/IPassenger';

@Component({
  selector: 'app-single-passenger',
  templateUrl: './single-passenger.component.html',
  styleUrls: ['./single-passenger.component.css']
})
export class SinglePassengerComponent implements OnInit {

  @Input() passengers: IPassenger[] = [];
  @Input() passenger: IPassenger | null = null;
  @Output() passengerEdited = new EventEmitter<IPassenger>();

  constructor() { }

  ngOnInit(): void {
  }

  onEditPassenger(passenger: IPassenger) {
    this.passenger = passenger;
    this.passenger && this.passengerEdited.emit(this.passenger);
  }

}
