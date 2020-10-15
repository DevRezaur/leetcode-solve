class Solution {

	public String defangIPaddr(String address) {
		int len = address.length();
		String result = "";

		for (int i = 0; i < len; i++) {
			char ch = address.charAt(i);

			if (ch == '.')
				result += "[.]";
			else
				result += ch;
		}
    
		return result;
	}
  
}
