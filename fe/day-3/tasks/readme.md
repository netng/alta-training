## Jawaban pertanyaan point 1

Bisa dicek langsung pada kode index.js

## Jawaban pertanyaan point 2

### a. Jelaskan kenapa baris 21,22,23 tidak dapat tampil?

karena value dari variable `terdaftar` adalah false, di set false pada baris ke 4 `let terdaftar = false`.

### b. Jelaskan kenapa deklarasi pada baris 26 menyebabkan error?

karena variable `nama` di set sebagai global variable yang mana type nya constant `const`, variable dengan type const value nya tidak bisa diubah `TypeError: Assignment to constant variable.`

### c. Dengan melakukan komen pada baris ke 26, apakah baris 28 dapat di eksekusi? jelaskan

tidak bisa, karena variable `asal` adalah `scope variable` karena di deklarasikan dalam `function perkenalan()` menggunakan `let` , jadi hanya bisa dipanggil dalam function tersebut saja.

### 3. Lakukan desctucturing pada kode di bawah sehingga Budi Tersimpan dalam variable bernama a, Sita tersimpan dalam variabel bernama b, dan Ayutersimpan dalam variable bernama c.

`const foo = ['Budi', 'Sita', 'Ayu'];`

```
const [a, b, c] = foo;
```

### 4. Kalian memiliki sebuah variabel berikut (let bdays = ['10-17','05-19','20-19']). Ubahlah tanda (-) dalam variabel tersebut menjadi (/) sehingga output yang akan keluar dalam console menjadi `['10/17', '05/19', '20/19']`

```
const new_bdays = bdays.map((day) => day.split("-").join("/"));

console.log(new_bdays);
> [ '10/17', '05/19', '20/19' ]
```

### 5. Kalian memiliki variabel berikut (let value = [1,2,3,4,5,6]). Kalikan setiap value dalam array tersebut dengan dua. Sehingga, ketika dipanggil variable value mengeluarkan output berupa [ 2, 4, 6, 8, 10, 12 ]

```
let value = [1, 2, 3, 4, 5, 6];

const valueKaliDua = value.map((x) => x * 2);
console.log(valueKaliDua);
> [ 2, 4, 6, 8, 10, 12 ]
```
