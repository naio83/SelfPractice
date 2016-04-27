/**
 * 
 */
package chalenge;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	/*
	 * @param donutConstraintPairs This is the matrix with the donuts and their types.
	 * @param candidateConstraintPairs This is the matrix with the member name and prefered donut type
	 * @return String[][] returns a matrix with the pairs member names and donuts types orderes by 1st by name and 2nd by donut
	 */

	private static void insertionSort(){		
		int[] listaDesordenada = {3,1,2,5,6,9,8,0,4,7};
		int lengthLista = listaDesordenada.length;

		System.out.println(Arrays.toString(listaDesordenada));	
			int temp;
	        for (int i = 1; i < lengthLista; i++) {
	            for(int j = i ; j > 0 ; j--){
	                if(listaDesordenada[j] < listaDesordenada[j-1]){
	                    temp = listaDesordenada[j];
	                    listaDesordenada[j] = listaDesordenada[j-1];
	                    listaDesordenada[j-1] = temp;
	                }
	            }
	        }
	
		System.out.println(Arrays.toString(listaDesordenada));
	}
	
	private static void ordenamiento(String[][] desordenado){
		
		System.out.println("##################################################");
		System.out.println(Arrays.deepToString(desordenado));
		
		int lengthArray = desordenado.length;
		String[] temp;
        for (int i = 1; i < lengthArray; i++) {
            for(int j = i ; j > 0 ; j--){
				String primero = desordenado[j][0];
				String segundo = desordenado[j-1][0];
				int var = primero.compareTo(segundo);
				if (var < 0){            	
                    temp = desordenado[j];
                    desordenado[j] = desordenado[j-1];
                    desordenado[j-1] = temp;
                }
            }
        }
	

		System.out.println(Arrays.deepToString(desordenado));
		System.out.println("##################################################");
		
	}

	static String[][] matchDonuts(String[][] donutConstraintPairs, String[][] candidateConstraintPairs) {
		int candidateConstraintPairsCount = candidateConstraintPairs.length;
		int donutConstraintPairsCount = donutConstraintPairs.length;   	

		ArrayList<String[]> donnutMatch = new ArrayList<String[]>();		

		// for every candidate searches their type
		for (int i=0;i<candidateConstraintPairsCount;i++){
			String sm = candidateConstraintPairs[i][1];


			if (candidateConstraintPairs[i][1]=="*"){
				for(int j=0; j<donutConstraintPairsCount;j++){
					donnutMatch.add(new String[]{candidateConstraintPairs[i][0]});	
					donnutMatch.add(new String[]{donutConstraintPairs[j][0]});	
				}
			}
			else{
				donnutMatch.add(new String[]{candidateConstraintPairs[i][0]});
				for(int j=0; j<donutConstraintPairsCount;j++){
					if (donutConstraintPairs[j][1]==sm){
						donnutMatch.add(new String[]{donutConstraintPairs[j][0]});						
					}	    				
				}
			}
		}		
		
		String[][] donnutMatchResult= new String[donnutMatch.size()/2][2]; 
		int g=0,f=0;
		while(g<donnutMatch.size()){
			donnutMatchResult[f][0] = donnutMatch.get(g)[0];
			donnutMatchResult[f][1] = donnutMatch.get(g+1)[0];
			g = g+2;
			f++;
		}
		
		System.out.println(Arrays.deepToString(donnutMatchResult));
		return donnutMatchResult;		
		
	}

	public static void main(String[] args) throws IOException{

		String[][] donutConstraintPairs = {{"Choco_MUFIN","CHOCOLATE"},{"Arandanos_MUFFIN","ARANDANOS"}};
		String[][] candidateConstraintPairs = {{"Mariela","*"},{"Ignacio","ARANDANOS"},{"Alberto","CHOCOLATE"}};	    		    		    	
		ordenamiento(candidateConstraintPairs);
		ordenamiento(donutConstraintPairs);
		//insertionSort();
		matchDonuts(donutConstraintPairs, candidateConstraintPairs);
	}
}





