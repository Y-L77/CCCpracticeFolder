import java.util.Scanner; // CCC 24' J3 Bronze count

public class CCC24J3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int participants = sc.nextInt();
        int[] scores = new int[participants];
        int theAmountOfParticipantsThatWereAwardedTheBronzePrize = 0;
        for (int i = 0; i < participants; i++) {
            scores[i] = sc.nextInt();
        }
        int largestValue = Integer.MIN_VALUE;
        int secondLargestValue = Integer.MIN_VALUE;
        int thirdLargestValue = Integer.MIN_VALUE;
        for (int i = 0; i < participants; i++) {
            if (scores[i] > largestValue) {
                thirdLargestValue = secondLargestValue;
                secondLargestValue = largestValue;
                largestValue = scores[i];
            } else if (scores[i] > secondLargestValue && scores[i] != largestValue) {
                thirdLargestValue = secondLargestValue;
                secondLargestValue = scores[i];
            } else if (scores[i] > thirdLargestValue && scores[i] != secondLargestValue && scores[i] != largestValue) {
                thirdLargestValue = scores[i];
            }
        }
        for (int i = 0; i < participants; i++) {
            if (scores[i] == thirdLargestValue) {
                theAmountOfParticipantsThatWereAwardedTheBronzePrize++;
            }
        }
        System.out.println(thirdLargestValue + " " + theAmountOfParticipantsThatWereAwardedTheBronzePrize);
    }
}