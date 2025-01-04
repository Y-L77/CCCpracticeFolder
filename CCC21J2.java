import java.util.*; //CCC '21 J2 - Silent Auction

public class CCC21J2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bids = sc.nextInt();
        sc.nextLine(); //consume the newline after reading the number of bids

        String[] BidderNames = new String[bids];
        int[] bidAmounts = new int[bids];
        int topBidder = 0;
        int index = 0;

        for (int i = 0; i < bids; i++) {
            BidderNames[i] = sc.nextLine(); 
            bidAmounts[i] = sc.nextInt();
            sc.nextLine();
        }

        for (int i = 1; i < bids; i++) {
            if (bidAmounts[i] > bidAmounts[topBidder]) {
                topBidder = i;
            }
        }
        System.out.println(BidderNames[topBidder]);
    }
}