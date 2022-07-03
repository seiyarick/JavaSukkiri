package generics4;
// クラス宣言時にはEやKという仮の型名を指定しておく
public class Pocket<E> {
	private E data;
	public void put(E d) {
		this.data = d;
	}
	public E get() {
		return this.data;
	}

}
