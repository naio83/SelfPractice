/**
 * 
 */
package algorithms;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author 
 *
 */
public class extraLongFactorials {

	static void factorial(int n){
		BigInteger result = BigInteger.ONE;
		

		for (int i = 1; i <= n; i++) {			
			result = result.multiply(BigInteger.valueOf(i));	
			
		}
		System.out.println(result);
	}
	
	
	
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        factorial(n);

	}

}
