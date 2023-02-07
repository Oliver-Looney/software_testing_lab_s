package app.tests;

import app.model.User;

public class UserTest {
    public static void main(String[] args){
        User test_user = new User("mike", "my_passwd", "Mike", "Smith", "07771234567");
        System.out.println(test_user.toString());
    }
}
