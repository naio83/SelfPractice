package warmup;

import java.util.Scanner;

public class SimpleArraySum {
	
	
	   static int simpleArraySum(int[] a) {
		      
	       int result=0;
	       int longitud = a.length;
	      for(int i=0;i<longitud;i++){
	    		   result += a[i];
	    	   }
	    	   	              
	       return result;
	    }

	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int arr[] = new int[n];
	        for(int arr_i=0; arr_i < n; arr_i++){
	            arr[arr_i] = in.nextInt();
	        }
	        
	      
	        System.out.println(simpleArraySum(arr));
	        //System.out.print( "Result: "+simpleArraySum(arr));
	       
	        /*System.out.println(" CANT ELEMENTOS: "+ n );
	        for(int i=0;i<arr.length; i++){
				System.out.print(arr[i] + " " );
				
			}*/
		
		
		
	/*	int[] arrayTest = new int[4] ;
		arrayTest[0]= 1;
		arrayTest[1]= 2;
		arrayTest[2]= 3;
		arrayTest[3]= 4;

				
		for(int i=0;i<arrayTest.length; i++){
			System.out.print(arrayTest[i] + " " );
			
		}
		
		System.out.print( "Result: "+simpleArraySum(arrayTest));*/

	}

}
