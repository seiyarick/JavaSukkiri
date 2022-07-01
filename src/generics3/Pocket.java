package generics3;

// code2-4
// 仮型引数を伴うクラス宣言<E>
//public class Pocket<E> {
// 
//	private E data;
//	
//	public void put(E d) {
//		this.data = d;
//	}
//	
//	public E get() {
//		return this.data;
//	}
//
//}

// code2-5
public class Pocket<String>{
	private String data;
	public void put(String d) {
		this.data = d;
	}
	public String get() {
		return this.data;
	}
}
