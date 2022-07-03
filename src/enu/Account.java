package enu;

public class Account {
	private String accountNo;
	private int zandaka;
	// 口座種別を列挙型で受け取り格納
	private AccountType accountType;
	// これなら絶対に間違った値は入らないし、メソッド宣言を見ただけで
	// 第二引数が「口座種別」を期待していることがわかる
	public Account(String aNo, AccountType aType) {
		this.accountNo = aNo;
		this.accountType = aType;
	}
	
	public String getAccountNo() {
		return this.accountNo;
	}
	public int getZandaka() {
		return this.zandaka;
	}
	public void setZandaka(int zandaka) {
		this.zandaka = zandaka;
	}
	//列挙型のを戻り値としている
	public AccountType getAccountType() {
		return accountType;
	}
}
