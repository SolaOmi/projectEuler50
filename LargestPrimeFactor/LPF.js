/*
Project Euler # 3

The fundamental theorem of arithmetic states that every integer greater
than 1 is either prime or is the product of prime numbers (factors).
If you divide n by its smallest prime factor repeatedly, then the last
prime factor will be the largest.
*/

function isPrime(n) {
    if (n == 0  || n == 1) {
        return false;
    }
    for (var i = 2; i < n; i++) {
        if ( n % i === 0 ) {
            return false;
        }
    }
    return true;
}

var num = 600851475143;
var largest = 1;

for (var i = 3; i < Math.sqrt(num)+1; i += 2) {
    if (num % i == 0 && isPrime(i)) {
        largest = i;
    }
}

console.log(largest);
