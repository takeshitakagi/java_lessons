public class Practice {

	public static void main(String[] args) {

		//	課題1　変数を使って「こんにちは」を出力する
		System.out.println("課題1");
		System.out.println(" ");
		Hello.greet("太郎");

		//	課題2　1からNの和をだす
		System.out.println(" ");
		System.out.println("---------------------------------");
		System.out.println(" ");
		System.out.println("課題2");
		System.out.println(" ");
		Tasu.tasu(10);

		//	課題3　N年後の今日の曜日を出力する
		System.out.println(" ");
		System.out.println("---------------------------------");
		System.out.println(" ");
		System.out.println("課題3");
		System.out.println(" ");
		Date.dayOfWeekNYearsLater(3);

		//	課題4　引数によって真または偽と出力する
		System.out.println(" ");
		System.out.println("---------------------------------");
		System.out.println(" ");
		System.out.println("課題4");
		System.out.println(" ");
		Judge.judge(1);
		Judge.judge(0);

		//  課題5　リストを使ってみる
		System.out.println(" ");
		System.out.println("---------------------------------");
		System.out.println(" ");
		System.out.println("課題5");
		System.out.println(" ");
		ListLesson.list();
		System.out.println(" ");
		ListLesson.list2();
		System.out.println(" ");

		//  課題6　マップを使ってみる
		System.out.println(" ");
		System.out.println("---------------------------------");
		System.out.println(" ");
		System.out.println("課題6");
		System.out.println(" ");
		MapLesson.Map();

		//  課題7　職場でのコミュニケーション機能を作ってみる
		System.out.println(" ");
		System.out.println("---------------------------------");
		System.out.println(" ");
		System.out.println("課題7");
		System.out.println(" ");
		WorkPlaceCommunication com1 = new WorkPlaceCommunication("職場");
		com1.greet("こんにちは", "同僚");
		com1.greet("ご苦労様", "上司");
		com1.greet("ご苦労様", "他人");

	}

}
