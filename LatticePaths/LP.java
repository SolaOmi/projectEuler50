/*
Project Euler # 15

There is a Binomial Coefficient Formula to calculate the amount of
routes.
                (2n)!/(n! * n!)
*/

import java.math.BigInteger;

public class LP
{
    public static void main(String[] args)
    {
        int n = 20;
        BigInteger ans = factorial(2*n);

        ans = ans.divide(factorial(n)).divide(factorial(n));
        System.out.println(ans);
    }

    public static BigInteger factorial(int n)
    {
        BigInteger sum = BigInteger.ONE;
        for ( int i=1; i<=n; i++ )
        {
            sum = sum.multiply(new BigInteger(i + ""));
        }

        return sum;
    }
}
