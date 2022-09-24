interface Person {
    id: number;
    name: string;
    status: boolean;
}

function classDecorator(constructorFunction: Function): void {
    console.log(`decorator sebelum class`);
}

function arrayOfNumbers(numbers: number[]): void {
    numbers.forEach(value => {
        console.log(value);
    });
}

@classDecorator
class Perkenalan implements Person {
    id: number;
    name: string;
    status: boolean;

    constructor (
        id: number,
        name: string,
        status: boolean
    ) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    private sayMyName() {
        console.log(`id: ${this.id}, name: ${this.name}, status: ${this.status}`);
    }

    getPersonInfo() {
        this.sayMyName();
    }
}

const perkenalan: Perkenalan = new Perkenalan(1, "nandang", true);
perkenalan.getPersonInfo();

const numbers: number[] = [9, 7, 5, 3];
arrayOfNumbers(numbers);