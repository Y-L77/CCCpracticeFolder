import java.util.*;

public class CCC13S2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int maxWeight = sc.nextInt();
        int amtCars = sc.nextInt();
        int carsBeforeBreaking = 3;
        int[] carWeights = new int[amtCars];
        for(int i = 0; i < amtCars; i++){
            carWeights[i] = sc.nextInt();
        }
        //[50, 30, 10, 10, 40, 50, 40, 19, 49, 85, 45] no matter what input size its always N - 3 for searches
        for(int i = 0; i < amtCars - 3; i++){
            if(carWeights[0 + i] + carWeights[1 + i] + carWeights[2 + i] + carWeights[3 + i] <= maxWeight){
            carsBeforeBreaking++;
            }
        }
        if(carWeights[0] > maxWeight){
            System.out.println(0);
        }
        else if(carWeights[0] + carWeights[1] > maxWeight){
            System.out.println(1);
        }
        else if(carWeights[0] + carWeights[1] + carWeights[2] > maxWeight){
            System.out.println(2);
        }
        else if(carWeights[0] + carWeights[1] + carWeights[2] + carWeights[3] > maxWeight){
            System.out.println(3);
        }
        else{
            System.out.println(carsBeforeBreaking);
        }
    }
}
