package Lesson5BookPhone;

import Lesson5BookPhone.Controller.Controller;
import Lesson5BookPhone.Model.repository.FileOperation;
import Lesson5BookPhone.Model.repository.GBRepositoty;
import Lesson5BookPhone.Model.repository.UserRepository;
import Lesson5BookPhone.view.UserView;

import static Lesson5BookPhone.util.DBConnector.DB_PATH;
import static Lesson5BookPhone.util.DBConnector.createDB;

public class Main {
    public static void main(String[] args) {
        createDB();
        FileOperation fileOperation = new FileOperation(DB_PATH);
        GBRepositoty repository = new UserRepository(fileOperation);
        Controller controller = new Controller(repository);
        UserView view = new UserView(controller);
        view.run();

    }
}
