package memberclass;

public class Main {
	public static void main(String[] args) {
		// 無関係なクラスからは「外部クラス名.メンバクラス名で利用」
		// Outer.Inner  OuterのInner
		// 外部クラスのメンバにアクセスできるがstaticなものに限る
		Outer.Inner ic = new Outer.Inner();
		
	}

}
