package _23_observer_pattern._01problem;

public class App {

    public static void main(String[] args) {

        var user1 = new User();
        var user2 = new User();
        var newsfeed = new Newsfeed();

        user1.setStatus("Going for a walk");
        user2.setStatus("Enjoying a coffee");

        newsfeed.printStatuses();
    }

}
