package _12_decorator._01_problem;

public class BasicUser implements User {

    @Override
    public void printPrivileges() {
        System.out.println("Can log in");
    }

}
