public class LPF
{
  public static void main(String[] args)
  {
    long n = 600851475143L, largest = 1;

    for ( int i = 3; i < Math.sqrt(n)+1; i += 2 )
      if ( n % i == 0 && is_prime(i) )
        largest = i;
    System.out.println(largest);
  }

  public static boolean is_prime(long n)
  {
    if ( n == 0  || n == 1 )
      return false;

    for ( int i = 2; i < n; i++ )
      if ( n % i == 0 )
        return false;

    return true;
  }
}
