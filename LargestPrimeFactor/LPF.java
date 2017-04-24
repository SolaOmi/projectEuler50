/*
Project Euler # 3

The fundamental theorem of arithmetic states that every integer greater
than 1 is either prime or is the product of prime numbers (factors).
Loop over a range of possible factors excluding even numbers since n
isn't divisible by 2 and the rest of the primes are odd, the last factor
that is prime should produce the desired result.
*/

public class LPF
{
    public static void main(String[] args)
    {
        long n = 600851475143L, largest = 1;

        for ( int i = 3; i < Math.sqrt(n)+1; i += 2 )
            if ( n % i == 0 && is_prime(i) )
                largest = i;
        System.out.println(largest);

    }

    public static boolean is_prime(long n)
    {
        if ( n == 0  || n == 1 )
            return false;

        for ( int i = 2; i < n; i++ )
            if ( n != 2 && n % i == 0 )
                return false;

        return true;
    }
}
