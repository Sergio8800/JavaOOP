package SOLID.srp1.figure;

public class SquareAreaCalculator {
    private Square square;

    public SquareAreaCalculator(Square square) {
        this.square = square;
    }
    public int getArea() {
        return square.getSide() * square.getSide();
    }
}
