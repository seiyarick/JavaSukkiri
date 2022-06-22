package hashCode;

public class Main {
	public static void main(String[] args) {
		Hero h1 = new Hero();
		h1.name = "ミナト";
		h1.hp = 100;
		System.out.println(h1.hashCode()); //385106280 
		
		Hero h2 = new Hero();
		h2.name = "太郎";
		h2.hp = 130;
		System.out.println(h2.hashCode()); //23086047
		h2.hp = 200;
		System.out.println(h2.hashCode());
		System.out.println(h2.hp);
		System.out.println(h2.hashCode()); //23086047
	}

}
