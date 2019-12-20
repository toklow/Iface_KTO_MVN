package service;

import data.User;
import impl.UserServiceImpl;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;




public class UserServiceTest {

    @Test
    public void testGetAllUsers() {
        //is
        List<User> users = new ArrayList<User>();
        users.add(new User(1l, "admin", "admin"));
        users.add(new User(2l,"pablo", "pablo"));

        //then
        UserServiceImpl userService = new UserServiceImpl(users);
        List<User> usersFromTestClass = userService.getAllUsers();

        //expected
        Assertions.assertEquals(users, usersFromTestClass);
    }

    @Test
    public void testAddUser() {
        //is
        List<User> users = new ArrayList<User>();
        User user = new User(1l,"admin", "admin");
        users.add(user);

        //then
        UserServiceImpl userService = new UserServiceImpl();
        userService.addUser(user);
        List<User> usersFromTestClass = userService.getAllUsers();

        //expected
        Assertions.assertEquals(users, usersFromTestClass);
    }

    @Test
    public void testRemoveUser() {
        //is
        List<User> users = new ArrayList<User>();
        User admin = new User(1l, "admin", "admin");
        User pablo = new User(2l, "pablo", "pablo");
        User enrico = new User(3l, "enrico", "enrico");
        users.add(admin);
        users.add(pablo);
        users.add(enrico);

        //then
        UserServiceImpl userService = new UserServiceImpl(users);
        userService.removeUserById(2l);
        users.remove(pablo);
        List<User> usersFromTestClass = userService.getAllUsers();

        //expected
        Assertions.assertEquals(users, usersFromTestClass);
    }

}
