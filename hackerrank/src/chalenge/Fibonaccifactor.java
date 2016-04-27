package chalenge;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Fibonaccifactor {

    
	
	@SuppressWarnings("null")
	public static int[] divisores(int divisible){
		int[] result = null;
		System.out.println("divisible: "+ divisible);
		int index =0;
		for(int j=0;j<divisible;j++){
			if (divisible%j == 0){
				result[index]=j;
				index++;
				System.out.println(j);
				
			}
		}
		return result;
	}
	
	
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
    	int casos = in.nextInt();
    	int result = 0;
    	long resultArray[] = new long[casos];
    	
    	for(int i=0;i<casos;i++){
    		int numero = in.nextInt();			
			resultArray[i] = numero;
			divisores(i);
			

		   	
    	}
    	
    	for (int j=0; j<resultArray.length;j++){
    		System.out.println(resultArray[j]);
    }
}
}