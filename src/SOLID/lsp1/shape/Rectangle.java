package SOLID.lsp1.shape;

import SOLID.lsp1.Quadreliteral;

public class Rectangle implements Quadreliteral {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return getSideA()*getSideB();
    }


    @Override
    public double getSideA() {
        return this.sideA;
    }
    public double getSideB() {
        return this.sideB;
    }
}
