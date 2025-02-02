import java.util.*; //CCC '04 J1 - Squares


public class CCC04J1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double squares = Math.sqrt(sc.nextDouble());
        System.out.println("The largest square has side length " + Math.round(Math.floor(squares)) + ".");
        sc.close();
    }
}