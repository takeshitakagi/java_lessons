
public class Judge {

	public static void main(String[] args) {
		judge(0);
		judge(1);
	}

	public static void judge(int n) {
		if(n == 0) {
			System.out.println("nの値は" + n + "なので偽です");
		}else if(n == 1) {
			System.out.println("nの値は" + n + "なので真です");
		}
	}

}
