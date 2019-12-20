package impl;

import data.User;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        UserServiceImpl userService = new UserServiceImpl();

        User admin = new User(1l, "admin", "admin");
        User pablo = new User(2l, "pablo", "pablo");
        User enrico = new User(3l, "enrico", "enrico");

        userService.addUser(admin);
        userService.addUser(pablo);
        userService.addUser(enrico);

        List<User> users = userService.getAllUsers();
        userService.removeUserById(pablo.getUserId());
        users = userService.getAllUsers();
    }
}
