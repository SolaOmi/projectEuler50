/*
Project Euler # 35

*/

public class CP {
    public static void main( String[] args ) {
      boolean[] primes = sieve(1000000);
      int count = 0;


      for ( int i=0; i<primes.length; i++ ) {
          if ( primes[i] == true ) {
              String n = Integer.toString(i);
              boolean flag = true;
              for ( int j=1; j<n.length(); j++ )
                  if ( !primes[rotate(n, j)] ) {
                      flag = false;
                      break;
                  }
              if ( flag )
                  count++;
          }
      }

      System.out.println(count);
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

    public static int rotate(String s, int offset ) {
        int i = offset % s.length();
        s = s.substring(i) + s.substring(0, i);
        return Integer.parseInt(s);
    }



}
