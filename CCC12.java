import java.util.*; //CCC '19 S1 - Flipper

public class CCC12{
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        int vcount = 0;
        int hcount = 0;

        String verOrHorFlip = sc.nextLine();

        for(int i = 0; i < verOrHorFlip.length(); i++){
            if(verOrHorFlip.charAt(i) == 'V'){ //please remember this function charat it will be very useful thanks
                vcount++;
            }
            else if(verOrHorFlip.charAt(i) == 'H'){
                hcount++;
            }
        }

        boolean originalxref = true;
        boolean originalyref = true;

        if(vcount % 2 == 0){
            originalyref = true;
        }
        else if(vcount % 2 != 0){
            originalyref = false;
        }
        else{
            System.out.println("no input or fifth dimension number or something or maybe my bad code or wrong data type");
        }

        if(hcount % 2 == 0){
            originalxref = true;
        }
        else if(hcount % 2 != 0){
            originalxref = false;
        }  
        else{
            System.out.println("uh oh");
        }

        if(originalxref && originalyref == true){
            System.out.println("1 2");
            System.out.println("3 4");
        }
        else if(originalxref == true && originalyref == false){
            System.out.println("2 1");
            System.out.println("4 3");
        }
        else if(originalxref == false && originalyref == true){
            System.out.println("3 4");
            System.out.println("1 2");
        }
        else{
            System.out.println("4 3");
            System.out.println("2 1");
        }


    }
}