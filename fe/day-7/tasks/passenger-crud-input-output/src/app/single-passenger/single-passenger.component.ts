import { Component, Input, OnInit } from '@angular/core';
import { IPassenger } from '../models/IPassenger';

@Component({
  selector: 'app-single-passenger',
  templateUrl: './single-passenger.component.html',
  styleUrls: ['./single-passenger.component.css']
})
export class SinglePassengerComponent implements OnInit {

  @Input() passengers: IPassenger[] = [];

  constructor() { }

  ngOnInit(): void {
  }

}
