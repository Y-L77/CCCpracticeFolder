import java.util.Scanner; //CCC '13 J1 - Next in line

public class CCC13J1{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int youngestCounter = sc.nextInt();
		int middleCounter = sc.nextInt();
		
		int sum = middleCounter - youngestCounter;
		
		System.out.println(middleCounter + sum);
	}
}
