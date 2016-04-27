package warmup;

import java.util.Scanner;

public class Solvemesecond {

	
	static int suma(int a, int b){
		return a + b;
	}
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
        int a, b;
		
		for(int i=0;i<casos;i++){
			a = in.nextInt();
			b = in.nextInt();
			System.out.println(suma(a,b));			
			
		}
	}
	
}
