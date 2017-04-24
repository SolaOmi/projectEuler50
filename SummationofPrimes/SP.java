/*
Project Euler # 10

Use an efficient algorithm to generate prime numbers quickly. The sieve
function below is based on the Sieve of Eratosthenes.
*/

public class SP
{
    public static void main(String[] args)
    {
        long sum = 0L;
        int n = 0;
        boolean[] primes = sieve(2000000);

        for ( int i=0; i<primes.length; i++ )
            if ( primes[i] == true )
                sum += i;

        System.out.println(sum);
    }

    public static boolean[] sieve(int n)
    {
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
