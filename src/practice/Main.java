package practice;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws Exception{
		SimpleDateFormat f = new SimpleDateFormat("yyyy/mm/dd");
		ArrayList<Book> books =new ArrayList<>();
		
		Book b1 = new Book();
		b1.setTitle("java入門");
		b1.setPublishDate(f.parse("2011/10/07"));
		b1.setComment("スッキリわかる");
		books.add(b1);
		Book b2 = new Book();
		b2.setTitle("Python入門");
		b2.setPublishDate(f.parse("2019/06/11"));
		b2.setComment("カレーが食べたくなる");
		books.add(b2);
		Book b3 = new Book();
		b3.setTitle("C言語入門");
		b3.setPublishDate(f.parse("2018/06/21"));
		b3.setComment("ポインタも自由自在");
		books.add(b3);
		
		// タイトル順に並び替えるソートを使用
		Collections.sort(books, new TitleComparator());
		
		for(Book b: books) {
			//bのタイトル、SimpleDateFormat型の日付、bのコメントを
			System.out.println(b.getTitle() + " " + f.format(b.getPublishDate()) + " " + b.getComment());
		}
		
	}

}
//C言語入門 Sun Jan 21 00:06:00 JST 2018 ポインタも自由自在
//Python入門 Fri Jan 11 00:06:00 JST 2019 カレーが食べたくなる
//java入門 Fri Jan 07 00:10:00 JST 2011 スッキリわかる
