import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

	public String destCity(List<List<String>> paths) {
		Map<String, String> map = new HashMap<String, String>();

		for (List<String> path : paths) {
			map.put(path.get(0), path.get(1));
		}

		String source = paths.get(0).get(0);

		while (true) {
			String destination = map.get(source);
			if (destination == null)
				return source;
			else
				source = destination;
		}

	}
  
}
