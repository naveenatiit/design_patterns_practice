package _12_decorator._03_additon;

public class BasicUser implements User {

    @Override
    public void printPrivileges() {
        System.out.println("Can log in");
    }

}
