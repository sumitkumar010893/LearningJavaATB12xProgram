package tasks;

public class MultiLevelLoginSystem {
    public static void main(String[] args) {
        SuperAdmin superAdmin = new SuperAdmin();
        superAdmin.logIn();
        superAdmin.accessAdminPanel();
        superAdmin.shutdownSystem();
    }
}

class User{
    public void logIn(){
        System.out.println("user login");
    }
}

class AdminUser extends User{
    public void accessAdminPanel() {
        System.out.println("Accessing Admin Panel...");
    }
}

class SuperAdmin extends AdminUser {
    public void shutdownSystem() {
        System.out.println("System is shutting down...");
    }
}
