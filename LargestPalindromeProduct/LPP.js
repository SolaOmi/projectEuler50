/*
Project Euler # 4

Brute Force
*/

var max = 0;

function reverse(s) {
    var array = s.split("");
    var reverseArray = array.reverse();
    return reverseArray.join("");
}

function isPalindrome(s) {
    return s === reverse(s);
}

for (var i = 100; i < 1000; i++) {
    for (var j = 100; j < 1000; j++) {
        var num = i * j;
        if (isPalindrome(num.toString()) && num > max) {
            max = num;
        }
    }
}

console.log(max);
