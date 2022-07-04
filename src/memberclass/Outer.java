package memberclass;

// static月のメンバクラスの利用例
//
public class Outer {
	int outerField;
	static int outerStaticField;
	// メンバクラスを宣言（クラスブロックの中、フィールドやメソッドの隣）
	static class Inner{
		void innerMethod() {
			// staticな外部クラスのみ利用可
			outerStaticField = 10;
		}
	}
	void outerMethod() {
		// 外部クラスからはクラス名で利用可
		Inner ic = new Inner();
	}

}
