/*
Project Euler # 5

You can find the lowest common multiple of two numbers using:
lcm(a,b) = |a*b| / gcd(a,b)
lcm's Associative law lcm(a,lcm(b,c)) = lcm(lcm(a,b),c) allows us to apply the
formula to a collection of numbers.
*/

function gcd(a, b) {
    var ans = 1;

    for (var i = 2; i <= a; i++) {
        if (a % i === 0 && b % i === 0) {
            ans = i;
        }
    }

    return ans;
}

function lcm(a, b) {
    return (a * b) / gcd(a, b);
}

var ans = 1

for (var i=1; i<=20; i++) {
    ans = lcm(i, ans);
}

console.log(ans);
