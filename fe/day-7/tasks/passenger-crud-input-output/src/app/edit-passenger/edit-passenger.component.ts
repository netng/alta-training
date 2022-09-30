import { Component, Input, OnInit } from '@angular/core';
import { IPassenger } from '../models/IPassenger';

@Component({
  selector: 'app-edit-passenger',
  templateUrl: './edit-passenger.component.html',
  styleUrls: ['./edit-passenger.component.css']
})
export class EditPassengerComponent implements OnInit {

  @Input() passenger!: IPassenger;
  name: string = '';
  city: string = '';

  constructor() { }

  ngOnInit(): void {
    this.name = this.passenger.name;
    this.city = this.passenger.city;
  }

}
