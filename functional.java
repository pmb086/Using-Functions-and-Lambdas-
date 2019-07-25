
// Paiyur Mohan, Balaji.
// bxp6836
// 2019-04-24

import java.util.function.UnaryOperator;
import java.util.function.BinaryOperator;

public class hmwk_05_functional {
  //----------------------------------------------------------
  // sumOfSquares lambda goes here.
	static UnaryOperator<Long> 
	ok =(i)-> i == 0 ? 0 : i*i+ hmwk_05_functional.ok.apply(i-1);
  // pell lambda goes here.
	static UnaryOperator<Long> 
	ok1 = (i)-> i == 0 ? 0 : i == 1 ? 1 : 2* hmwk_05_functional.ok1.apply( i-1) + hmwk_05_functional.ok1.apply(i-2); 
  // powers lambda goes here.
	static BinaryOperator<Long> 
	ok2 = (i,j)-> j == 0? i-1 :  i * hmwk_05_functional.ok2.apply(i,j-1)+ i-1;

  //----------------------------------------------------------
  public static void main( String[] args )
  {
		// Put for loop here that calls sumOfSquares().
		for(long i = 0L ; i <= 15 ; i++){
			System.out.format( "sumOfSquares(%d) is %d\n", i, ok.apply( i ) );
		}
		
	    // Put for loop here that calls pell().
		for(long i = 0L ; i <= 15 ; i++){
			System.out.format("pell(%d) is %d\n", i, ok1.apply( i ));
		}
	    // Put nested for loops here that call powers().
		for(long i = 2L ; i <= 10 ; i++){
			for(long j = 1L ; j <= 10 ; j++){
				System.out.format("powers(%d,%d) is %d\n",i,j, ok2.apply(i,j));
		    }
	    }
  }
}
