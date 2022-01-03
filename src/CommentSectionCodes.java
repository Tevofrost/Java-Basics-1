import java.util.ArrayList;
import java.util.Scanner;

public class CommentSectionCodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		If you have an array with different dimmensions try:
//		 for(int i =0; i< array.lenght; i++) {
//		 for(int j =0; j< array[0].length; j++) {
//		}
//		}
//		This will go through all values in array that is or isnt square
		
//		can you make one more video on Multi-Dimensional Arrays,
//		to be more specific on " HOW TO VISUALIZE A TABLE MADE using 2d Arrays" ;
//		it will be such a relief if i get my doubts clear on that topic 
		
		
//		 for(int i = 0; i < 7;i++){
//	            for(int j = 0; j < i;j++){
//	                System.out.print("*");
//	            }
//	            System.out.println();
//	        }
//
//
//	Output: 
//	*
//	**
//	*
//	**
//	***
//	****
//
//	Explanation: outer loops executes until the condition is met(i = 7),
//	The inner loop executes while j is less than i
//	When i = 0 
//	J = 0
//	Increment i to 1
//	Now the second time through the loop 
//	I = 1
//	j = 0 
//	0 is less than one so print an * , increment j to 1 and check the condition again 
//	1 isn’t less than 1 so we exit that loop and print an empty space,
//	Now i = 2 
//	J = 0
//	0 is less than 2 so we print * 
//	I is still 2
//	But now we increment j 
//	J = 1
//	1 is less than 2 so we print another *
//	So far the sequence is 
//
//	*
//	**
//	J is now incremented to 2 
//	Now we check to see if j < i (2<2) no it isn’t so we exit out that loop and print another empty line
//
//	Those steps repeat until i is equal to 7 
//	So when i is 3
//	The sequence is 
//	*
//	**
//	*
//	Each time through the inner loop is printing an * until j is no longer less than i, hopefully somebody finds this useful.
//
//	Edit — the comment section formatting will throw off the actual output pattern but hopefully it makes sense.
		
		
		//Alex , I think these nested loops can also be used for a 3d array LiKE This :-
//		public class NestedForLoops {



//			public static void main(String[] args) {
//
//				String[][][] Array = {{{"Hi" , "Hello" , "Hey"},{"Bye" , "BabBye" , "Bye-Bye"}}};
//
//
//
//				for(int i = 0 ; i < 2 ; i++) {
//
//					for(int j = 0 ; j < 3 ; j++) {
//
//						for(int k = 0 ; k < 3 ; k++) {
//
//							System.out.println(Array[i][j][k]);
//
//						}
//
//					}
//
//				}
//
//				
//
//			}
//
//
//
//		}

		
		Scanner input = new Scanner(System.in);
		String[] zombies =  new String[4];
		zombies[0] = "Short Range Zombie";
		zombies[1] = "Middle Range Zombie";
		zombies[2] = "Long Range Zombie";
		//zombies2[3] = "";
		
		
		ArrayList HybridZombies = new ArrayList();
		HybridZombies.add("Short and Middle Range Zombie");
		HybridZombies.add("Middle and Long Range Zombie");
		HybridZombies.add("Long and ShortRange Zombie");
		HybridZombies.add("Boss Zombie");
		
		
		String guns[] = {"Ak-47", "Shot-gun", "Sniper Rifle", "pistol", "saber"};
		
		System.out.println("Please enter the name of the Zombie:");	
		String ZombieInput = input.nextLine();
		
		for(int i = 0 ; i < zombies.length; i++) {
			
			//if(ZombieInput[].equals(null))
			
		}
   
	}

}
