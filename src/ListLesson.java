import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListLesson {

	public static void list() {
		List<String> enemies = new ArrayList<>();

		enemies.add("スライム");
		enemies.add("ドラゴン");
		enemies.add("ゴーレム");

		for (String e : enemies) {
			System.out.println(e + "が現れた!!");
		}

	}

	//1から10の間で偶数だけを表示する
	public static void list2() {
		List<Integer> integersList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		integersList.stream()
				.filter(i -> i % 2 == 0)
				.forEach(i -> System.out.print(i));
	}

}
