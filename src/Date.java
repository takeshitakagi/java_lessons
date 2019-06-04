import java.time.LocalDate;

public class Date {

	static void dayOfWeekNYearsLater(int i) {
		LocalDate d = LocalDate.now();
		System.out.println("今日の" + i + "年後の曜日は" + d.plusYears(i).getDayOfWeek() + "です");
	}

}
