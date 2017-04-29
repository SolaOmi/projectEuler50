/*
Project Euler # 4

Brute Force
*/

public class LPP {
    public static void main(String[] args) {
        int n, largest = 0;

        for ( int i=100; i<1000; i++ )
            for ( int j=100; j<1000; j++ )
                if ( is_palindrome(i*j) && i*j > largest )
                    largest = i*j;

        System.out.println(largest);
    }

    public static boolean is_palindrome(int n) {
        String a = Integer.toString(n);
        String b = new StringBuilder(a).reverse().toString();

        return a.equals(b);
    }

}
