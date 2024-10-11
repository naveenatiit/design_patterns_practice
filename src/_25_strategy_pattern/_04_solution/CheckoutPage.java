package _25_strategy_pattern._04_solution;

public class CheckoutPage {

    public void payForItems(PaymentMethod paymentMethod) {
        paymentMethod.pay();
    }

}
