import java.util.Scanner; // CCC '21 J1 - Boiling Water

public class CCC21J1{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int Temp = sc.nextInt();
		
		System.out.println((Temp * 5) - 400);
		if(Temp == 100) {
			System.out.println(0);
		}
		else if(Temp > 100) {
			System.out.println(-1);
		}
		else {
			System.out.println(1);
		}

	}
}