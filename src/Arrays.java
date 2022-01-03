import java.util.ArrayList;
import java.util.Scanner;

public class Arrays {

	public static void main(String args[])
	{
		
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
		
		
//		for(int i = 0 ; i < zombies.length; i++) {
//			zombies.get[i];
//			
//		}
		/**for(  String Zombies  : zombies ) {
			//System.out.println(ZombieInput);	
		
		       System.out.println(Zombies);
			if (ZombieInput == "Short Range Zombie" ) {
				System.out.println(guns[0]);
		}
	}*/
		
		System.out.println("Please enter the name of the Zombie:");	
		String ZombieInput = input.nextLine();
		ZombieInput2 = ZombieInput ;
		
	}
}
    
/**import.java.util.ArrayList;

public class Campaign {

    private String candidateName;
    private ArrayList<DonorList> donors;

    public Campaign(String  name)
    {
        //TODO Initialize all of the instance data
        candidateName = name;
        donors = new ArrayList<DonorList>();
    }*/
/**import java.util.ArrayList; 

public class Campaign {
    private String candidateName;
    private ArrayList<String> donors;


    public Campaign(String name, ArrayList<String> a1) {
        candidateName = name;
        donors = a1;

    }

    public static void main(String[] args) {

        ArrayList <String> aa = new ArrayList <String>();
        aa.add("Ram");
        aa.add("Sita");

        Campaign obj = new Campaign("Nischal",aa);
        System.out.println(obj.candidateName + " "+ obj.donors);


    }*/