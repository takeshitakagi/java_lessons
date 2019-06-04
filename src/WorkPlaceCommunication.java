
public class WorkPlaceCommunication implements Communication {

	private String placeName;

	public WorkPlaceCommunication(String place) {
		this.placeName = place;
	}

	@Override
	public void greet(String greeting, String person) {
		if (this.placeName == "職場" && person == "同僚") {
			if (greeting == "こんにちは") {
				System.out.println("「こんにちは」");
			} else {
				System.out.println("「・・・」");
			}
		} else if (this.placeName == "職場" && person == "上司") {
			if (greeting == "ご苦労様") {
				System.out.println("「お疲れ様です」");
			} else {
				System.out.println("「・・・」");
			}
		} else {
			System.out.println("「ここは職場じゃないし、知らない人だから愛想笑いをする」");
		}
	}

}
