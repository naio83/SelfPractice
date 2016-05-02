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
	        	int j = i;
	        	while(j>0 && listaDesordenada[j] < listaDesordenada[j-1]){
	        		temp = listaDesordenada[j];
	        		listaDesordenada[j] = listaDesordenada[j-1];
	        		listaDesordenada[j-1] = temp;
	        		j--;
	        	}
	        			
	        }
	
		//System.out.println(Arrays.toString(listaDesordenada));
	}
	
	
	
	public static void main(String[] args) {
		//int[] listaDesordenada = {3,1,2,5,6,9,8,0,4,7};
		int[] listaDesordenada = new int[10000];
		Random randomGenerator = new Random();
		int randomInt = 0;
		for (int i = 0; i < 10000; i++) {
			randomInt = randomGenerator.nextInt(100);
			listaDesordenada[i]=randomInt;
			
		}
		
		//System.out.println("lista Desordenada: ");
		//System.out.println(Arrays.toString(listaDesordenada));
		//System.out.println("insertionSort: ");
		long insertionSortTStart = System.currentTimeMillis();
		insertionSort(listaDesordenada);
		long insertionSortTEnd = System.currentTimeMillis();
		
		//System.out.println("bubbleSort: ");
		long bubbleSortTStart = System.currentTimeMillis();
		bubbleSort(listaDesordenada);
		long bubbleSortTEnd = System.currentTimeMillis();
		
		//System.out.println("selectionSort: ");
		long selectionSortTStart = System.currentTimeMillis();
		selectionSort(listaDesordenada);
		long selectionSortTEnd = System.currentTimeMillis();
		
		
		
		long insertionTimeDelta = insertionSortTEnd - insertionSortTStart;
		long bubbleTimeDelta = bubbleSortTEnd - bubbleSortTStart;
		long selectionTimeDelta = selectionSortTEnd - selectionSortTStart;
		
		double insertionElapsedSeconds = insertionTimeDelta / 1000.0;
		double bubbleElapsedSeconds = bubbleTimeDelta / 1000.0;
		double selectionElapsedSeconds = selectionTimeDelta / 1000.0;
		
		System.out.println("insertionElapsedSeconds: "+insertionElapsedSeconds);
		System.out.println("bubbleElapsedSeconds: "+bubbleElapsedSeconds);
		System.out.println("selectionElapsedSeconds: "+selectionElapsedSeconds);
	}
		
		
}
