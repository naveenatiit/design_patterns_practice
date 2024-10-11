package _21_mediator._01_problem;

public class App {

    public static void main(String[] args) {

        var board = new Board();
        var ticket = new Ticket();
        var assignee = new Assignee();

        assignee.pickUpTicket(ticket, board);
        System.out.println();
        assignee.resolveTicket(ticket, board);


    }

}
