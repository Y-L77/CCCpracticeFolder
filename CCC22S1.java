import java.util.*; //CCC '22 S1 - Good Fours and Good Fives

public class CCC22S1{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in); 
        int WaysToArrange = 0;
        int number = sc.nextInt();

        //N = x4 + y5
        //find a way to iterate through all values of x and y.

        for(int i = 0; 4 * i <= number; i++){
            int remainder = number - 4 * i;
            if(remainder % 5 == 0){
                int y = remainder / 5;
                if(y >= 0){
                    WaysToArrange++;
                }
            }
        }
        System.out.println(WaysToArrange);
        sc.close();
    }
}