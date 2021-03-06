package algorithms;
//https://www.hackerrank.com/challenges/sherlock-and-the-beast

import java.util.Scanner;

public class SherlockandTheBeast{

	static void sherlockandTheBeast(int n){
		
		StringBuilder sherlock=new StringBuilder();
        for(int i=n;i>=0;i--){
        	
            if(i%3==0 && (n-i)%5==0){
            	
                int j=0;
                for(j=0;j<i;j++)
                	sherlock.append("5");
                for(int k=j;k<n;k++)
                	sherlock.append("3");
                break;
            }
        }
        if(sherlock.length()==0)
            System.out.println("-1");
        else
            System.out.println(sherlock);
		
	}
	
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            sherlockandTheBeast(n);
        }
    }

}
