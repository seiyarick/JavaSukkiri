package clone;
// clone()による複製をサポートしていることを外部に対して表明するためにjava.lang.Clonebleインターフェースを実装
public class Hero implements Cloneable{
	String name;
	int hp;
	Sword sword;
	
	// clone()をオーバーライド
	// 新たなインスタンスをnewで作成し、自身のぜんフィールドをコピーしてreturnで返す
	public Hero clone() {
		Hero result = new Hero();
		result.name = this.name;
		result.hp = this.hp;
		result.sword = this.sword;
		return result;
	}
	
	public Hero() {
		this.name = "";
	}
	
	public Hero(String name) {
		this.name = name;
	}
	
	public Sword getSword() {
		return this.sword;
	}
	
	public void setSword(Sword sword) {
		this.sword = sword;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
