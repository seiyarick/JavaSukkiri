package generics2;

// 
public class Pocket {
	private Object data;
	
	// Mainクラスからの引数をフィールドにセットメソッド
	public void put(Object d) {
		this.data = d;
	}
	// Mainクラスにフィールドを渡すメソッド
	public Object get() {
		return this.data;
	}

}
