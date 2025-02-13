import java.util.*;

public class CCC24S2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int N = sc.nextInt();

        sc.nextLine();

        char[] tOrF = new char[T];
        Arrays.fill(tOrF, 'F');

        for(int i = 0; i < T; i++){
            String str = sc.nextLine();
            for(int j = 0; j < N - 2; j++){
                if(str.charAt(j) == str.charAt(j + 2)){
                    if(str.charAt(j) == str.charAt(j + 1)){
                        //nothing
                    }
                    else{
                        tOrF[i] = 'T';
                    }
                }
            }
        }
        for(int i = 0; i < T; i++){
            System.out.println(tOrF[i]);
        }
        sc.close();
    }
}
