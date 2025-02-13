import java.util.*;

public class CCC20J3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int amountOfDrops = sc.nextInt();
        sc.nextLine();
        int lowestX = 100;
        int lowestY = 100;
        int highestX = 0;
        int highestY = 0;

        for(int i = 0; i < amountOfDrops; i++){
            String[] input = sc.nextLine().split(",");
            int xPos = Integer.parseInt(input[0]);
            int yPos = Integer.parseInt(input[1]);
            if(xPos < lowestX){
                lowestX = xPos;
            }
            if(xPos > highestX){
                highestX = xPos;
            }
            if(yPos < lowestY){
                lowestY = yPos;
            }
            if(yPos > highestY){
                highestY = yPos;
            }
        }

        lowestX -= 1;
        lowestY -= 1;
        highestX += 1;
        highestY += 1;

        System.out.println(lowestX + "," + lowestY);
        System.out.println(highestX + "," + highestY);

        sc.close();
    }
}
