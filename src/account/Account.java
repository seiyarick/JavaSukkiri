package account;

//口座クラス（湊ver.）
//『利用例』new Account("172050", "普通");
public class Account {
	private String accountNo;
	private int zandaka;
	// 口座種別を文字列で受け取り格納
	private String accountType;
	public Account(String aNo, String aType) {
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
	public String getAccountType() {
		return this.accountType;
	}

}
