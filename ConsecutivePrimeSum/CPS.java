/*
Project Euler # 50

*/

import java.util.ArrayList;

public class CPS {
    public static void main( String[] args ) {
        ArrayList<Integer> prime_sums = new ArrayList<>();
        int n = 0, lim = 1000000;
        boolean[] primes = sieve(lim);

        prime_sums.add(0);
        for ( int i=0; i<primes.length; i++ )
            if ( primes[i] && prime_sums.get(prime_sums.size()-1) < lim ) {
                n += i;
                prime_sums.add(n);
            }
        prime_sums.remove(prime_sums.size()-1);

        int len = prime_sums.size();
        int streak = 1;
        int max_prime = 0;
        for ( int i=0; i<len; i++ )
            for ( int j=len-1; j>=0; j-- ) {
                n = prime_sums.get(j) - prime_sums.get(i);
                if ( j-i > streak && is_prime(n) ) {
                    streak = j-i;
                    max_prime = n;
                    break;
                }
            }

        System.out.println(max_prime);
    }

    public static boolean is_prime( int n ) {
        if ( n == 0  || n == 1 )
            return false;

        for ( int i = 2; i < n; i++ )
            if ( n != 2 && n % i == 0 )
                return false;

        return true;
    }

    public static boolean[] sieve( int n ) {
        boolean[] primes = new boolean[n+1];
        primes[0] = false;
        primes[1] = false;

        for( int i=2; i<primes.length; i++ )
            primes[i] = true;

        for( int i=2; i<=Math.sqrt(n)+1; i++ )
            if( primes[i] == true )
                for ( int j=i*i; j<=n; j+=i)
                    primes[j] = false;

        return primes;
    }
}
