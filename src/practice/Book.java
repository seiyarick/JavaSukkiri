package practice;

import java.util.Date;
import java.util.Objects;
// 自然順序付のためのcomparable<Book>
// インスタンス複製のためのCloneable
public class Book implements Comparable<Book>, Cloneable{
	private String title;
	private Date publishDate;
	private String comment;
	
	// hashCode()をオーバーライド。objectクラスから継承されるため
	public int hashCode() {
		return Objects.hash(this.title, this.publishDate, this.comment);
	}
	// equalsをオーバーライドして正しく等価を判定できるようにする
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null) {
			return false;
		}
		//変数oに入っているデータはBookの型と同じか比べている。もしBookでなければfalseを返す。
		if(!(o instanceof Book)) {
			return false;
		}
		Book b = (Book)o;
		if(!publishDate.equals(b.publishDate)) {
			return false;
		}
		if(!title.equals(b.title)) {
			return false;
		}
		return true;
	}
	// 引数で渡されたインスタンスoと自分自身を比較しその大小関係を判定する
	public int compareTo(Book o) {
		// 変数1.compareTo(変数2)
		// メソッドの呼び出し元の値(変数1)が、引数の値(変数2)より小さい場合は”負の値”
		// メソッドの呼び出し元の値(変数1)が、引数の値(変数2)より大きい場合は”正の値”
		// メソッドの呼び出し元の値(変数1)が、引数の値(変数2)と同じ場合は”0”
		return this.publishDate.compareTo(o.publishDate);
	}
	
	public Book clone() {
		Book b = new Book();
		b.title = this.title;
		b.comment = this.comment;
		b.publishDate = (Date)this.publishDate.clone();
		return b;
		}
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Date getPublishDate() {
		return this.publishDate;
	}
	
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	
	public String getComment() {
		return this.comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

}
