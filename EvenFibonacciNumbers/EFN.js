/*
Project Euler # 2

Brute Force
*/

var a = 1;
var b = 2;
var sum = b;

while (b < 4000000) {
    var temp = a;
    a = b;
    b = b + temp;
    if (b % 2 === 0) {
        sum += b;
    }
}

console.log(sum);
