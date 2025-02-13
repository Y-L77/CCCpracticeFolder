import java.util.*;

public class CCC21S1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double area = 0.0;
        double[] heights = new double[N + 1];
        double[] bases = new double[N];
        for(int i = 0; i < N + 1; i++){
            heights[i] = sc.nextDouble();
        }
        for(int i = 0; i < N; i++){
            bases[i] = sc.nextDouble();
        }
        for(int i = 0; i < N; i++){
            double boardNumi = bases[i] * ((heights[i] + heights[i + 1]) / 2.0);
            area += boardNumi;
        }
        System.out.println(area);

        sc.close();
    }
}
