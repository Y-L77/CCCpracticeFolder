import java.util.*;


public class CCC11S2 { //CCC '11 S2 - Multiple Choice

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int correctresponse = 0;
        int numofquestions = sc.nextInt();
        sc.nextLine();
        String[] studentans = new String[numofquestions];
        String[] ans = new String[numofquestions];

        for(int i = 0; i < numofquestions; i++){
            studentans[i] = sc.nextLine();
        }

        for(int i = 0; i < numofquestions; i++){
            ans[i] = sc.nextLine();
        }

        for(int i = 0; i < numofquestions; i++){
            if(studentans[i].equals(ans[i])){
                correctresponse++;
            }
        }
        System.out.println(correctresponse);

        sc.close();
    }
}
