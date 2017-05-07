/*
Project Euler # 33

*/

public class DCF {
    public static void main( String[] args ) {
        String num1, num2;
        int dig1, dig2;

        for ( int i=10; i<100; i++ ) {
            num1 = Integer.toString(i);
            dig1 = Character.getNumericValue(num1.charAt(1));
            for ( int j=10; j<100; j++ ) {
                num2 = Integer.toString(j);
                dig2 = Character.getNumericValue(num2.charAt(0));
                if ( j < i && dig1 != 0 )
                    if ( (double) j/i == (double) dig2/dig1 && num2.charAt(1) == num1.charAt(0) )
                        System.out.println(j + "/" + i);
            }
        }
    }
}
