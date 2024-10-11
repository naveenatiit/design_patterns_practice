package _17_chain_of_responsibility_behavioural_dp._03_challenge;

public class App {

    public static void main(String[] args) {
        var request = new WithdrawalRequest(20, WithdrawalRequest.Currency.USD);
        var atm = new UsDollarATM();
        atm.dispense(request);
    }

}
