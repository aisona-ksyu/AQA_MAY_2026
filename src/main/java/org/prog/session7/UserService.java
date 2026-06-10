package org.prog.session7;

public class UserService {

    public void createTestUser(String email) {
        createTestUser(email, "default_password", "187253715235");
    }

    public void createTestUser(String email, String password, String phoneNumber) {
        System.out.println("Creating test user");
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("Phone Number: " + phoneNumber);
    }
}
