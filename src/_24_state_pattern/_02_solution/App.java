package _24_state_pattern._02_solution;

public class App {

    public static void main(String[] args) {

        var auction = new Auction();
        auction.startAuction();
        auction.placeBid();

        auction.startAuction();

        auction.closeAuction();
        auction.placeBid();

        auction.closeAuction();
    }

}
