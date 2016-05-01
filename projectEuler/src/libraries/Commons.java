package libraries;

import java.util.ArrayList;
import java.util.Iterator;

public class Commons {

	
	/********************Numeros Primmos*******************************/
		
	public boolean esPrimo(int numero){	
		int contador = 2;
		boolean primo=true;
		 
		while ((primo) && (contador!=numero)){
		  if (numero % contador == 0){
			  primo = false;	  
		  }
		  contador++;
		}
		return primo;
	}
	
	
	public ArrayList<Integer> primos(int n) {		
	    ArrayList<Integer> primos = new ArrayList<Integer>();
	    primos.add(1);
	    for (int i = 2; i < n; i++) {
	    	if(esPrimo(i)){
	    		 primos.add(i);
	    	}
	    	/*if(primos.size() == 10002){
	    		System.out.println("El 10001 primo es: "+i);
	    		System.out.println("Tamaño de la lista: "+primos.size());
	    		break;
	    	}*/
			
		}	    	    
	    System.out.println(primos);
	    return(primos);
	}
	
	public boolean esMultiplode3o5(int n){
		return(n%3==0 || n%5==0);		
	}
	
	public ArrayList<Integer> sumaDeMultiplosDe3o5(int n) {
		ArrayList<Integer> multiplos = new ArrayList<Integer>();
		for (int i = 2; i <n; i++) {
			if (esMultiplode3o5(i)){
			multiplos.add(i);
			}
			
		}
		
		double sum = 0;
		for(int j = 0; j < multiplos.size(); j++){
		    sum += multiplos.get(j);
		}
		
		
		System.out.println(multiplos);
	    System.out.println("La suma es: "+sum);
	    return(multiplos);
	}
	
	
	public boolean esPrimoLong(long numero){	
		long contador = 2;
		boolean primo=true;
		 
		while ((primo) && (contador!= Math.abs(numero/2))){
		  if (numero % contador == 0){
			  primo = false;	  
		  }
		  contador++;
		}				
		return primo;
	}
	
	public void primeFactors(long n){				
		long mayorFactorPrimo=0;		
		for (long j = 2; j < Math.abs(n); j++) {
			if(n%j ==0){
				if(esPrimoLong(j)){
					mayorFactorPrimo = j;
					System.out.println("Intermedio: "+ mayorFactorPrimo);
				}
			}
			
		}
		System.out.println("El mayor factor primo es: "+ mayorFactorPrimo);
		
	}
	
	
	
/********************FIBONACCI*******************************/	
	
	public int fibonacciNumber(int n) {
		
		if (n==1){return 1;}
		else if (n==2){return 2;}
		else{return fibonacciNumber(n-1)+fibonacciNumber(n-2);}
		
	}
	
	
	public ArrayList<Integer> fibonacci(int n) {
		ArrayList<Integer> fibo = new ArrayList<Integer>();		
		for (int i = 1; i <= n; i++) {
			int corte = fibonacciNumber(i); 
			if(corte>4000000){
			System.out.println("MAYOR A 4000000: "+ corte );
			break;
			}
			fibo.add(corte);			
		}		
		System.out.println(fibo);
	    return(fibo);
	}

	
	
	
	public int evenFibonacciNumbers(ArrayList<Integer> fiboTotales) {
		
		ArrayList<Integer> fiboPar = new ArrayList<Integer>();		
		int evenSum=0;
		
		for (int i = 0; i < fiboTotales.size(); i++) {
			if(fiboTotales.get(i)%2 == 0){
				evenSum += fiboTotales.get(i);
			}
		}

		
		
		System.out.println(fiboPar);
		System.out.println(evenSum);
	    return evenSum;
	}
	
	
	
	public void sumaFacilFibonacci() {
		
		int b = 1;
		int c = 2, d;
		long sum = 0;
		while(c < 4000000) {
		    sum += c;
		    d = b+(c<<0x01);
		    c = d+b+c;
		    b = d;
		}
		System.out.println(sum);
	}

	
	
	/********************palindromic*******************************/
	
	public boolean isPalindrome(int n){
		boolean result = true;
		
		ArrayList<Integer> digits = new ArrayList<Integer>();
		 while (n > 0) {
		     digits.add(n%10);
		     n/=10;
		 }
		
		 
		for (int i = 0; i < digits.size(); i++) {
			if(digits.get(i)!=digits.get(digits.size()-i-1)){
				result = false;
			}
			
		}
		//System.out.println(result);
		return result;
	}
	
	
	public void largestPalindromeProduct(){	
		int multiplo=0;
		int multiploCapicua=0;
		for (int i = 100; i <=999; i++) {
			for (int j = 100; j <=999; j++) {
				multiplo = i*j;
				if(isPalindrome(multiplo)){
					multiploCapicua= Math.max(multiplo, multiploCapicua);
				}
				
			}
		}
		System.out.println(multiploCapicua);
	}
	
	
	
	public void smallestMultiple(){
		
		int thershold =999999999;		
		int counter =1;		
		int counter2 =1;
		int result = 0;		
		
		while (counter<thershold){
			counter2=0;
			for (int i = 1; i <= 20; i++) {
				if(counter%i==0){										
					counter2++;
				}
				if(counter2==20){
					result = counter;
					counter=thershold;
					break;
				}
			
			}

					
			counter++;
		}
		System.out.println(result);
		
	}
	
	
	
	
	public void sumSquareDifference(){
		
		long sumaDePotencias=0;
		long potenciaDeSumas=0;
		for (long i=0;i<=100;i++){
			sumaDePotencias += i*i;
		}
		
		for (long i=0;i<=100;i++){
			potenciaDeSumas += i;
		}
		potenciaDeSumas=potenciaDeSumas*potenciaDeSumas;
		long diferencia = potenciaDeSumas-sumaDePotencias;
		
		System.out.println("sumaDePotencias: " +sumaDePotencias);
		System.out.println("potenciaDeSumas: " +potenciaDeSumas);
		System.out.println("diferencia: " +diferencia);
		
	}
	
	/******PROBLEM 8*******/
	
	public void largestProduct(){
		
		String archivo ="7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
		//System.out.println(archivo.length());
		//System.out.println(archivo.substring(0, 1));
		long largestProduct = 0;

		for (int i = 0; i < archivo.length()-13; i++) {
			long producto =1;
			for (int j = i; j < i+13; j++){
				producto *= Integer.parseInt(archivo.substring(j, j+1));
			}
			if (producto > largestProduct) largestProduct = producto;
			
			
		}
		System.out.println(largestProduct);
	}
	
}
