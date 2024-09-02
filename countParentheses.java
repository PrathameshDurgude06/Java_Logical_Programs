//Count Immediate Closing Parentheses from given String
package coding;

public class countParentheses {
	
	public static int immediateClosingParentheses(String s) {
		
		int count = 0;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == '(' && s.charAt(i + 1) == ')') {
				count++;
			}
		}
		return count;
	}
	
	public static void main (String[] args) {
		String s = "[(()(()()()))]";
		int result = immediateClosingParentheses(s);
		System.out.println(result);
	}
}
