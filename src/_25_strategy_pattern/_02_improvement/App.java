package _25_strategy_pattern._02_improvement;

public class App {

    public static void main(String[] args) {

        var loginPage = new LoginPage();

        loginPage.logInUser(Authenticator.passwordAuthenticator);
        loginPage.logInUser(Authenticator.singleSignOnAuthenticator);

    }

}
