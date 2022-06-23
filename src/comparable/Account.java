package comparable;

//開発するクラスに自然順序を求められるならば、Comparableを実装しておくことで、並び替えなどが便利に行えるようになる
public class Account implements Comparable<Account>{// class クラス名 implements インターフェース名 { ・・・ }
	int number; //口座番号
	int zandaka; // 残高
	// compareTo()は引数で渡されたインスタンスobjと自分自身を比較し大小関係を判定する
	// このメソッドを使って自然順序付の方法を宣言
	public int compareTo(Account obj) {
		if (this.number < obj.number) {
			return -1;
		}
		if (this.number > obj.number) {
			return 1;
		}
		return 0;
	}
	

}
