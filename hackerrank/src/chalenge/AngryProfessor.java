package chalenge;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/angry-professor

public class AngryProfessor {

	static void angryProfessor(int[] alumnos, int cantAlumnos, int threshold ) {
		
		int presentes=0;
		for (int i=0;i<cantAlumnos;i++){
			if(alumnos[i]<=0)
			{presentes++;}
		}		
		if(presentes>=threshold){
			System.out.println("NO");
		}
		else{
			System.out.println("YES");
		}
	}

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        for(int a0 = 0; a0 < t; a0++){
	            int n = in.nextInt();
	            int k = in.nextInt();
	            int a[] = new int[n];
	            for(int a_i=0; a_i < n; a_i++){
	                a[a_i] = in.nextInt();
	            }
	            
	            angryProfessor(a,n,k);
	            
	        }
	    }
	}


