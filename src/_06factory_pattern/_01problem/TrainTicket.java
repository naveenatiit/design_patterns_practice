package _06factory_pattern._01problem;

import _06factory_pattern._02solution.Ticket;

public class TrainTicket implements Ticket {

    @Override
    public int getPrice() {
        return 7;
    }

}
