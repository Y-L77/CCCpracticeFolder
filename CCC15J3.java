import java.util.Scanner;

public class CCC15J3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //this question was very hard for me and i used a lot of ai to see examples.
        //my key takeaway from ai was to use some data strcture called a "StringBuilder" but I don't want to overcomplicate things
        //and I'm not trying to learn java exclusive things.
        //Also I spent like 1 hour doing random shit like arraylists and arrays because I didn't know i could append the classic
        //string data type with just +=

        char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String robbersWord = "";
        String word = sc.nextLine();

        for(int i = 0; i < word.length(); i++){
            int iterations = 0;
            if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u'){
                robbersWord += word.charAt(i);
            }
            else{
                robbersWord += word.charAt(i);
                for(int j = 0; j < alphabet.length; j++){
                    char localConstonant = word.charAt(i);
                    if(localConstonant == alphabet[j]){
                        //now that I have an iterations variable I can do math in this code block to find the nearest vowel.
                        int vowelA = 1;
                        int vowelE = 4;
                        int vowelI = 9;
                        int vowelO = 15;
                        int vowelU = 21;

                        //i have no idea how to do this in an efficent way so im going to do this in a cancer way first.

                        if(Math.abs(iterations - vowelA) > Math.abs(iterations - vowelE)){
                            robbersWord += "a";
                        }
                        if(Math.abs(iterations - vowelE) > Math.abs(iterations - vowelI)){
                            robbersWord += "e";
                        }
                        if(Math.abs(iterations - vowelI) > Math.abs(iterations - vowelO)){
                            robbersWord += "i";
                        }
                        if(Math.abs(iterations - vowelO) > Math.abs(iterations - vowelU)){
                            robbersWord += "o";
                        }
                        if(Math.abs(iterations - vowelU) > Math.abs(iterations - vowelA)){
                            robbersWord += "u";
                        }
                    }
                    else{
                        iterations++;
                    }
                }
                robbersWord += alphabet[iterations - 1];
                System.out.println(iterations);
            }
        }

        //i give up on this stupid ass question
        System.out.println(robbersWord);

        sc.close();
    }
}
