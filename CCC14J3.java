import java.util.Scanner;

public class CCC14J3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int Antonia = 100; //first number
        int David = 100; //second number

        for(int i = 0; i < n; i++){
            int AntoniasNumber = sc.nextInt();
            int DavidsNumber = sc.nextInt();

            if(AntoniasNumber > DavidsNumber){
                David -= AntoniasNumber;
            }
            else if(DavidsNumber > AntoniasNumber){
                Antonia -= DavidsNumber;
            }
        }

        System.out.println(Antonia);
        System.out.print(David);

		sc.close();
	}
}