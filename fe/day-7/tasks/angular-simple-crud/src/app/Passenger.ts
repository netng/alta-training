export interface Passenger {
    id: number;
    name: string;
    city: string;
}

export interface Passengers {
    [id: number]: Passenger;
}