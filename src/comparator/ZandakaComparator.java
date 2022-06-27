package comparator;

// コンパレータ並べ替えのルール。
// 二つのインスタンスに関する大小の比較方法
import java.util.Comparator;

// 残高順を実装したコンパレータ
public class ZandakaComparator implements Comparator<Account> {// 比較するクラスを<Account>で指定する
	public int compare(Account x, Account y) {
		return (x.zandaka - y.zandaka);
	}

}
