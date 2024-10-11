package _26_template_pattern._02_solution;

public abstract class Email {

    public void sendGreeting() {
        System.out.println("Hello,");
    }

    public abstract void sendMessageBody();

    public void sendClosing() {
        System.out.println("Best regards, Sam");
    }
}
