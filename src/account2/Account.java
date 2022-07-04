package account2;

public class Account {
	private String accountNo;
	private int zandaka;
	// int型にすることでnullが入らないようにしている
	private int accountType;
	public Account(String aNo, int aType) {
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
		// tmpAccounTypeに初期値で""を代入
		String tmpAccountType = "";
		// もしフィールドのaccountTypeに整数１が入っていれば
		if (this.accountType == 1) {
			// 初期値が""のtmpAccountTypeに"普通を代入"
			tmpAccountType = "普通";
		}else if (this.accountType == 2) {
			tmpAccountType = "当座";
		}else if (this.accountType == 3) {
			tmpAccountType = "定期";
		}
		// accountTypeを戻り値として返す
		return tmpAccountType;
	}
	// 定数宣言
	
	public static final int FUTSU = 1;
	public static final int TOUZA = 2;
	public static final int TEIKI = 3;

}
