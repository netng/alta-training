import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { IPassenger } from '../models/IPassenger';

@Injectable({
  providedIn: 'root'
})
export class PassengerService {

  private passengers: IPassenger[] = [
    {id: 1, name: 'nandang', city: 'bogor'},
    {id: 2, name: 'rahayu', city: 'hongkong'},
    {id: 3, name: 'kazu', city: 'jepang'},
  ]


  constructor(private route: Router) { }

  getPassengerDetails(id: number): IPassenger | undefined {
    return this.passengers.find(passenger => passenger.id == id);
  }

  getPassengers(): IPassenger[] {
    return this.passengers;
  }

  navigateToPassenger(id: number): void {
    this.route.navigate(['/passengers', id]);
  }

  navigateToPassengers(): void {
    this.route.navigate(['/passengers']);
  }

}
