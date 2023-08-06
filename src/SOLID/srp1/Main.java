package SOLID.srp1;

import SOLID.srp1.figure.Point;
import SOLID.srp1.figure.Square;
import SOLID.srp1.figure.SquareAreaCalculator;
import SOLID.srp1.figure.SquarePaint;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(new Point(1,1), 5);
        SquareAreaCalculator calculator = new SquareAreaCalculator(square);
        SquarePaint paint = new SquarePaint(square);
        System.out.printf("Square area: %d \n", calculator.getArea());
        paint.draw();
    }

}
