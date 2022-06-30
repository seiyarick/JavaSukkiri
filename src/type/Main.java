package type;

// 型の仕組みがないプログラム
public class Main {
	// printsメソッド
	// 第一引数の文字列を第二引数の回数だけ表示する
	// 第一引数には文字列の情報を。第二引数には整数を指定してください
	public static void prints(Object a, Object b) {
		for (int i = 0; i < (int)b; i++) {
			System.out.println(a);
		}
	}
	public static void main(String[] args) {
		// sには文字列も格納可能
		Object s = "こんにちは";
		s = new Hero();
		Object n = 1;
		// 注意深く呼び出す必要がある
		prints(s,n);
	}
	

}
