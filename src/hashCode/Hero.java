package hashCode;

import java.util.Objects;
public class Hero {
	String name;
	int hp;
	
	public int hashCode() {
		return Objects.hash(this.name, this.hp); //hashメソッドは、任意の個数の引数を受け取り、その引数に基づきハッシュコードとして適切な整数を生成してくれるAPI
	}

}
