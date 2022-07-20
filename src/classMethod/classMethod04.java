package classMethod;

public class classMethod04 {
	public static void main(String[]args) {
		Human04 yamada = new Human04("山田");
		
		Human04.staticMethodPrint();
		
		System.out.println(Human04.GREETING);
		
//		インスタンスメンバーは直接使用できない↓
//		Human04.instanceMethodPrint();
//		
//		インスタンスメンバーはインスタンス生成してから使用する
		yamada.instanceMethodPrint();
	}

}
