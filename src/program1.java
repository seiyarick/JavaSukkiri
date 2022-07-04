// 課題 1-1
// 1から100までの整数を全て足す計算プログラムを作成してください

public class program1 {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
