package Seminar_05.model;

import java.util.ArrayList;
import java.util.List;

public class RepositoryFile implements Repository {

    private UserMapper mapper = new UserMapper();
    private FileOperation fileOperation;

    public RepositoryFile(FileOperation fileOperation) {
        this.fileOperation = fileOperation;
    }

    @Override
    public List<User> getAllUsers() {
        List<String> lines = fileOperation.readAllLines();
        List<User> users = new ArrayList<>();
        for (String line : lines) {
            users.add(mapper.mapDot(line));
        }
        return users;
    }

    @Override
    public String CreateUser(User user) {
        List<User> users = getAllUsers();
        int max = 0;
        for (User item : users) {
            int id = Integer.parseInt(item.getId());
            if (max < id) {
                max = id;
            }
        }
        int newId = max + 1;
        String id = String.format("%d", newId);
        user.setId(id);
        users.add(user);
        saveUser(users);
        return id;
    }

    @Override
    public void updateUser(User user) {
        List<User> users = getAllUsers();
        for (User item : users) {
            if (item.getId().equals(user.getId())) {
                item.setFirstName(user.getFirstName());
                item.setLastName(user.getLastName());
                item.setPhone(user.getPhone());
            }
        }
        saveUser(users);
    }

    @Override
    public void deleteUser(String userId) {
        List<User> users = getAllUsers();
        for (User item : users) {
            if (item.getId().equals(userId)) {
                users.remove(item);
            }
        }
        saveUser(users);
    }
    
    private void saveUser(List<User> users) {
        List<String> lines = new ArrayList<>();
        for (User item : users) {
            lines.add(mapper.mapDot(item));
        }
        fileOperation.saveAllLines(lines);
    }
}
