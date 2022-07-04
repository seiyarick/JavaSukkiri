package anonymous;

public class Main {
	public static void main(String[] args) {
		Pocket<Object> pocket = new Pocket<>();
		System.out.println("使い捨てのインステンスを作りpocketに入れます");
		// ＊匿名クラスの宣言兼利用
		// new 匿名クラスの親クラスの指定(){
		//   匿名クラスの内容(メンバ)定義
		// }
		pocket.put(new Object() {
			String innerField;
		void innerMethod() {}	
		});
	}

}
