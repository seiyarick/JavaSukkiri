package equals;

public class Account {
	String accountNo; // 口座番号（先頭に空白が入ることがある）
	
	public boolean equals(Object o) { // 引数はObject型にすること
		// (1)自分自身が引数として渡されたら、無条件でtrueを返す
		if (o == this) return true;
		// (2)nullが引数として渡されたら、無条件でfalseを返す
		if(o == null) return false;
		// (3)方が異なるならば、falseを返す（同じならば(4)に備え、比較できるように適切にキャストする）
		if(!(o instanceof Account)) return false;
		Account r = (Account)o;
		// 2つのインスタンスが持つしかるべきフィールド同士を比較して等価か判定し、trueかfalseを返す。
		if(!this.accountNo.trim().equals(r.accountNo.trim())) {
			return false;
		}
		return true;
	}

}
