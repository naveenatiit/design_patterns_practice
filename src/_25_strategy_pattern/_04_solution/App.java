package _25_strategy_pattern._04_solution;

public class App {

    public static void main(String[] args) {

        var checkoutPage = new CheckoutPage();

        checkoutPage.payForItems(PaymentMethod.card);
        checkoutPage.payForItems(PaymentMethod.bankTransfer);

    }

}
