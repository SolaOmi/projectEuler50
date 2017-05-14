/*
Project Euler # 39

a**2 + b**2 = c**2
a + b + c = p
substitution yields b = (p*(p-2*i)/(2*(p-i))
b is an integer, meaning the modulus of the equation of b must equal zero
*/

public class IRT {
    public static void main( String[] args ) {
        int pmax = 0, n = 0;

        for ( int p = 2; p<=1000; p++ ) {
            int psol = 0;
            for ( int i=2; i<=1000; i++ )
                if ( i < p && (p*(p-2*i) % (2*(p-i)) == 0) )
                    psol++;
            if ( psol > pmax ) {
                pmax = psol;
                n = p;
            }
        }

        System.out.println(n);
    }
}
