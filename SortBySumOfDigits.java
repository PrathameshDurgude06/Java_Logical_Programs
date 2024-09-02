package coding;

import java.util.Arrays;

public class SortBySumOfDigits {
	
	public static void sortBySum(Integer[] arr) {
	
		Arrays.sort(arr, (a, b) -> {
			int sumA = sumOfDigits(a);
			int sumB = sumOfDigits(b);
			if( sumA != sumB) {
				return sumA - sumB;
			}
			
			return a - b;
			
		});
	}
	
	public static int sumOfDigits(int n) {
		int sum = 0;
		while(n > 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Integer[] arr = {24,30,100,45,60};
		sortBySum(arr);
		System.out.println(Arrays.toString(arr));
	}
}
