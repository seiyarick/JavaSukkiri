package localclass;

public class Outer {
	int outerMenber = 2; // 非finalメンバ（再代入がなく実質的にfinal
	void outerMethod() {
		int a = 10;  // 非finalローカル変数
		// ローカルクラス(Inner)を宣言
		class Inner{
			public void innerMethod() {
				System.out.println("innerMethodです");
				// ローカルクラスの内部からouterMenberは利用可能
				// 変数aは暗黙的にfinalとして扱われるため利用できている
				System.out.println(outerMenber + a);
			}
		}
		// 同じメソッド内ですぐ利用しなければならない
		Inner ic = new Inner();
		ic.innerMethod();
	}

}
