import { EventEmitter, Injectable, Output } from "@angular/core";
import { IPassenger } from "../entities/IPassenger";
import { PassengerComponentEnum } from "../entities/passenger-component-enum";

@Injectable({
    providedIn: 'root',
})
export class PassengerService {
    passengers: IPassenger[] = [
        {
            id: 1,
            name: 'nandang',
            city: 'bogor'
        }
    ]

    @Output() selectedComponentEvent = new EventEmitter<PassengerComponentEnum>();

    selectedPassenger: IPassenger | null = null;

    constructor() {}

    addPassenger(passenger: IPassenger) {
        passenger.id = this.passengers.length + 1
        this.passengers.push(passenger);

    }

    updatePassenger(passenger: IPassenger) {
        this.passengers = this.passengers.map(pas => {
            if (pas.id == passenger.id) {
                return passenger;
            }

            return pas;
        });
    }

    getPassengers() {

    }


    deletePassenger() {

    }
}