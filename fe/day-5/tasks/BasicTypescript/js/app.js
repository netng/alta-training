"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
function classDecorator(constructorFunction) {
    console.log(`decorator sebelum class`);
}
function arrayOfNumbers(numbers) {
    numbers.forEach(value => {
        console.log(value);
    });
}
let Perkenalan = class Perkenalan {
    constructor(id, name, status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }
    sayMyName() {
        console.log(`id: ${this.id}, name: ${this.name}, status: ${this.status}`);
    }
    getPersonInfo() {
        this.sayMyName();
    }
};
Perkenalan = __decorate([
    classDecorator
], Perkenalan);
const perkenalan = new Perkenalan(1, "nandang", true);
perkenalan.getPersonInfo();
const numbers = [9, 7, 5, 3];
arrayOfNumbers(numbers);
