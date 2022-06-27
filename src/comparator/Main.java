package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Account> list = new ArrayList<>();
		Account a1 = new Account();
		Account a2 = new Account();
		Account a3 = new Account();
		a1.number = 200;
		a2.number = 100;
		a3.number = 300;
		a1.zandaka = 1000000;
		a2.zandaka = 500000;
		a3.zandaka = 100000;
		list.add(a1);
		list.add(a2);
		list.add(a3);
		
		System.out.println("ソート前：");
		for (Account a : list) {
			System.out.println(a.number);
		}
		// 自然順序の記述
		// 格納オブジェクト自体(Account)のcompareTo()を
		Collections.sort(list);
		
		System.out.println("自然順序でのソート後：");
		for (Account a :list) {
			System.out.println(a.number);
		}
		
		// 第二引数に指定された順で並び替える
		// 第一引数は並び替えたいコレクション。第二引数はコンパレータのインスタンス
		// 与えられたコンパレータ(new ZandakaComparator())のcompare()を呼び出し
		Collections.sort(list, new ZandakaComparator());
		System.out.println("残高順でのソート後");
		for (Account a :list) {
			System.out.println(a.number);
			System.out.println(a.zandaka);
		}
	}

}
