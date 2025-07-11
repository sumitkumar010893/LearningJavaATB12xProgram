package tasks.Polymorphism;

public class UserLoginTest {
    public static void main(String[] args) {
        User adminUser = new AdminUser();
        User regUser = new RegularUser();
        adminUser.login();
        regUser.login();
    }
}

class User{
    void login() {
        System.out.println("User login");
    }
}

class AdminUser extends User {
    @Override
    void login() {
        System.out.println("Admin user login: Access to admin dashboard");
    }
}

class RegularUser extends User {
    @Override
    void login() {
        System.out.println("Regular user login: Access to user home page");
    }
}

