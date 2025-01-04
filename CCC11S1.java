import java.util.*; //CCC '11 S1 - English or French?


public class CCC11S1{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int sCount = 0;
        int tCount = 0;


        int amountoflines = sc.nextInt();
        sc.nextLine(); //remember to always put this after a int if youre going to use a string input && ask gpt if this is comment is correct

        for(int i = 0; i < amountoflines; i++){
            String text = sc.nextLine();

            for(int j = 0; j < text.length(); j++){
                if(text.charAt(j) == 's' || text.charAt(j) == 'S'){
                    sCount++;
                }
                else if(text.charAt(j) == 't' || text.charAt(j) == 'T'){
                    tCount++;
                }
            }
        }

        if(sCount >= tCount){
            System.out.println("French");
        }
        else{
            System.out.println("English");
        }

    }
}