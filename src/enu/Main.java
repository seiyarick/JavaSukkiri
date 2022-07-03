package enu;

public class Main {
	public static void main(String[] args) {
		//Accountクラスを参照してa1インスタンスを生成。第二引数でAccountTypeの定数FUTSUを
		Account a1 = new Account("1732050", AccountType.FUTSU);
		System.out.println("口座番号は" + a1.getAccountNo() + "です");
		System.out.println("口座番号は" + a1.getAccountType() + "です");
	}

}
