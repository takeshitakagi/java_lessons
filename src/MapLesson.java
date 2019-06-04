import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapLesson {

	static void Map() {
		Map<Integer, String> users = new HashMap<Integer, String>();
		users.put(1, "taro");
		users.put(2, "hanako");
		users.put(3, "masaru");
		users.put(4, "masayo");

		System.out.println("Mapに格納されているデータの数は：" + users.size() + "です");

		System.out.println(" ");

		for (Entry<Integer, String> u : users.entrySet()) {
			System.out.println(u.getKey() + ":" + u.getValue());
		}

		System.out.println(" ");

		users.forEach((key, value) -> {
			System.out.println("キーは" + key + "で、値は" + value);
		});
	}

}
