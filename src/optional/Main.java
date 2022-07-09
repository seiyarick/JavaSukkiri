package optional;

import java.util.Optional;
public class Main {
	
	public static Optional<String> decorate(String s, char c){
		// 文字列sを文字cで挟んで装飾するメソッド
		// ・文字列sがnullまたは長さ0の場合はnullを返す
		// ・戻り値は「nullの可能性がある」ことを明示するために、
		// 単なるStringではなくOptional<String>とする
		String r;
		// もし変数sがnull又は変数sの配列が0ならば変数rはnull
		if(s == null || s.length() == 0) {
			r = null;
			// そうでなければ変数rにはc + s + cが代入される
		}else {
			r = c + s + c;
		}
		// Optional.ofNullable(r)  nullの可能性のある値を設定します
		// 今回の場合(r)がnullかもしれない
		return Optional.ofNullable(r);
	}
	public static void main(String[] args) {
		Optional<String> s = decorate("", '*');
		// 必然的にnullを考慮した処理を書くことになる
		System.out.println(s.orElse("nullのため処理できません"));
	}

}
