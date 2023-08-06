package SOLID.lsp1;

import SOLID.lsp1.shape.Circle;
import SOLID.lsp1.shape.Rectangle;
import SOLID.lsp1.shape.Square;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> summa = new ArrayList<>();
        Quadreliteral rectangle = new Rectangle(4, 5);
        Quadreliteral square = new Square(3);
        Quadreliteral circle = new Circle(5);
        System.out.printf("In a rectangle side A = %s, side B = %s\n", rectangle.getSideA(), ((Rectangle) rectangle).getSideB());
        System.out.printf("In a square side A = %s\n", square.getSideA());
        summa.add(rectangle.getArea());
        summa.add(square.getArea());
        summa.add(circle.getArea());
        ShapeView view = new ShapeView(rectangle);
        ShapeView view1 = new ShapeView(square);
        ShapeView view2 = new ShapeView(circle);
        view.showArea();
        view1.showArea();
        view2.showArea();
        double sumArea = 0;
        for (Double el: summa ) {
            sumArea+=el;
        }
        System.out.printf("summa = %s", sumArea);

    }
}
