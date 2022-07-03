package account2;

public class Main {
	public static void main(String[] args) {
		// インスタンス生成時にAccountクラスの定数を第二引数に
		Account a1 = new Account("1732050", Account.FUTSU);
		System.out.println("口座番号は" + a1.getAccountNo() + "です");
		
		System.out.println("口座種別は" + a1.getAccountType() + "です");
	}

}
