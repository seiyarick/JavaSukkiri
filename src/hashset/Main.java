package hashset;

import java.util.HashSet;
import java.util.Set;
public class Main {
	public static void main(String[] args) {
		Set<Hero> list = new HashSet<>();
		Hero h1 = new Hero();
		h1.name = "ミナト";
		list.add(h1); //Listクラスに要素h1を追加、インスタンスを作って格納
		System.out.println("要素数=" + list.size());
		h1 = new Hero();
		h1.name = "ミナト";
		list.remove(h1);// 名前がミナトの勇者を削除
		System.out.println("要素数=" + list.size());
		
	}

}
