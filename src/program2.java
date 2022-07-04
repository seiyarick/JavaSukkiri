// 課題 1-2
// 2から100までの偶数のみを全て足す計算プログラムを作成してください
public class program2 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 2; i <= 100; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
