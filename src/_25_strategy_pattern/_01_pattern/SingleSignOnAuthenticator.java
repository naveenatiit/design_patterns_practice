package _25_strategy_pattern._01_pattern;

public class SingleSignOnAuthenticator implements Authenticator {

    @Override
    public void logIn() {
        System.out.println("Logging in with single sign-on.");
    }

}
