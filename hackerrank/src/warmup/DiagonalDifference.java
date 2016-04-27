package warmup;

import java.util.Scanner;

public class DiagonalDifference {

	 static int diagonalDifference(int[][] matrix) {
	      
	       int DiagonalDown=0;
	       int DiagonalUp=0;
	       int result;
	       int longitud = matrix.length;
	      for(int i=0;i<longitud;i++){
	    	  	DiagonalDown += matrix[i][i];
	    	  	DiagonalUp += matrix[i][longitud-i-1]; 	    	  	
	      }
	      //System.out.println("DiagonalDown: "+DiagonalDown);
	      //System.out.println("DiagonalUp: "+DiagonalUp);
	      
	       result =  Math.abs(DiagonalDown-DiagonalUp);
	       return result;
	    }
	
	
	
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int a[][] = new int[n][n];
	        for(int a_i=0; a_i < n; a_i++){
	            for(int a_j=0; a_j < n; a_j++){
	                a[a_i][a_j] = in.nextInt();
	            }
	        }
	        
	        System.out.println(diagonalDifference(a));
	        
	    }

}
