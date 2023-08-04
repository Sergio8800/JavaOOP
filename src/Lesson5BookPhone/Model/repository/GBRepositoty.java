package Lesson5BookPhone.Model.repository;

import Lesson5BookPhone.Model.User;

import java.util.List;
import java.util.Optional;

public interface GBRepositoty {
    List<User> findAll();
    User create(User user);
    Optional<User> findById(Long id);
    Optional<User> update(Long userId, User update);
    boolean delete(Long id);
    User createTemporaryUser();
}
