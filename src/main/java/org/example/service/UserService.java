package org.example.service;

import org.example.entity.User;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class UserService {
    List<User> users = new ArrayList<>();
    CRUDFileServlet file;
    public  UserService() {
        file = new CRUDFileServlet();
        users.add(new User("Alex", "Malek", 21));
        users.add(new User("Mary", "Cris", 18));
    }

    public File getUsers() {
        return file.addToFile(users);
    }
}
