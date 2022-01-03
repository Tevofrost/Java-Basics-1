
public class ConditionalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = ( 7 > 3 ) ? 7:3;
		
		System.out.println(a);
		
		
		if (7 > 3) {
			System.out.println(a=7);	
		}else {
			System.out.println(a=3);
		}
		
		String b = "Howdy";
		double result = b.equals("Hello") ? 0.5 : 0.25 ;
		System.out.println(result);
		
		

	}

}
