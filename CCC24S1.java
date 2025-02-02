import java.util.*; //CCC '24 S1


public class CCC24S1{
    public static void main(String[] args){ //I had another solution using BufferedReader so i can go through the inputs faster but I used a lot of AI in that and I don't really understand it so I'm using this solution.

        Scanner sc = new Scanner(System.in);

        int participants = sc.nextInt();

        int matches = 0;

        int[] hatNumbers = new int[participants];
        
        for(int i = 0; i < participants; i++){
            hatNumbers[i] = sc.nextInt();
        }

        int half = participants / 2;

        for(int i = 0; i < half; i++){
            if(hatNumbers[i] == hatNumbers[i + half]){
                matches += 2;
            }
        }

        System.out.println(matches);

        sc.close();
    }
}