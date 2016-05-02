/**
 * 
 */
package sorting;

import java.util.Arrays;
import java.util.Random;

/**
 * @author naio
 *
 */
public class cuadraticSorting {

	/***
	 * 
	 * Implementacion del bubbleSort
	 * 
	 * */
	private static void bubbleSort(int[] listaDesordenada){
		int lengthLista = listaDesordenada.length;
		int temp=0;
		for (int i = 0; i < lengthLista; i++) {
			for(int j = 1; j < (lengthLista-i); j++){
				if(listaDesordenada[j] < listaDesordenada[j-1]){
					temp = listaDesordenada[j-1];
	        		listaDesordenada[j-1] = listaDesordenada[j];
	        		listaDesordenada[j] = temp;
				}
			}
			
		}
		//System.out.println(Arrays.toString(listaDesordenada));
	}
	
	/***
	 * 
	 * Implementacion del selectionSort
	 * 
	 * */	
	private static void selectionSort(int[] listaDesordenada){
		int lengthLista = listaDesordenada.length;
		for (int i = 0; i < lengthLista; i++) {
			int temp=0;
			for (int j = i+1; j < lengthLista; j++) {
				if(listaDesordenada[j] < listaDesordenada[i]){
					temp = listaDesordenada[i];
	        		listaDesordenada[i] = listaDesordenada[j];
	        		listaDesordenada[j] = temp;
				}
        		
				
			}
			
		}
		//System.out.println(Arrays.toString(listaDesordenada));
	}
	
	/***
	 * 
	 * Implementacion del insertionSort
	 * 
	 * */
	private static void insertionSort(int[] listaDesordenada){				
		int lengthLista = listaDesordenada.length;			
			int temp=0;
	        for (int i = 0; i < lengthLista; i++) {
	        	for (int j = i; j >0; j--) {
	        		if(listaDesordenada[j] < listaDesordenada[j-1]){
		        		temp = listaDesordenada[j];
		        		listaDesordenada[j] = listaDesordenada[j-1];
		        		listaDesordenada[j-1] = temp;
	        		}
	        	}	        		        		        		        		        			
	        }	
		//System.out.println(Arrays.toString(listaDesordenada));
	}
	
	
	
	public static void main(String[] args) {
		//int[] listaDesordenada0 = {3,1,2,5,6,9,8,0,4,7};
		int[] listaDesordenada1 = new int[10000];
		int[] listaDesordenada2 = new int[10000];
		int[] listaDesordenada3 = new int[10000];
		Random randomGenerator = new Random();
		int randomInt = 0;
		for (int i = 0; i < 10000; i++) {
			randomInt = randomGenerator.nextInt(100);
			listaDesordenada1[i]=randomInt;
			listaDesordenada2[i]=randomInt;
			listaDesordenada3[i]=randomInt;
			
		}
		
		/*System.out.println("lista Desordenada: ");
		System.out.println(Arrays.toString(listaDesordenada0));
		insertionSort(listaDesordenada0);
		System.out.println(Arrays.toString(listaDesordenada0));*/
		
		
		
		
		//System.out.println("bubbleSort: ");
		long bubbleSortTStart = System.currentTimeMillis();
		bubbleSort(listaDesordenada1);
		long bubbleSortTEnd = System.currentTimeMillis();
		
		//System.out.println("selectionSort: ");
		long selectionSortTStart = System.currentTimeMillis();
		selectionSort(listaDesordenada2);
		long selectionSortTEnd = System.currentTimeMillis();
		
		//System.out.println("insertionSort: ");
		long insertionSortTStart = System.currentTimeMillis();
		insertionSort(listaDesordenada3);
		long insertionSortTEnd = System.currentTimeMillis();
		
		
		long bubbleTimeDelta = bubbleSortTEnd - bubbleSortTStart;
		long selectionTimeDelta = selectionSortTEnd - selectionSortTStart;
		long insertionTimeDelta = insertionSortTEnd - insertionSortTStart;
		
		double bubbleElapsedSeconds = bubbleTimeDelta / 1000.0;
		double selectionElapsedSeconds = selectionTimeDelta / 1000.0;
		double insertionElapsedSeconds = insertionTimeDelta / 1000.0;
		
		System.out.println("bubbleElapsedSeconds: "+bubbleElapsedSeconds);
		System.out.println("selectionElapsedSeconds: "+selectionElapsedSeconds);
		System.out.println("insertionElapsedSeconds: "+insertionElapsedSeconds);  
	}
		
		
}
