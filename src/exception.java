
public class exception {

	public static void main(String[] args) {
		int a =1,b=0;
		
		try {
			int c=1/0;
		}catch(ArithmeticException ar) {
			System.out.println(ar);
		}
		catch(Exception e){
			System.out.println("hi");
			System.out.println(e);
			
		}

	}

}
