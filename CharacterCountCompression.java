package coding;

public class CharacterCountCompression {

	public static String compressString(String s) {
		int count = 1;
		StringBuilder result = new StringBuilder();
		for(int i = 1; i < s.length(); i++) {
			if(s.charAt(i) == s.charAt(i - 1)) {
				count++;
			}else {
				result.append(s.charAt(i - 1)).append(count);
				count=1;
			}
		}
		
		result.append(s.charAt(s.length() - 1)).append(count);
		
		return result.toString();
	}
	
	public static void main(String[] args) {
		String s = "aaabbbbbccdddd";
		String result = compressString(s);
		System.out.println(result);

	}

}
