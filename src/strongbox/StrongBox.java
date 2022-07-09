package strongbox;
// インスタンスの方は未定義
public class StrongBox<E> {
	// 鍵の種類を示すフィールド
	private KeyType keyType;
	// 金庫には一つのインスタンスを保存できる必要がある
	private E item;
	// 回数をカウントするための変数定義
	private long count;
	
	// 鍵の種類を受け取るコンストラクタ
	public StrongBox(KeyType key) {
		this.keyType = key;
	}
	// put()でインスタンスを保存しget()でインスタンスを取得できる
	public void put(E i) {
		this.item = i;
	}
	// get()で取得する際にキャストを行わなくても格納前の方に代入できる
	public E get() {
		// 金庫はget()が呼び出されるたびに回数をカウント
		this.count++;
		switch(this.keyType) {
		 case PADLOCK:
			 // 各鍵が定める必要施行回数に到達しない限りnullを返す
			 if (count < 1024) return null;
			 break;
		 case BUTTON:
			 if (count < 10000) return null;
			 break;
		 case DIAL:
			 if (count < 30000) return null;
			 break;
		 case FINGER:
			 if (count < 1000000) return null;
			 break;
		}
		this.count = 0;
		return this.item;
	}
}
