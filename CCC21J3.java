import java.util.*;

public class CCC21J3 { //CCC '21 J3 - Secret Instructions


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        boolean is99999 = false;
        String previousDir = "right"; //placeholder
        String direction = "right"; //placeholder

        int inputs = 0;
        ArrayList<String> outputStorage = new ArrayList<String>();

        while(is99999 != true){
            String formula = sc.nextLine();
            if(formula.equals("99999")){
                is99999 = true;

                for(int i = 0; i < inputs; i++){
                    System.out.println(outputStorage.get(i));
                }
            }
            else{
                inputs++;
                int digit1 = Character.getNumericValue(formula.charAt(0));
                int digit2 = Character.getNumericValue(formula.charAt(1));

                if((digit1 + digit2) == 0){
                    direction = previousDir;
                }
                else if((digit1 + digit2) % 2 == 0){
                    direction = "right";
                    previousDir = "right";
                }
                else{
                    direction = "left";
                    previousDir = direction;
                }

                String finalinput = direction + " " + formula.charAt(2) + formula.charAt(3) + formula.charAt(4);
                outputStorage.add(finalinput);
                
            }
        }
        sc.close();
    }
}
