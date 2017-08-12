/*
Project Euler # 1

Brute Force
*/

var lim = 1000;
var sum = 0;

for (var i = 0; i < lim; i++) {
    if ( i % 3 === 0 || i % 5 === 0) {
        sum += i;
    }
}

console.log(sum);
