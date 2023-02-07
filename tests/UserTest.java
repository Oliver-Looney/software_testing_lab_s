package app.tests;

import app.model.User;

public class UserTest {
    public static void main(String[] args){
        // manual tests
//        User test_user = new User("mike", "my_passwd", "Mike", "Smith", "07771234567");
//        System.out.println(test_user.toString());

        //automated

        //setup
        String test_username = "mike";
        String test_password = "my_passwd";
        String test_first_name = "Mike";
        String test_last_name = "Smith";
        String test_mobile_number = "07771234567";

        // run object under test
        User test_user = new User(test_username, test_password, test_first_name, test_last_name, test_mobile_number);

        //verify
        Boolean passed = true;

        if (test_user.getUsername() != test_username) {
            System.out.println("TC1 failed: username did not match");
            passed = false;
        }

        if (test_user.getPassword() != test_password) {
            System.out.println("TC1 failed: password did not match");
            passed = false;
        }

        if (test_user.getFirst_name() != test_first_name) {
            System.out.println("TC1 failed: first name did not match");
            passed = false;
        }

        if (test_user.getLast_name() != test_last_name) {
            System.out.println("TC1 failed: last name did not match");
            passed = false;
        }
        if (test_user.getMobile_number() != test_mobile_number) {
            System.out.println("TC1 failed: mobile number did not match");
            passed = false;
        }

        if (passed){
            System.out.println("All TCs passed");
        } else {
            System.out.println("Error");
        }

        // asserts
        assert test_user.getUsername() == test_username;
        assert test_user.getPassword() == test_password;
        assert test_user.getFirst_name() == test_first_name;
        assert test_user.getLast_name() == test_last_name;
        assert test_user.getMobile_number() == test_mobile_number;
    }
}
