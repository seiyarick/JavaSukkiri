package generics4;

public class Main {
	public static void main(String[] args) {
		// クラスの使用時にStringなどの実際の方を入力する
		Pocket<String> p = new Pocket<>();
		p.put("1192");
		String s = p.get();
		System.out.println(s);
	}

}
