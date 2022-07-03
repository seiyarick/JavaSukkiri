package account;
// 【以下のソースコードの懸念点】
// newするとき口座種別に「その他」「null」が指定できてしまう
// 口座種別とは関係のないさまざまな文字列を指定できてしまう余地があることは、
// 型安全の見地から好ましくない

public class Main {
	public static void main(String[] args) {
		// Accountクラスのコンスラクタを参照してa1インスタンスを生成。
		Account a1 = new Account("1732050", "普通");
		System.out.println("口座番号は" + a1.getAccountNo() + "です");
		System.out.println("口座番号は" + a1.getAccountType() + "です");
	}

}
