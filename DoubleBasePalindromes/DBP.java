/*
Project Euler # 36

*/

public class DBP {
    public static void main( String[] args ) {
        int sum = 0;

        for ( int i=1; i<1000000; i++ ) {
            String a = Integer.toString(i);
            String b = Integer.toBinaryString(i);
            if ( is_palindrome(a) && is_palindrome(b) )
                sum += i;
        }

        System.out.println(sum);
    }

    public static boolean is_palindrome(String n) {
        String a = new StringBuilder(n).reverse().toString();

        return n.equals(a);
    }
}
