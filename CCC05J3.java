import java.util.*;

public class CCC05J3 {

    /*
    I'm going to be breaking down my thinking process for this code because I think its good to document it during practice.
    My first solution I've thought of is to break this problems into steps as follows.
    get all inputs recursively with a while and break loop
    get the amount of directions in the list with a linear search so i can use it for future loop bounds
    use a reverse linear search starting at the back of the list and append to a new list
    I repeat the process for both direction list and street name list
    I then use another loop with dirCout (Direction Count) and then I print out all of the inputs with dirOder[i].
    If there is a bug with input sizes I don't think the program can handle super small input so maybe add a if statement to the first inputs to handle edge case.
    I'm also not too sure if it can handle super big inputs but there isnt input specification on the DMOJ so I'm going to assume I don't need to worry
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();
        boolean isnotschool = true; //hypothesis, for questions where the input is dynamic we need to use while loops for recursion.
        while(isnotschool){
            String newinput = sc.nextLine();
            if(newinput.equals("SCHOOL")){
                isnotschool = false;
            }
            inputs.add(newinput);
        }
        //[R, QUEEN, R, FOURTH, R, SCHOOL] SAMPLE INPUT FOR MY VISUALIZATION
        int dirCout = 0;
        for(int i = 0; i < inputs.size(); i++){
            if(inputs.get(i).equals("R") || inputs.get(i).equals("L")){
                dirCout++;
            }
        }
        int endIndex = 2;
        String[] dirOrder = new String[dirCout];
        for(int i = 0; i < dirCout; i++){ //the index.size will count at 6 so i need to do -1 because the index is 0 indexed so the last element is 5 but there are 6 elements.
            if(inputs.get(inputs.size() - endIndex).equals("R")){ //always use .equals() isntead of == for strings
                dirOrder[i] = "LEFT";
            }
            else if(inputs.get(inputs.size() - endIndex).equals("L")){ //its parsing from the end to the front so the final dirOrder is already sorted.
                dirOrder[i] = "RIGHT";
            }
            else{
                System.out.println("error with indexes probably ln ~40");
            }
            endIndex += 2;
        }

        endIndex = 1; //go through reverse linear search again but if school, append streetNameOrder at last index always.
        String[] streetNameOrder = new String[dirCout];
        for(int i = 0; i < dirCout; i++){
            if(inputs.get(inputs.size() - endIndex).equals("SCHOOL")){
                streetNameOrder[streetNameOrder.length - 1] = "into your HOME.";
            }
            else{
                streetNameOrder[i - 1] = "onto " + inputs.get(inputs.size() - endIndex) + " street."; //its i - 1 because the school will always be last input
            }
            endIndex += 2;
        }

        for(int i = 0; i < dirCout; i++){
            System.out.println("Turn " + dirOrder[i] + " " + streetNameOrder[i]);
        }

        sc.close();
    }
}
