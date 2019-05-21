import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HelloWorld {

	//メインメソッド
	public static void main(String[] args) {

	//変数を使ってHelloWorldを表示させる
	String greeting;
	greeting = "HelloWorld";
	System.out.println(greeting);

	//1〜10を足した結果を表示する
	System.out.println("1〜10まで足した合計は" + tasu(10) + "です");

	//3年後の今日の曜日を表示する
	LocalDate d = LocalDate.now();
	System.out.println("今日の日付は" + d + "です");
	System.out.println("今日の曜日は" + d.getDayOfWeek() + "です");
	LocalDate d3 = d.plusYears(3);
	System.out.println("3年後の今日の日付は" + d3 + "です");
	System.out.println("3年後の今日の曜日は" + d3.getDayOfWeek() + "です");

	//引数で真か偽か分ける
	tf(0);

	//リスト
	List<String>list = new ArrayList<String>();
	list.add("りんご");
	list.add("みかん");
	System.out.println(list.get(0));
	}

	//足し算メソッド
	public static int tasu(int num) {
		int sum = 0;
		for(int i = 0; i <= num; i++) {
			sum += i;
		}
		return sum;
	}

	//引数で真か偽か分けるメソッド
	public static void tf(int n) {
		if(n == 0) {
			System.out.println("nの値は" + n + "なので偽です");
		}else if(n == 1) {
			System.out.println("nの値は" + n + "なので真です");
		}
	}
}
