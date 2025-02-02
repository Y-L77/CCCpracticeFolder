import java.util.Scanner; //CCC '04 J3 - Smile with Similes

public class CCC04J3{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		int m = sc.nextInt();
		sc.nextLine();
		String[] adjectives = new String[n];
		
		for(int i = 0; i < n; i++) {
			adjectives[i] = sc.nextLine();
		}
		
		String[] nouns = new String[m];
		
		for(int i = 0; i < m; i++) {
			nouns[i] = sc.nextLine();
		}
		
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.println(adjectives[i] + " as " + nouns[j]);
			}
		}
		
		sc.close();
	}
}