import java.util.*; //CCC '22 J1 - Cupcake Party


public class CCC8{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int cupcakes1 = sc.nextInt() * 8;
        int cupcake2 = sc.nextInt() * 3;
        
        System.out.println((cupcake2 + cupcakes1) - 28);
    }
}