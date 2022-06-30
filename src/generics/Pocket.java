package generics;
// ジェネリクスを使わないPocketクラス（java1.4まで）
// どんな型のインスタンスでも格納できる
// 格納するためのputメソッド、取り出すためのgetメソッドがある
public class Pocket {
	private Object data;
	// 格納するためのput()メソッド
	public void put(Object d) {
		this.data = d;
		}
	// 取り出すためのget()メソッド
	public Object get() {
		return this.data;
		}

}
