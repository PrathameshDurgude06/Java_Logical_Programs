package coding;

public class NearestPalindrome {

	public static int nearestPalindrome(int n) {
		for(int i = 0; ;i++) {
			if(isPalindrome(n - i)) {
				return n - i;
			}
			if(isPalindrome(n + i)) {
				return n + i;
			}
		}
	}
	
	public static boolean isPalindrome(int n) {
		String s = Integer.toString(n);
		int l = s.length();
		for(int i = 0; i < l / 2; i++) {
			if(s.charAt(i) != s.charAt(l - i -1)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(nearestPalindrome(129));
		System.out.println(nearestPalindrome(135));
	}
}
