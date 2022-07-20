package classMethod;

public class classMethod04 {
	public static void main(String[]args) {
		Human04 yamada = new Human04("山田");
		
		Human04.staticMethodPrint();
		
		System.out.println(Human04.GREETING);
		
//		Human04.instanceMethodPrint();
		
		yamada.instanceMethodPrint();
	}

}
