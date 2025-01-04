import java.util.*; //CCC '07 J1


public class CCC07J1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] bowls = new int[3];

        for (int i = 0; i < 3; i++) {
            bowls[i] = sc.nextInt();
        }

        for (int i = 0; i < bowls.length - 1; i++) {
            for (int j = 0; j < bowls.length - 1 - i; j++) {
                if (bowls[j] > bowls[j + 1]) {
                    int temp = bowls[j];
                    bowls[j] = bowls[j + 1];
                    bowls[j + 1] = temp;
                }
            }
        }
        System.out.println(bowls[1]);
    }
}