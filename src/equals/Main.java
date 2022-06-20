package equals;

public class Main {
	public static void main(String[] args) {
		Account a1 = new Account();
		a1.accountNo = "001";
		
		System.out.println(a1.equals(a1));
		
		System.out.println(a1.equals(null));
		
		String s1 = "";
		System.out.println(a1.equals(s1));
		
		Account a2 = new Account();
		a2.accountNo = "002";
		System.out.println(a1.equals(a2));
		a2.accountNo = "  001";
		System.out.println(a1.equals(a2));
	}

}
