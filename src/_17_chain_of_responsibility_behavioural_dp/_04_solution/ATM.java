package _17_chain_of_responsibility_behavioural_dp._04_solution;

public abstract class ATM {

    public ATM nextATM;

    public ATM(ATM nextATM) {
        this.nextATM = nextATM;
    }

    public abstract void dispense(WithdrawalRequest request);

}
