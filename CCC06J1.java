import java.util.*; //CCC '05 J5 - Bananas

public class CCC06J1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        int total = 0;
        int burger = sc.nextInt();
        if(burger == 1){total += 461;}
        else if(burger == 2){total += 431;}
        else if(burger == 3){total += 420;}

        int side = sc.nextInt();
        if(side == 1){total += 100;}
        else if(side == 2){total += 57;}
        else if(side == 3){total += 70;}

        int drink = sc.nextInt();
        if(drink == 1){total += 130;}
        else if(drink == 2){total += 160;}
        else if(drink == 3){total += 118;}

        
        int dessert = sc.nextInt();
        if(dessert == 1){total += 167;}
        else if(dessert == 2){total += 266;}
        else if(dessert == 3){total += 75;}


        System.out.println("Your total Calorie count is " + total + ".");


        sc.close();
    }
}