import java.util.*;

public class CCC0S1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int amountOfQuarters = sc.nextInt();
        int timesPlayed = 0;
        int firstMachineTimesPlayed = sc.nextInt();
        int secondMachineTimesPlayed = sc.nextInt();
        int thirdMachineTimesPlayed = sc.nextInt();


        while(amountOfQuarters > 0){

            if(amountOfQuarters < 1){
                break;
            }

            firstMachineTimesPlayed++;
            timesPlayed++;
            amountOfQuarters--;
            if(firstMachineTimesPlayed % 35 == 0){
                amountOfQuarters += 30;
            }

            if(amountOfQuarters < 1){
                break;
            }


            secondMachineTimesPlayed++;
            timesPlayed++;
            amountOfQuarters--;
            if(secondMachineTimesPlayed % 100 == 0){
                amountOfQuarters += 60;
            }

            if(amountOfQuarters < 1){
                break;
            }

            thirdMachineTimesPlayed++;
            timesPlayed++;
            amountOfQuarters--;
            if(thirdMachineTimesPlayed % 10 == 0){
                amountOfQuarters += 9;
            }
        }
        System.out.println("Martha plays " + timesPlayed + " times before going broke.");

        sc.close();
    }
}
