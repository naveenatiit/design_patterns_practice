package _26_template_pattern._01_problem;

public class App {

    public static void main(String[] args) {

        var welcomeEmail = new WelcomeEmail();
        welcomeEmail.sendGreeting();
        welcomeEmail.sendMessageBody();
        welcomeEmail.sendClosing();

        var unsubscribeEmail = new UnsubscribeEmail();
        unsubscribeEmail.sendGreeting();
        unsubscribeEmail.sendMessageBody();
        unsubscribeEmail.sendClosing();

    }

}
