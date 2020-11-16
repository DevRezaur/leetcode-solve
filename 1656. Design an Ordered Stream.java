import java.util.ArrayList;
import java.util.List;

class OrderedStream {

	int ptr;
	String[] result;

	public OrderedStream(int n) {
		ptr = 0;
		result = new String[n];
	}

	public List<String> insert(int id, String value) {
		result[id - 1] = value;

		List<String> list = new ArrayList<String>();

		while (ptr < result.length && result[ptr] != null) {
			list.add(result[ptr++]);
		}

		return list;
	}
  
}
