
public class StringInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s = "104";
         System.out.println(s+4);
         System.out.println(Integer.parseInt(s)+4);
          
         String n = "104";
         int a = Integer.parseInt(n);
         System.out.println(a+5);
         
         int i = Integer.parseInt("104");
         System.out.println("104"+4);
         System.out.println(i+6);
         
         int t = 5;
         System.out.println(t+5);
         System.out.println(Integer.toString(t)+4);
         
         String st = "age: 47";
         st = st.replaceAll("\\D+","");
         
         System.out.println(st);
         
         int str = Integer.parseInt(st);
         System.out.println(str+2);
	}

}
