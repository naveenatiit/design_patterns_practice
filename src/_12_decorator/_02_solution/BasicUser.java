package _12_decorator._02_solution;

public class BasicUser implements User {

    @Override
    public void printPrivileges() {
        System.out.println("Can log in");
    }

}
