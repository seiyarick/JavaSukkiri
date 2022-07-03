package account;
// 【以下のソースコードの懸念点】
// newするとき口座種別に「その他」「null」が指定できてしまう


public class Main {
	public static void main(String[] args) {
		// Accountクラスのコンスラクタを参照してa1インスタンスを生成。
		Account a1 = new Account("1732050", "");
		System.out.println("口座番号は" + a1.getAccountNo() + "です");
		System.out.println("口座番号は" + a1.getAccountType() + "です");
	}

}
