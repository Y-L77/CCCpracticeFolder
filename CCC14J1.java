import java.util.Scanner; //CCC '14 J1 - Triangle Times

public class CCC14J1{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int ang1 = sc.nextInt();
		int ang2 = sc.nextInt();
		int ang3 = sc.nextInt();
		
		
		if(ang1 + ang2 + ang3 != 180) {
			System.out.println("Error");
		}
		else if(ang1 == ang2 && ang2 == ang3){
			System.out.println("Equilateral");
		}
		else if(ang1 != ang2 && ang2 != ang3 && ang3 != ang1) {
			System.out.println("Scalene");
		}
		else{
			System.out.println("Isosceles");
		}
	}
}