import java.util.*;

public class CCC10S1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int swiftsSum = 0;
        int semaphoresSum = 0;

        int[] swiftsGoals = new int[N];
        int[] semaphoresGoals = new int[N];

        for(int i = 0; i < N; i++){
            swiftsGoals[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++){
            semaphoresSum = sc.nextInt();
        }
        //TODO: come back to this
        for(int i = 0; i < N; i++){
            swiftsSum += swiftsGoals[i];
            semaphoresSum += semaphoresGoals[i];
            if(swiftsSum == semaphoresSum){
                System.out.println(i);
            }
        }
    }
}