/*
Project Euler # 34

*/

public class DF {
    public static void main( String[] args ) {
        int lim =  7*factorial(9); // 9,999,999 and 7*9! same order of digits
        int sum = 0;

        for ( int i=10; i< lim; i++ )
            if ( i == digit_factorial_sum(i) ) 
                sum += i;

        System.out.println(sum);
    }

    public static int digit_factorial_sum( int n ) {
        String s = Integer.toString(n);
        int sum = 0;

        for ( int i=0; i<s.length(); i++ )
            sum += factorial(Character.getNumericValue(s.charAt(i)));

        return sum;
    }

    public static int factorial( int n ) {
        int ans = 1;

        if ( n == 1 || n == 0 )
            return ans;

        for ( int i=2; i<=n; i++ )
            ans *= i;

        return ans;
    }
}
