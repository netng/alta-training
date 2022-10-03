import { Component } from '@angular/core';
import { PassengerComponentEnum } from './passengers/entities/passenger-component-enum';
import { PassengerService } from './passengers/services/passenger.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'passenger-crud-service';
  selectedComponent!: PassengerComponentEnum;

  constructor(private passengerService: PassengerService) {}

  ngOnInit() {
    this.passengerService.selectedComponentEvent.subscribe(data => {
      this.selectedComponent = data;
    });
  }
}
