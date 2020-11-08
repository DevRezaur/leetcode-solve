class Solution {

	public String restoreString(String s, int[] indices) {
		int len = indices.length;
		char str[] = s.toCharArray();

		for (int i = 0; i < len - 1; i++) {
			for (int j = 0; j < len - 1 - i; j++) {
				if (indices[j] > indices[j + 1]) {
					int temp = indices[j];
					indices[j] = indices[j + 1];
					indices[j + 1] = temp;

					char ch = str[j];
					str[j] = str[j + 1];
					str[j + 1] = ch;
				}
			}
		}

		return new String(str);
	}
  
}
