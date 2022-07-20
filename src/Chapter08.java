
public class Chapter08 {
	public static void main(String[] args) {
		int a = 2;
		while(a < 5) {
			System.out.println(a * a);
			a++;
		}
		System.out.println("-------");
		
		int[] b = {1, 2, 3, 4};
		for(int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		System.out.println("-------");
		
		for(int i: b) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
