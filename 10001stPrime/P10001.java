/*
Project Euler # 7

*/

public class P10001
{
    public static void main(String[] args)
    {
        int n = 3 , count = 1, prime = 0;

        while ( count != 10001 )
        {
            if ( is_prime(n) )
            {
                count++;
                prime = n;
            }
            n += 2;
        }
        System.out.println(prime);
    }

    public static boolean is_prime(long n)
    {
        if ( n == 0  || n == 1 )
            return false;

        for ( int i = 2; i < n; i++ )
            if ( n != 2 && n % i == 0 )
                return false;

        return true;
    }

}
