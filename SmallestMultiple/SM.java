public class SM
{
  public static void main(String[] args)
  {
    long ans = 1L;

    for ( long i=2L; i<=20; i++ )
      ans = least_common_multiple(ans, i);

    System.out.println(ans);
  }

  public static long least_common_multiple(long a, long b)
  {
    return (a * b)/greatest_commmon_divisor(a,b);
  }

  public static long greatest_commmon_divisor(long a, long b)
  {
    long ans = 1;

    for ( long i=1L; i < Math.sqrt(a)+1; i++ )
      if ( a % i == 0 && b % i == 0 )
        ans = i;

    return ans;
  }
}
