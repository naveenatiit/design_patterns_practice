package _12_decorator._03_additon;

public class DeveloperUser extends UserDecorator {

    public DeveloperUser(User user) {
        super(user);
    }

    @Override
    public void printPrivileges() {
        super.printPrivileges();
        System.out.println("Can deploy to production");
    }



}
