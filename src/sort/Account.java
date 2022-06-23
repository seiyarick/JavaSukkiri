package sort;

public class Account {
	String accountNo; //口座番号（先頭に空白が入ることがある）
	
	public boolean equals(Object o) {
		if (o == this) return true;
		if (o == null) return false;
		if (!(o instanceof Account)) return false; // oがAccountクラスか判定。もしAccountクラスでなければfalseを返す
		Account r = (Account) o; //AccountクラスのrにAccountクラスのoをキャスト
		if (!this.accountNo.trim().equals(r.accountNo.trim())) {
			return false;
		}
		return true;
	}

}
