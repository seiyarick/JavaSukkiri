package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
	public static void main(String[] args) {
		List<Account> list = new ArrayList<>();// ArrayListのインスタンスを生成
		Account a1 = new Account();
		Account a2 = new Account();
		a1.number = 200;
		a2.number = 100;
		list.add(a1); //addメソッドで要素をArrayListにa1を追加
		list.add(a2);
		
		System.out.println("ソート前：");
		for (Account a :list) {
			System.out.println(a.number);
		}
		Collections.sort(list);// Collectionクラスのsort()は中身の要素の順番を並び替えてくれるメソッド
		
		System.out.println("ソート後：");
		for (Account a: list) {// 『拡張for文』(要素の型 任意の変数名 : 配列・コレクション名)
			System.out.println(a.number);
		}
	}

}
