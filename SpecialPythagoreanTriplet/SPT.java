/*
Project Euler # 9

Euclid's formula for generating Pythagorean triples given an arbitrary
pair of integers m and n such that m > n > 0.
            a = m**2 - n**2, b = 2*m*n, c = m**2 + n**2
*/

public class SPT {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;

        for ( int n=1; n<1000; n++ )
            for ( int m=n+1; m<1000; m++ )
                if ( 2*(m*m + m*n) == 1000 ) {
                    a = m*m - n*n;
                    b = 2*m*n;
                    c = m*m + n*n;
                    System.out.println(a*b*c);
                }

    }
}
