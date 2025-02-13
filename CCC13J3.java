import java.util.*;


public class CCC13J3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int time = sc.nextInt();
        int chores = sc.nextInt();
        int choresCompleted = 0;
        int[] choreTimes = new int[chores];
        for(int i = 0; i < chores; i++){
            choreTimes[i] = sc.nextInt();
        }
        Arrays.sort(choreTimes);

        for(int i = 0; i < chores; i++){
            if(time - choreTimes[i] >= 0){
                time -= choreTimes[i];
                choresCompleted++;
            }
        }
        System.out.println(choresCompleted);
        sc.close();
    }
}
