
public class Tasu {
	
	//1〜10を足した結果を表示する
	public static void main(String[] args) {
		System.out.println("1〜10まで足した合計は" + tasu(10) + "です");
	}

	public static int tasu(int num) {
		int sum = 0;
		for(int n = 0; n <= num; n++) {
			sum += n;
		}
		return sum;
	}

}
