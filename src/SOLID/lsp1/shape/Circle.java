package SOLID.lsp1.shape;

import SOLID.lsp1.Quadreliteral;

public class Circle implements Quadreliteral {
    private double sideA; // radius

    public Circle(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public double getArea() {
        return Math.PI*getSideA()*getSideA();
    }

    @Override
    public double getSideA() {
        return this.sideA;
    }
}
