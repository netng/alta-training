var a = 5;
var b = "kampus merdeka";
const nama = "Budi";

// jawaban pertanyaan `b`, ubah terdaftar dari false jadi true supaya di evaluasi kode yang ada di block code nya
// let terdaftar = false;
let terdaftar = true;
let lengkap_arr = [a, b, nama, terdaftar];

function perkenalan() {
  let asal = "indonesia";
  return console.log("perkenalkan nama saya " + nama + " nomor urut " + a + " sekarang sedang mengikuti " + b + " berasal dari " + asal);
}

if (terdaftar === true) {
  console.log(nama + " terdaftar sebagai kegiatan kampus merdeka");
}

a = b;
//nama = b; <-- ini error karena variable `nama` type nya constant, jadi tidak bisa diubah value nya

/**
 * jawaban pertanyaan `a`
 */
console.log(`array - ${lengkap_arr[2]}`);

// console.log("asal diakses = " + asal); <-- ini error karena variable 'asal' bukan global tapi scoped variable
console.log("a adalah = " + a);
console.log("b adalah = " + b);
perkenalan();
