import java.util.Arrays;

class Solution {

	int size = 256;

	public boolean isIsomorphic(String s, String t) {
		long x = s.length();
		long y = t.length();

		if (x != y)
			return false;

		Boolean visited[] = new Boolean[size];
		Arrays.fill(visited, false);

		int mapped[] = new int[size];
		Arrays.fill(mapped, -1);

		for (int i = 0; i < x; i++) {
			if (mapped[s.charAt(i)] == -1) {
				if (visited[t.charAt(i)] == true)
					return false;

				mapped[s.charAt(i)] = t.charAt(i);
				visited[t.charAt(i)] = true;

			} else if (mapped[s.charAt(i)] != t.charAt(i)) {
				return false;
			}
		}

		return true;
	}
}
