package Seminar_05.model;

import java.util.List;

public interface Repository {
    List<User> getAllUsers();

    String CreateUser(User user);

    void updateUser(User user);
}
