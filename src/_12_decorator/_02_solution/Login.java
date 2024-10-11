package _12_decorator._02_solution;

public class Login {

    public static void main(String[] args) {

        var user = new BasicUser();
        user.printPrivileges();

        System.out.println();

        var adminUser = new AdminUser(user);
        adminUser.printPrivileges();

    }

}
