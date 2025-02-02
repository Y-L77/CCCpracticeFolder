import java.util.*; //CCC '05 J1 - The Cell Sell


public class CCC05J1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double DT = sc.nextDouble();
        double ET = sc.nextDouble();
        double WT = sc.nextDouble();
        double A = 0;
        double B = 0;
        if(DT <= 100){
            A += 0;
        }
        else{
            A += (DT - 100) * 0.25;
        }
        A += ET * 0.15;
        A += WT * 0.20;

        if(DT <= 250){
            B += 0;
        }
        else{
            B += (DT - 250) * 0.45;
        }
        B += ET * 0.35;
        B += WT * 0.25;
        System.out.printf("Plan A costs %.2f%n", A);
        System.out.printf("Plan B costs %.2f%n", B);
        
        if(A > B){
            System.out.println("Plan B is cheapest.");
        }
        else if(A < B){
            System.out.println("Plan A is cheapest.");
        }
        else{
            System.out.println("Plan A and B are the same price.");
        }

        sc.close();
    }
}