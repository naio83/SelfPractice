package warmup;

import java.util.Scanner;



/*
 * Aca uso un Xor, la idea es que 0 XOR X = X y que X XOR X= 0, es decir da TRUE si ambos son diferentes.
 * Entonces, voy comparando los elementos del array, y cuando llego al ultimo, ese da FALSE porque no es igual 
 * al anterior, y ese es el que se devuelve.
 * */


public class Lonelyinteger {
   static int lonelyinteger(int[] a) {
      
       int result=0;
       int longitud = a.length;
      for(int i=0;i<longitud;i++){
    		   result = result ^a[i];
    	   }
    	   
              
       return result;
    }
    
    
    
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        
        int _a_size = Integer.parseInt(in.nextLine());
        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");
        
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }
        
        res = lonelyinteger(_a);
        System.out.println(res);
        
    }
}

