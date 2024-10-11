package _17_chain_of_responsibility_behavioural_dp._03_challenge;

public class EuroATM extends ATM {

    @Override
    public void dispense(WithdrawalRequest request) {
        System.out.println("Dispensing €" + request.getAmount());
    }
}
