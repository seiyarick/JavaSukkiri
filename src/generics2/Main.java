package generics2;

// Pocketクラスを利用するプログラム
public class Main {
	public static void main(String[] args) {
		// Pocketクラスを参照してpインスタンスを生成（コンストラクタなし）
		Pocket p = new Pocket();
		// Poketクラスのdataに"1192"をセット
		p.put("1192");
		// PocketクラスのgetメソッドからくるデータをString型のsに格納
		String s = (String)p.get();
		// sを出力
		System.out.println(s);
	}

}
