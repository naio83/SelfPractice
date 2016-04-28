/**
 * 
 */
package algorithms;

import java.util.Scanner;

/**
 * @author naio
 *
 */
public class FindDigits {
	
	static void findDigits(int n){
		
		int r = n;
		int count = 0;
		while(r > 0){
		    if(r % 10 != 0 && n % (r % 10) == 0) count++;
		    r = r / 10;
		}
		System.out.println(count);
		
	}
	
	/**
	 * @param args
	 */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            findDigits(n);
        }
    }

}
