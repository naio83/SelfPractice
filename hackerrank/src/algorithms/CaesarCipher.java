/**
 * 
 */
package algorithms;

import java.util.Scanner;

/**
 * @author naio
 *
 */
public class CaesarCipher {

	 static void cc(int stringLengh, String texto, int k){
		
		 
		 for(int i=0; i< texto.length(); i++){
			 System.out.println(texto.charAt(i));
		 }
		 
		 
		 char letra = texto.charAt(0);
		 
		 int letraAscii = (int) letra;
		 
		 System.out.println(letraAscii);
		 
		 letraAscii += 2;
		 letra = (char) letraAscii;
		 System.out.println(letraAscii);
		
		
	}
	
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        cc(n, s, k);

	}

}
