package _13_facade._04_solution;

public class App {

    public static void main(String[] args) {

        var sendMessageFacade = new SendMessageFacade();
        sendMessageFacade.sendMessage();

    }

}
