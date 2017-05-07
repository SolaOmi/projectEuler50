/*
Project Euler # 28

f(n) = 4n**2 + bn + c
Ulam spiral, derived constants with simultaneous eqns. f(1) = 9, f(2) = 25
f(n) = 4n**2 + 4n + 1
1001 x 1001, n = 500

spiral(i) gives northwest diagonal
spiral(i) - 2i gives northeast diagonal
spiral(i) - 4i gives southeast diagonal
spiral(i) - 6i gives southwest diagonal
*/

public class NSD {
    public static void main( String[] args ) {
        int sum = 1; // 1 for center of diagonal

        for ( int i=1; i<=500; i++ )
            sum += 4*spiral(i) - 12*i;

        System.out.println(sum);
    }

    public static int spiral( int n ) {
        return 4*n*n + 4*n + 1;
    }
}
