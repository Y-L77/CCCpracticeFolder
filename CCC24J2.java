import java.util.*; //CCC '24 J2


public class CCC24J2{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int DusaSize = sc.nextInt();
        

        while(true){
            int yobi = sc.nextInt();

            if(DusaSize > yobi){
                DusaSize += yobi;
            }
            else if(yobi >= DusaSize){
                System.out.println(DusaSize);
                break;
            }
        }

        sc.close();
    }
}