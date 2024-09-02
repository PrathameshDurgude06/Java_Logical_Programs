//Find nearest perfect square to given input integer and return difference between them as output 
package coding;

import java.util.Scanner;

public class ClosestPerfectSquare {
	
	public static int requiredCoin(int n) {
		
		int sqrt=(int) Math.floor(Math.sqrt(n));
		int lowestsqr=sqrt * sqrt;
		int uppersqr=(sqrt + 1)*(sqrt + 1);
		int diff= Math.abs(n - lowestsqr);
		
		if((Math.abs(n - uppersqr)) < diff) {
			diff=Math.abs(n - uppersqr);
		}
		return diff;
		
	}
	

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n=sc.nextInt();
			int result=requiredCoin(n);
			
			System.out.println(result);
		}
		
	}

}
