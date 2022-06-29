package practice;
//インタフェース実装、自然順序以外の並び順を定義
import java.util.Comparator;
// 比較するクラスを<>に指定。タイトル順に並び替える
public class TitleComparator implements Comparator<Book>{
	public int compare(Book x, Book y) {
		// x.getTitleとy.getTitleのどちらが辞書順か比べている
		return x.getTitle().compareTo(y.getTitle());
	}

}
