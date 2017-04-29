/*
Project Euler # 23

*/

public class NAS {
    public static void main( String[] args ) {
        int[] abundants = new int[14000];
        boolean[] sum_of_an = new boolean[28124];
        int sum = 0, lim = 28123, index = 0;

        for ( int i=2; i<lim; i++ )
            if ( is_abundant(i) )
                abundants[index++] = i;

        for ( int i=0; abundants[i] != 0; i++ )
            for ( int j=0; abundants[j] != 0; j++ ) {
                if ( abundants[i]+abundants[j] <= lim )
                    sum_of_an[abundants[i]+abundants[j]] = true;
            }

        for ( int i=0; i<=lim; i++ )
            if ( !sum_of_an[i] )
                sum += i;

        System.out.println(sum);
    }

    public static int factors_sum( int n ) {
        if ( n == 1 )
            return 1;

        int sum = 1;
        for ( int i=2; i<Math.round(Math.sqrt(n))+1; i++ )
            if ( n % i == 0 )
            {
                if ( i*i == n )
                    sum += i;
                else
                    sum += i + (n/i);
            }

        return sum;
    }

    public static boolean is_abundant( int a ) {
        return factors_sum(a) > a;
    }

}
