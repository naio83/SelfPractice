package algorithms;
import java.util.Scanner;
//https://www.hackerrank.com/challenges/library-fine
public class LibraryFine {
	
	
	static void libraryFine(int d1,int m1,int y1,int d2,int m2,int y2){
		int result;
		if (y1==y2){
			if(m1==m2){
				if(d1<=d2){
					result = 0;
				}
				else{
					result = 15*(d1-d2);					
				}							
			}
			else if(m1<m2){
				result = 0;
			}
			else{
				result = 500*(m1-m2);
			}									
		}
		else if(y1<y2){
			result = 0;
		}
		else{
			result = 10000;
		}
		
		System.out.print(result);
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d1 = in.nextInt();
        int m1 = in.nextInt();
        int y1 = in.nextInt();
        int d2 = in.nextInt();
        int m2 = in.nextInt();
        int y2 = in.nextInt();
        libraryFine(d1,m1,y1,d2,m2,y2);
    }
}
