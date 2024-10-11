package _12_decorator._03_additon;

public class AdminUser extends UserDecorator {

    public AdminUser(User user) {
        super(user);
    }

    @Override
    public void printPrivileges() {
        super.printPrivileges();
        System.out.println("Can create new users");
    }

}
