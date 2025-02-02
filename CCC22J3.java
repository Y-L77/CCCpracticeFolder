import java.util.*; //CCC '22 J3 - Harp Tuning

//this only passes 5/6 of the cases and scores 13/15

public class CCC22J3{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //input test AFB+8SC-4H-2GDPE+9
        //output test AFB tighten 8, SC loosen 4, H loosen 2, GDPE tighten 9
        //replace commas with indexes

        String tuningcode = sc.nextLine();


        for(int i = 0; i < tuningcode.length(); i++){

            if(tuningcode.charAt(i) == '+'){
                System.out.print(" tighten ");
            }

            if(tuningcode.charAt(i) == '-'){
                System.out.print(" loosen ");
            }

            if(Character.isDigit(tuningcode.charAt(i))){
                System.out.print(tuningcode.charAt(i) + "\n");
            }

            
            if (!Character.isDigit(tuningcode.charAt(i)) && tuningcode.charAt(i) != '+' && tuningcode.charAt(i) != '-') {
                System.out.print(tuningcode.charAt(i));
            }
            

        }
        sc.close();
    }
}