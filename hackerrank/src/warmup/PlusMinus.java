package warmup;

import java.util.Scanner;

public class PlusMinus {

	 static void plusMinus(int[] a) {
		 double zeros=0;
		 double possitives=0;
		 double negatives=0;
	     int longitud = a.length;
	     
	     for(int i=0;i<longitud;i++){
	    	 if(a[i]==0){
	    		 zeros += 1;
	    	 }
	    	 else if(a[i]>0){
	    		 possitives += 1;
	    	 }
	    	 else{
	    		 negatives += 1;
	    	 }	    	 
	     }
	     zeros = zeros/longitud;
	     possitives = possitives/longitud;
	     negatives = negatives/longitud;

	     System.out.printf("%.6f", possitives);
	     System.out.println();
	     System.out.printf("%.6f", negatives);
	     System.out.println();
	     System.out.printf("%.6f", zeros);
	 }
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr);
    }
    
}
