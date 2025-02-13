
import java.util.LinkedList;
import java.util.Queue; //all standard libraries for my implementation
import java.util.Scanner;

public class CCC10J5{ //I already understand adjacencylist and BFS is overkill for this question but I want to learn and start somewhere.
    //i don't use adjacency list for this, comment on line 6 is outdated, read 9-10 to know why i use boolean adjacency array

    public static void main(String[] args) { //note to self, for problems with grids, a 2d array is an inherent grid so graphing problems
        Scanner sc = new Scanner(System.in); //that need grid should be done with an adjacency array, else use an adjacency list
        int startX = sc.nextInt(); //taking the inputs
        int startY = sc.nextInt();
        int targetX = sc.nextInt();
        int targetY = sc.nextInt();
        sc.close();

        System.out.println(bfs(startX, startY, targetX, targetY)); //simple print, you should always use bfs in seperate function.
    }  

    public static int bfs(int startX, int startY, int targetX, int targetY){ //params
        //if the start is equal to the end, you need 0 moves to reach target.
        if(startX == targetX && startY == targetY){
            return 0;   
        }
        //the possible knight moves
        int[] dx = {2, 2, -2, -2, 1, 1, -1, -1}; //there will be a loop that will cycle through all 8 possible knight moves.
        int[] dy = {1, -1, 1, -1, 2, -2, 2, -2};
        

        Queue<int[]> queue = new LinkedList<>(); //java doesn't have a built in queue because linkedlist already has the
        //functionalities of a queue. We declare the reference as Queue<int[]> because it gives us fast built in functions
        //a regular queue has like queue.poll(), queue.offer(), queue.peek(), queue.remove()

        boolean[][] visited = new boolean[9][9]; //0 indexed array so i put 9 for a 8x8 grid of boolean values

        queue.add(new int[]{startX, startY, 0}); //starting vertices for Breadth first search BFS

        while(!queue.isEmpty()){ //while loop while the queue isn't empty, will iterate through until the queue is empty
        //the queue tells us all the positions that havent been checked yet for the squares.
            int[] pos = queue.poll(); //the poll function is used to remove the element from the top of the queue, and then add it to a variable or just return the value.
            int x = pos[0]; //the x position instantiation so i can use it in the if condition
            int y = pos[1]; //the y position instantiation so i can use it in my if condition
            int moves = pos[2]; //the return value ill return to calculate how many moves ive done.

            for(int i = 0; i < 8; i++){ //from this line to the next if statement, it loops through every possibility of the knight.
                int newX = x + dx[i]; //THE NEXT LINE I DOCUMENT IS IMPORTANT FOR MY LEARNING, PAY ATTENTION.
                int newY = y + dy[i]; 

                if(newX >= 1 && newX <= 8 && newY >= 1 && newY <= 8 && !visited[newX][newY]){ //pay attention to the !visited
                    if(newX == targetX && newY == targetY){ //if the visited wasn't here, the moves value would equal all the squares
                        return moves + 1; //line break because this code block is intuitive
                    }
                    //iterated through. With the if !visited, it will now find the shortest path because the moves won't get added
                    visited[newX][newY] = true;
                    queue.add(new int[]{newX, newY, moves + 1}); //this moves+1 condition will only work if the visited block is false.
                }
            }
        }
        return -1; //should never return this if valid chess board. BE SURE TO ALWAYS INCLUDE A EDGE-CASE RETURN FUNCTION OR THE FUNCTION WON'T RUN
    }
}
