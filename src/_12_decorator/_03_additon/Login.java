package _12_decorator._03_additon;

public class Login {

    public static void main(String[] args) {

        var user = new BasicUser();
        user.printPrivileges();

        System.out.println();

        var adminUser = new AdminUser(user);
        adminUser.printPrivileges();

        var developerUser = new DeveloperUser(adminUser);
        developerUser.printPrivileges();

    }

}
