package equals2;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Hero> list = new ArrayList<>();// ダイヤモンド演算子List,ArrayList
		Hero h1 = new Hero();
		h1.name = "ミナト";
		list.add(h1); // インスタンスを作って格納,Listクラスのaddメソッドを使用（単数の値をリストに追加するメソッド）
		System.out.println(h1.name);
		System.out.println("要素数=" + list.size()); // 「sizeメソッド=>要素数を確認」
		h1 = new Hero();
		h1.name = "ミナト";
		list.remove(h1); // 「remove()メソッド=>これと同じものを削除して」名前が"ミナト"の勇者を削除
		System.out.println("要素数=" + list.size());// [要素数=0]になってほしいが結果は[要素数=1]
	}

}
