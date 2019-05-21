import java.time.LocalDate;

public class Date {

	//3年後の今日の曜日を表示する
	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		System.out.println("今日の日付は" + d + "です");
		System.out.println("今日の曜日は" + d.getDayOfWeek() + "です");
		LocalDate d3 = d.plusYears(3);
		System.out.println("3年後の今日の日付は" + d3 + "です");
		System.out.println("3年後の今日の曜日は" + d3.getDayOfWeek() + "です");
	}

}
