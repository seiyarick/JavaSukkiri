package equals3;

import java.util.Arrays; // 配列操作関連の便利なメソッド集

//import java.util.Collections; //コレクション関連の便利なメソッド集

public class Main {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {1, 2, 3, 4, 5};
		// 等値判定になる
		System.out.println("誤った判定：" + a.equals(b));
		// 二つの配列を等価判定したい場合はjava.util.Arraysクラスの静的メソッドequals()を使う
		System.out.println("正しい判定：" + Arrays.equals(a, b));
	}

}
