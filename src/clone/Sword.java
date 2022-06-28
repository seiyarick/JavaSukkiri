package clone;

// Swordクラスでもcloneableを実装
public class Sword implements Cloneable{
	private String name;
	
	// Swordクラスでもclone()を実装すれば両方の剣が正しく表示される
	public Sword clone() {
		Sword result = new Sword();
		result.name = this.name;
		return result;
	}
	
	public Sword() {
		this.name = "";
	}
	
	public Sword(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
