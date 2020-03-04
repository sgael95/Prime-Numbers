package primeNumbers;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrimeNumbersDriver {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = scanner.nextInt();
		SieveOfEratosthenes sieve = new SieveOfEratosthenes();
		sieve.primes(n, "example.txt");
		System.out.println("Result of all prime numbers before the number given are"
				+ " printed on example.txt file.");
		
	}

}
