/*
Project Euler # 47

*/

public class DPF {
    public static void main( String[] args ) {
        int n = 0;

        while ( true ) {
            if ( pfc(n) >= 4 && pfc(n+1) >= 4 && pfc(n+2) >= 4 && pfc(n+3) >= 4 )
                break;
            else
                n++;
        }

        System.out.println(n + ", " + (n+1) + ", " + (n+2) + ", " + (n+3));
    }

    public static int pfc( int n ) {
        // prime_factors_count (pfc) - counts the amount of prime factors.
        int count = 0;

        if (n == 1)
              return count;

        for ( int i=2; i<(int) Math.sqrt(n)+1; i++ )
            if ( n % i == 0 )
                if ( i*i == n && is_prime(i) )
                    count++;
                else {
                    if ( is_prime(n/i) )
                        count++;
                    if ( is_prime(i) )
                        count++;
                }

        return count;
    }

    public static boolean is_prime( int n ) {
        if ( n == 0  || n == 1 )
            return false;

        for ( int i = 2; i < n; i++ )
            if ( n != 2 && n % i == 0 )
                return false;

        return true;
    }
}
