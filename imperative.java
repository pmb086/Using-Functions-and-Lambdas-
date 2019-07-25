// Paiyur Mohan, Balaji.
// bxp6836
// 2019-04-24

public class hmwk_05_imperative {
  //----------------------------------------------------------
  // Sum of squares
  public static long k = 0;
  static Long sumOfSquares( Long n ) {
    // Put something here
	if( n ==0 )
		return (long) 0;
	else if( n>0)
		return (long)((n*n) + sumOfSquares(n-1));
	return k;
  }

  // Pell numbers
  static Long pell( Long n ) {
    if (n==0)
		return (long)0;
	else if( n==1)
		return (long)1;
	else if( n>1)
		return (long)(2* pell(n-1) +pell(n-2));
    return k;
  }

  // Powers
  static Long powers( Long m, Long n ) {
    // Put something here
	if ( n==0)
		return m-1;
	else if( n>0)
		return (long)((m-1) + (m * powers(m,n-1)));
	return k;
  }

  //----------------------------------------------------------
  public static void main( String[] args )
  {
    // Put for loop here that calls sumOfSquares().
	for(long i = 0 ; i <= 15 ; i++){
		System.out.println("sumOfSquares("+ i +") is "+sumOfSquares(i));
	}
	
    // Put for loop here that calls pell().
	for(long i = 0 ; i <= 15 ; i++){
		System.out.println("pell("+ i +") is "+pell(i));
	}
    // Put nested for loops here that call powers().
	for(long i = 2 ; i <= 10 ; i++){
		for(long j = 1 ; j <= 10 ; j++){
		System.out.println("powers("+ i +", "+ j +") is "+powers(i,j));
	    }
    }
  }
}
