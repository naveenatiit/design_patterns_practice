package _25_strategy_pattern._03_challenge;

public class App {

    public static void main(String[] args) {

        var checkoutPage = new CheckoutPage();

        checkoutPage.payWithCard();
        checkoutPage.payByBankTransfer();

    }

}
