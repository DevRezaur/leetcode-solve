import java.util.HashSet;
import java.util.Set;

class Solution {

	public int uniqueMorseRepresentations(String[] words) {
		if (words == null)
			return 0;

		if (words.length == 1)
			return 1;

		Set<String> temp = new HashSet<String>();
		final String[] morseCode = new String[] { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
				".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--",
				"-..-", "-.--", "--.." };

		for (String s : words) {
			String code = getCode(s, morseCode);
			temp.add(code);
		}

		return temp.size();
	}

	public String getCode(String word, String morseCode[]) {
		String code = "";

		for (char ch : word.toCharArray()) {
			int x = Character.getNumericValue(ch) - 10;
			code += morseCode[x];
		}

		return code;
	}

}
