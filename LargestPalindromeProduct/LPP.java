public class LPP
{
  public static void main(String[] args)
  {
    int n, largest = 0;

    for ( int i=100; i<1000; i++ )
      for ( int j=100; j<1000; j++ )
      {
        n = i * j;
        if ( is_palindrome(n) && n > largest )
          largest = n;
      }
    System.out.println(largest);
  }

  public static boolean is_palindrome(int n)
  {
    String a = Integer.toString(n);
    String b = new StringBuilder(a).reverse().toString();

    if ( a.equals(b) )
      return true;
    else
      return false;
  }

}
