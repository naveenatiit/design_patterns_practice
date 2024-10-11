package _06factory_pattern._01problem;

import _06factory_pattern._02solution.BusTicket;

public class TicketOffice {


    public static void main(String[] args) {
        buyABusTicket();
    }

    private static void buyABusTicket() {
        var ticket = new BusTicket();
        System.out.println("One bus ticket purchased. The price is $" + ticket.getPrice() + ".");

        var ticket2 = new TrainTicket();
        System.out.println("One train ticket purchased. The price is $" + ticket2.getPrice() + ".");

    }

}
