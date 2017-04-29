/*
Project Euler 12

*/

public class HDTN {
    public static void main(String[] args) {
        int n = 0, count = 0, num = 0;

        while ( count < 500 ) {
            n++;
            num = triangle_number(n);
            count = factors(num);
        }

        System.out.println(num);
    }

    public static int factors(int n) {
        if ( n == 1 )
            return 1;

        int count = 2;
        for ( int i=2; i<=Math.sqrt(n); i++ )
            if ( n % i == 0 ) {
                if ( i*i == n )
                    count++;
                else
                    count += 2;
            }

        return count;
    }

    public static int triangle_number(int n) {
        return (n * (n+1))/2;
    }
}
