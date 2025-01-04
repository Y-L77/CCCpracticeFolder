import java.util.Scanner; //CCC '23 J3 - Special Event

public class CCC14 {
	
	//total time taken for solution: idk like 15-20 minuetes
	//any usage of internet or ai for help is documented
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int N = sc.nextInt(); //amount of people
    	sc.nextLine(); //needs to consume next line
    	String[] feinputs = new String [N]; //storage for people schedules
    	
    	for(int i = 0; i < N; i++) {
    		feinputs[i] = sc.nextLine();
    	}
    	
    	//ok now that the inputs should look like YY.Y. I need to iterate through every feinputs value e.g
    	//feinputs[2] = string hello | hello[i], if i == 2 && == Y, tuesday++
    	//whichever day in range monday-friday is highest, print day.
    	
    	int monday = 0;
    	int tuesday = 0;
    	int wednesday = 0;
    	int thursday = 0;
    	int friday = 0;
    	
        for (int i = 0; i < N; i++) {
            String str = feinputs[i]; // "YY.Y."
            
            // Check each day of the week and increment the counter for that day
            if (str.charAt(0) == 'Y') {
                monday++;
            }
            if (str.charAt(1) == 'Y') {
                tuesday++;
            }
            if (str.charAt(2) == 'Y') {
                wednesday++;
            }
            if (str.charAt(3) == 'Y') {
                thursday++;
            }
            if (str.charAt(4) == 'Y') {
                friday++;
            }
        }
    	
    	//now that all the variables are filled properly, print the day with the most 'Y's.
    	//edge cases, more days and outputs need to be in format (number,number) e.g (5,2)
    	
 int max = Math.max(Math.max(monday, tuesday), Math.max(Math.max(wednesday, thursday), friday));
        //a lot of this part was ai'd, I just had a statement without the edgecases but took too long to do it with the edgecases so I gave up.
        boolean first = true;
        if (monday == max) {
            if (!first) {
                System.out.print(",");
            }
            System.out.print(1);
            first = false;
        }
        if (tuesday == max) {
            if (!first) {
                System.out.print(",");
            }
            System.out.print(2);
            first = false;
        }
        if (wednesday == max) {
            if (!first) {
                System.out.print(",");
            }
            System.out.print(3);
            first = false;
        }
        if (thursday == max) {
            if (!first) {
                System.out.print(",");
            }
            System.out.print(4);
            first = false;
        }
        if (friday == max) {
            if (!first) {
                System.out.print(",");
            }
            System.out.print(5);
        }
    }
}