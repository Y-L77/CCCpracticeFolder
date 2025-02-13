import java.util.*;

public class CCC23S1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int metersOfTape = 0;

        int C = sc.nextInt();
        int[] topTriangles = new int[C];
        int[] bottomTriangles = new int[C];


        for(int i = 0; i < C; i++){
            topTriangles[i] = sc.nextInt();
        }
        for(int i = 0; i < C; i++){
            bottomTriangles[i] = sc.nextInt();
        }
        
        for(int i = 0; i < C - 1; i++){
            if((topTriangles[i] == 1 && bottomTriangles[i] == 1 && topTriangles[i + 1] == 1) || (topTriangles[i] == 1 && bottomTriangles[i] == 1 && bottomTriangles[i + 1] == 1)){
                metersOfTape += 7;
            }
            else if(topTriangles[i] == 1 && bottomTriangles[i] == 1 && topTriangles[i + 1] == 1 && bottomTriangles[i + 1] == 1){
                metersOfTape += 9;
            }
            else if(topTriangles[i] == 1 && bottomTriangles[i] == 1){
                metersOfTape += 5;
            }
            else if(topTriangles[i] == 1 || bottomTriangles[i] == 1){
                metersOfTape += 3;
            }
        }

        if(topTriangles[topTriangles.length - 1] == 1 && bottomTriangles[bottomTriangles.length - 1] == 1){
            metersOfTape += 5;
        }

        else if(topTriangles[topTriangles.length - 1] == 1 || bottomTriangles[bottomTriangles.length -1] == 1){
            metersOfTape += 3;
        }

        System.out.println(metersOfTape);
        sc.close();


        //this program doesnt account for adjacencies
    }
}
