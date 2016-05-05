package matrix;

import java.util.ArrayList;


/**
 * Dada una tabla, dar el camino desde la a11 hasta la ann que sea suma maxima
 * y que solo pueda hacer pasos para la derecha y para abajo.
 * 
 * **/
public class MinimumCostPath {
	
	static void minimumCostPath(int[][] field){
	   
		int fils = field.length;
	    int cols = field[0].length;
	    int[][] maxValues = new int[fils][cols];
	    int[] maximos = new int[fils*cols];
	    ArrayList<Integer> maxs = new ArrayList<Integer>();
	    
	    for (int i = 0; i < fils; i++) {
	        for (int j = 0; j < cols; j++) {
	        	
	            if (i == 0 && j == 0) {
	                maxValues[i][j] = field[i][j];
	                //maxs.add(field[i][j]);
	            } else if (i == 0) {
	                maxValues[i][j] = maxValues[i][j-1] + field[i][j];
	                //maxs.add(maxValues[i][j-1] + field[i][j]);
	            } else if (j == 0) {
	                maxValues[i][j] = maxValues[i-1][j] + field[i][j];
	                //maxs.add( maxValues[i-1][j] + field[i][j]);
	            } else {
	                maxValues[i][j] = Math.max(maxValues[i][j-1], maxValues[i-1][j]) + field[i][j];
	                //maxs.add((Math.max(maxValues[i][j-1], maxValues[i-1][j]) + field[i][j]));
	            }
	        }
	    }
	   // System.out.println("====================================");
	    //System.out.println(maxs);
	    System.out.println("====================================");
		for (int fila = 0; fila < maxValues.length; fila++) {
	        for (int col = 0; col < maxValues[fila].length;col++) {
	        	System.out.print(maxValues[fila][col] + " ");
	    }
	    System.out.println();
		}
	    
	    
	    System.out.println("maximaSuma:"+ maxValues[fils-1][cols-1]);
		}
		

	
	
	
	public static void main(String[] args) {
		int[][] tabla = new int[3][3];
		tabla[0][0] = 1;
		tabla[0][1] = 1;
		tabla[0][2] = 1;
		tabla[1][0] = 1;
		tabla[1][1] = 2;
		tabla[1][2] = 1;
		tabla[2][0] = 1;
		tabla[2][1] = 1;
		tabla[2][2] = 3;
		
		
		for (int fila = 0; fila < tabla.length; fila++) {
	        for (int col = 0; col < tabla[fila].length;col++) {
	        	System.out.print(tabla[fila][col] + " ");
	    }
	    System.out.println();

	}

		minimumCostPath(tabla);
	}
	

}
