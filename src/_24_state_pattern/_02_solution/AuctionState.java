package _24_state_pattern._02_solution;

public interface AuctionState {

    void startAuction(Auction auction);
    void closeAuction(Auction auction);
    void placeBid();

}
