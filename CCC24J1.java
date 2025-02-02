import java.util.*; //CCC '24 J1 - Conveyor Belt Sushi


public class CCC24J1{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int red = sc.nextInt();
        int green = sc.nextInt();
        int blue = sc.nextInt();


        System.out.println(red * 3 + green * 4 + blue * 5);

        sc.close();
    }
}