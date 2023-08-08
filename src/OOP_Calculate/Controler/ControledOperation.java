package OOP_Calculate.Controler;

import OOP_Calculate.Main;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControledOperation {
    static Logger LOGGER;

    static Scanner scanner = new Scanner(System.in);

    public  double calc(double num1, double num2, char operation){
        LOGGER = Logger.getLogger(Main.class.getName());
        double result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                LOGGER.log(Level.WARNING,"ошибка ввода операции");
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());//рекурсия
        }
        return result;
    }
    public  double getInt(){
        System.out.println("Введите число:");
        double num;
        if(scanner.hasNextDouble()){
            num = scanner.nextDouble();
        } else {
            LOGGER.log(Level.WARNING, "Warning!!!");
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();//рекурсия
            num = getInt();
        }
        return num;
    }
    public  char getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            LOGGER.log(Level.WARNING, "Warning!!!");
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();//рекурсия
            operation = getOperation();
        }
        return operation;
    }

}
