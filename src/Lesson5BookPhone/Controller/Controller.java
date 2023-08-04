package Lesson5BookPhone.Controller;

import Lesson5BookPhone.Model.User;
import Lesson5BookPhone.Model.repository.GBRepositoty;

import java.util.List;
import java.util.Objects;

public class Controller {
    private final GBRepositoty repository;

    public Controller(GBRepositoty repository) {
        this.repository = repository;
    }

    public void saveUser(User user) {
        repository.create(user);
    }

    public User readUser(Long userId) throws Exception {
        List<User> users = repository.findAll();
        for (User user : users) {
            if (Objects.equals(user.getId(), userId)) {
                return user;
            }
        }

        throw new RuntimeException("User not found");
    }

    public void updateUser(String userId, User update) {
        update.setId(Long.parseLong(userId));
        repository.update(Long.parseLong(userId), update);
    }

    public void deleteUser(String userId) {
        repository.delete(Long.parseLong(userId));
    }

    public List<User> readAll() {
        return repository.findAll();
    }

    public User createUser() {
        return repository.createTemporaryUser();
    }
}
