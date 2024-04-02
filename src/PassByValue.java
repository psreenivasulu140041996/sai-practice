
public class PassByValue {
	
	public static void changeValue(int value) {		
		 value = 20;		
	}
	public static void main(String[] args) {

		int x=10;
		System.out.println("Before "+x);
		changeValue(x);
		System.out.println("After "+x);
		
	}

}
