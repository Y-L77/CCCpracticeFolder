import java.util.*; //CCC '18 J2 - Occupy parking


public class CCC18J2{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int spacesTakenBothDays = 0;
        int parkingSpaces = sc.nextInt();
        sc.nextLine();

        String pSpace1 = sc.nextLine();
        String pSpace2 = sc.nextLine();

        for(int i = 0; i < parkingSpaces; i++){
            if(pSpace1.charAt(i) == 'C' && pSpace2.charAt(i) == 'C'){
                spacesTakenBothDays++;
            }
        }

        System.out.println(spacesTakenBothDays);
    }
}