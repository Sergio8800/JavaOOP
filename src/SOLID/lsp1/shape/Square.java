package SOLID.lsp1.shape;

import SOLID.lsp1.Quadreliteral;

public class Square implements Quadreliteral {
    private double sideA;

    public Square(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public double getArea() {
        return getSideA()*2;
    }

    @Override
    public double getSideA() {
        return this.sideA;
    }
}
