package OOP_Calculate.View;
import OOP_Calculate.Controler.ControledOperation;
import OOP_Calculate.Controler.Logg;
import OOP_Calculate.Main;

import java.io.FileInputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class View {
    Scanner sc = new Scanner(System.in);
//    Logg logg = new Logg();
    static Logger LOGGER;
//    static {
//        try(FileInputStream ins = new FileInputStream(" log.config")){
//            LogManager.getLogManager().readConfiguration(ins);
//            LOGGER = Logger.getLogger(Main.class.getName());
//        }catch (Exception ignore){
//            ignore.printStackTrace();
//        }
//    }

    public void run() {
        LOGGER = Logger.getLogger(Main.class.getName());
//        Logg logg = new Logg();
        ControledOperation controller = new ControledOperation();
        Command com  ;
        printActions();
        while (true){
            try {
                String command = sc.nextLine();
                System.out.println("-".repeat(30));
                com = Command.valueOf(command);
                if (com == Command.EXIT) return;
                switch (com) {
                    case CLCT:
                        LOGGER.log(Level.INFO, "Вводим числа для операции");

                        double num1 = controller.getInt();
                        double num2 = controller.getInt();
                        LOGGER.log(Level.INFO, "Вводим числа операцию над числами");
                        char operation = controller.getOperation();
                        LOGGER.log(Level.INFO, "Вводим результат");
                        double result = controller.calc(num1,num2,operation);
                        System.out.println("Результат операции: "+result);
                        printActions();
                }

            }
            catch(IllegalArgumentException e) {
                LOGGER.log(Level.WARNING, "Warning!!!");
                System.out.println("Ошибка ввода: "+ e);
                printActions();
            }


        }
    }

    private void printActions(){
        String textBlock = """
                Available actions:
                EXIT -> GO OUT
                CLCT
                Введите необходимую команду:""";
        System.out.print(textBlock + " ");
    }
    }




