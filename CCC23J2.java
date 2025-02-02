import java.util.Scanner; // CCC '23 J2 - Chili Peppers

public class CCC23J2 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int amountOfSpices = sc.nextInt();
    	sc.nextLine();
    	int[] spicelist = new int[amountOfSpices];
    	
    	for(int i = 0; i < amountOfSpices; i++) {
    		String pepperName = sc.nextLine();
    		spicelist[i] = SHUCalculator(pepperName);
    	}
    	int totalspice = 0;
    	for(int i = 0; i < amountOfSpices; i++) {
    		totalspice += spicelist[i];
    	}
    	System.out.println(totalspice);

		sc.close();
    }
    
    
    public static int SHUCalculator(String arg) {
    	switch(arg) {
			default:
				return 0;
    		case("Poblano"):
    			return 1500;
    		case("Mirasol"):
    			return 6000;
    		case("Serrano"):
    			return 15500;
    		case("Cayenne"):
    			return 40000;
    		case("Thai"):
    			return 75000;
    		case("Habanero"):
    			return 125000;
    	}
		
    }
}
