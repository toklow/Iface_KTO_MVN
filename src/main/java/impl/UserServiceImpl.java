package impl;

import api.UserService;
import data.User;

import java.util.ArrayList;
import java.util.List;


public class UserServiceImpl implements UserService {


    private List<User> users;

    public UserServiceImpl() {
        this.users = new ArrayList<User>();
     }
    public UserServiceImpl(List<User> users) {
        this.users = new ArrayList<User>(users);

    }

    public List<User> getAllUsers() {
        return this.users;
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public void removeUserById(Long userId) {
        for (User user : this.users)
        {
            if (user.getUserId() == userId)
            {
                users.remove(user);
                break;
            }
        }
    }
}
