
public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Java knows how to only downcast data types so we need to upcast 
		 * For example 
		 * 
		 * */
		byte a = 1;
		short b;
		char c;
		int d ;
		long e;
		float f;
		double g = 500.1;
		
		double ex = a;//trying to cast a byte into a double
		System.out.println(ex);//This will work because byte data type is above double (This will print out 1.0)
		                  //(or because it is going up in size)going up in size simply means its going from the smallest to the biggest(byte - double)
		
		//but if we want to type cast int to double, this will not work because int is above double
		//(or because it is going down in size)going down in size simply means its going from the biggest to the smallest(double - byte)
		/** The code below will print out an error(Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		Type mismatch: cannot convert from double to int
        at TypeCasting.main(TypeCasting.java:23))*/
		
		int exp = g;//trying to cast a double into an int
		System.out.println(exp);
		
		//The code below is how to change or convert a double data type to an integer data type(it will print out 500)
		int expe = (int) g;//trying to cast a double into an int
		System.out.println(expe);

	}

}
