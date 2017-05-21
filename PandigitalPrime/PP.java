/*
Project Euler # 41

*/

import java.util.HashSet;
import java.util.Set;

public class PP {
    public static void main( String[] args ) {
      boolean[] primes = sieve(10000000);
      int p = 0, largest = 0;

      for ( int i=0; i<primes.length; i++ )
          if ( primes[i] == true && ispandigital(i) && i > largest )
              largest = i;

      System.out.println(largest);
    }

    public static boolean[] sieve( int n ) {
        boolean[] primes = new boolean[n+1];
        primes[0] = false;
        primes[1] = false;

        for ( int i=2; i<primes.length; i++ )
            primes[i] = true;

        for ( int i=2; i<=Math.sqrt(n)+1; i++ )
            if ( primes[i] == true )
                for ( int j=i*i; j<=n; j+=i)
                    primes[j] = false;

        return primes;
    }

    public static boolean ispandigital( int n ) {
        Set<Integer> set = new HashSet<Integer>();
        String s = Integer.toString(n);

        for ( int i=0; i<s.length(); i++ )
            set.add(Character.getNumericValue(s.charAt(i)));

        for ( int i=1; i<=set.size(); i++ )
            if ( !set.contains(i) )
                return false;

        return true;
    }
}
