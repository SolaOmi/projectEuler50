/*
Project Euler # 30

The number of digits of the sum must equal the number of digits for the
original number
 digits(n)      maximum n      n * 9**5
     5             99,999      295,245
     6            999,999      354,294
     7          9,999,999      413,343     too many digits
*/

public class DFP {
    public static void main( String[] args ) {
        int sum = 0, temp, digit;
        String number;

        for ( int i=2; i<354294; i++ ) {
            temp = 0;
            number = Integer.toString(i);
            for ( int j=0; j<number.length(); j++ ) {
                digit = Character.getNumericValue(number.charAt(j));
                temp += Math.pow(digit,5);
            }
            if ( i == temp )
                sum += i;
        }

        System.out.println(sum);
    }
}
