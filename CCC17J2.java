import java.util.*; //CCC '17 J2 - Shifty Sum


public class CCC17J2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int shift = sc.nextInt();

        int total = 0;

        total += num;

        for(int i = 0; i < shift; i++){
            String strintot = Integer.toString(num);
            String addedvalue = strintot + ("0".repeat(i + 1));
            total += Integer.parseInt(addedvalue);
        }

        System.out.println(total);
        sc.close();
    }
}