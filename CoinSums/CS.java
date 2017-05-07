/*
Project Euler # 31

Dynamic Programming
*/

public class CS {
    public static void main( String[] args ) {
        int lim = 200;
        int[] coins = {1, 2, 5, 10, 20, 50, 100, 200};
        int[] ways = new int[201];
        ways[0] = 1;

        for ( int i=0; i<coins.length; i++ )
            for ( int j=coins[i]; j<lim+1; j++ )
                ways[j] += ways[j-coins[i]];

        System.out.println(ways[200]);
    }
}
