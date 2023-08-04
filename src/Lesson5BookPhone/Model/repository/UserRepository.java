package Lesson5BookPhone.Model.repository;

import Lesson5BookPhone.Model.User;
import Lesson5BookPhone.util.UserMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class UserRepository implements GBRepositoty{
    private final UserMapper mapper;
    private final FileOperation operation;

    public UserRepository(FileOperation operation) {
        this.mapper = new UserMapper();
        this.operation = operation;
    }

    @Override
    public List<User> findAll() {
        List<String> lines = operation.readAll();
        List<User> users = new ArrayList<>();
        for (String line : lines) {
            users.add(mapper.toOutput(line));
        }
        return users;
    }

    @Override
    public User create(User user) {
        List<User> users = findAll();
        long max = 0L;
        for (User u : users) {
            long id = u.getId();
            if (max < id){
                max = id;
            }
        }
        long next = max + 1;
        user.setId(next);
        users.add(user);
        write(users);
        return user;
    }

    @Override
    public Optional<User> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<User> update(Long userId, User update) {
        List<User> users = findAll();
        User editUser = users.stream()
                .filter(u -> u.getId()
                        .equals(userId))
                .findFirst().orElseThrow(() -> new RuntimeException("User not found"));

        if(!update.getFirstName().isEmpty()){
            editUser.setFirstName(update.getFirstName());
        }else{
            editUser.setFirstName(editUser.getFirstName());
        }

        if(!update.getLastName().isEmpty()){
            editUser.setLastName(update.getLastName());
        }else{
            editUser.setLastName(editUser.getLastName());
        }

        if(!update.getPhone().isEmpty()){
            editUser.setPhone(update.getPhone());
        }else{
            editUser.setPhone(editUser.getPhone());
        }

//        editUser.setLastName(update.getLastName());
//        editUser.setPhone(update.getPhone());
        write(users);
        return Optional.of(update);
    }

    @Override
    public boolean delete(Long id) {
        List<User> users = findAll();
        List<User> tmp = new ArrayList<>();
        Long idTmp = 1L;

        for (User user: users) {

            if(user.getId().equals(id)){
                users.remove(user);
                System.out.println("User " + user.getId() + " was successfully deleted!");
            }
            tmp.add(user);
            user.setId(idTmp);
            idTmp++;
        }
        write(tmp);
        return true;
    }

    private void write(List<User> users) {
        List<String> lines = new ArrayList<>();
        for (User u: users) {
            lines.add(mapper.toInput(u));
        }
        operation.saveAll(lines);
    }
    @Override
    public User createTemporaryUser() {
        String firstName = prompt("Имя: ");
        String lastName = prompt("Фамилия: ");
        String phone = prompt("Номер телефона: ");
        return new User(firstName, lastName, phone);
    }
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
