package capsule.human;

public class Capsule01 {
	public static void main(String[] args) {
		HumanNoCapsule human1 = new HumanNoCapsule("田中", 20);
		System.out.println(human1.name);
		System.out.println(human1.age);
		
		human1.name = "今田";
		human1.age = 60;
		System.out.println("名前は" + human1.name + " " + "年齢は" + human1.age);
		
		HumanCapsule human2 = new HumanCapsule("山田", 35);
		System.out.println("名前は" + human2.getName() + "、年齢は" + human2.getAge() + "です");
		human2.setName("太郎");
		System.out.println(human2.getName());
	}

}
