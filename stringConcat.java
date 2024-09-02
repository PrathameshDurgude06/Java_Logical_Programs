//concat two differrent strings and print that string
package coding;
import java.util.Arrays;
import java.util.Scanner;

public class stringConcat {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a string First string :");
			String str1 = sc.nextLine();
			System.out.println("Enter a string Second string :");
			String str2 = sc.nextLine();

			String arr1[] = str1.split(" ");
			String arr2[] = str2.split(" ");
			int count = 0;
			String concatedArray[] = new String[arr1.length + arr2.length];
			for (int i = 0; i < arr1.length; i++) {
				concatedArray[i] = arr1[i];
				count++;
			}
			for (int i = 0; i < arr2.length; i++) {
				concatedArray[count] = arr2[i];
				count++;
			}

			System.out.println("Concated " + Arrays.toString(concatedArray));
			String resultString = String.join(" ", concatedArray);
			String result=resultString.trim();
			System.out.println("The concatenated string is:" + result);

		}
}
