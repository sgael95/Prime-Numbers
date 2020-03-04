package primeNumbers;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class SieveOfEratosthenes {
	public void primes(int n, String fileName) throws FileNotFoundException {
	       boolean[] primes = new boolean[n + 1];
	       for (int i = 2; i < primes.length; i++) {
	           primes[i] = true;
	       }
	       int num = 2;
	       while (true) {
	           for (int i = 2;; i++) {
	               int multiple = num * i;
	               if (multiple > n) {
	                   break;
	               } else {
	                   primes[multiple] = false;
	               }
	           }
	           boolean nextNumFound = false;
	           for (int i = num + 1; i < n + 1; i++) {
	               if (primes[i]) {
	                   num = i;
	                   nextNumFound = true;
	                   break;
	               }
	           }
	           if (!nextNumFound) {
	               break;
	           }
	       }
	       PrintWriter outputfile = new PrintWriter(fileName);
	       for (int i = 0; i < primes.length; i++) {
	           if (primes[i]) {
	               outputfile.print(i + " ");
	           }
	       }
	       outputfile.close();
	}
}
