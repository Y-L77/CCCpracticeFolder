import java.util.*; //CCC '05 J5 - Bananas

public class CCC05J5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int wordcount = 0;
        ArrayList<String> wordList = new ArrayList<>();
        while(true){
            wordcount++;
            String word = sc.nextLine();
            if(word.equals("X")){ //this code only passes 2 cases. this question was pretty confusing and my understanding of a money word is still ambiguous.
                break; //my program is very brute forced because of my ambiguous understanding. i feel like it could benefit a lot more by explaining cases on why it isn't a monkey word.
            }
            else{
                wordList.add(word);
            }
        }
        for(int i = 0; i < wordcount - 1; i++){
            if((wordList.get(i).contains("AA") == false && wordList.get(i).contains("NN") == false && wordList.get(i).contains("X") == false && wordList.get(i).contains("A") == true && wordList.get(i).contains("B") == false) || (wordList.get(i).charAt(0) == 'B' && wordList.get(i).charAt(wordList.get(i).length() - 1) == 'S')){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

        sc.close();
    }
}