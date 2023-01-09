package Lab3;

import java.util.Scanner;

public class Lab3_2 {
	
	public static boolean checkPrime(int n) { 
		boolean check = false; 
		if (n>2) { 
		check = false; 
		} 
		for (int i = 2;i<n;i++) { 
			if (n%i==0) { 
				check = false; 
				break; 
		} 	else { 
			check = true; 
			} 
			} 
		return check; 
	} 
	
	public static boolean checkPerfect(int n) { 
		boolean check = false; 
		int sum = 0; 
		for (int i = 1;i<n;i++) { 
			if (n % i == 0) { 
				sum += i; 
				if (sum == n) { 
					check = true; 
					break; 
		} 
		}
			else { 
				check = false; 
			} 
		} 	 
		return check; 
	} 
	

}
