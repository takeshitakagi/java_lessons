import java.time.LocalDate;

public class Date {

	static void dayOfWeekNYearsLater(int i) {
		LocalDate date = LocalDate.now();
		System.out.println("今日の" + i + "年後の曜日は" + date.plusYears(i).getDayOfWeek() + "です");
	}

}
