package warmup;

import java.util.Scanner;

public class Staircase {
	static void staircase(int n){
		
		for(int i=0; i<n; i++){
			
			if (i<n){
			for(int k=0; k<=n-i-2; k++){
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++){
				System.out.print("#");
			}
		}
			System.out.println();
		}
		
		
	} 

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
	}

}
