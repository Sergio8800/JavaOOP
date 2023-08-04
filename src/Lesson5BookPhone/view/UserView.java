package Lesson5BookPhone.view;

import Lesson5BookPhone.Controller.Controller;
import Lesson5BookPhone.Model.User;
import Lesson5BookPhone.util.Commands;

import java.util.List;
import java.util.Scanner;

public class UserView {
    Scanner sc = new Scanner(System.in);
    private final Controller Controller;

    public UserView(Controller userController) {
        this.Controller = userController;
    }

    public void run(){
        Commands com;

        while (true) {
            printActions();
            String command = sc.nextLine();
            System.out.println("-".repeat(30));
            com = Commands.valueOf(command);
            if (com == Commands.EXIT) return;
            switch (com) {
                case SHOW:
                case S:
                    List<User> users = Controller.readAll();
                    System.out.println(users);
                    break;
                case CREATE:
                case C:
                    Controller.saveUser(Controller.createUser());
                    break;
                case READ:
                case R:
                    System.out.print("Введите id пользователя для просмотра ");
                    String id = sc.nextLine();
                    try {
                        User user = Controller.readUser(Long.parseLong(id));
                        System.out.println(user);
                        System.out.println();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case DELETE:
                case D:
                    System.out.print("Введите id пользователя для удаления ");
                    String id1 = sc.nextLine();
                    Controller.deleteUser(id1);
                    break;
                case UPDATE:
                case U:
                    System.out.println("Введите id пользователя для модернизации ");
                    String userId = sc.nextLine();
                    Controller.updateUser(userId, Controller.createUser());
            }
        }
    }

    private void printActions(){
        String textBlock = """
                Available actions:
                EXIT -> GO OUT
                SHOW OR S
                CREATE OR C
                READ OR R
                UPDATE OR U
                DELETE OR D
                
                Введите необходимую команду:""";
        System.out.print(textBlock + " ");
    }
}
