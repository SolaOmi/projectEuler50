/*
Project Euler # 21

*/

public class AN {
    public static void main( String[] args ) {
        int sum = 0;

        for ( int i=1; i<10000; i++ )
            if ( is_amicable(i) )
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

    public static boolean is_amicable( int a ) {
        int b = factors_sum(a);
        return  a != b && a == factors_sum(b);
    }

}
