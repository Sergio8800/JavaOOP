package SOLID.lsp1;

public class ShapeView {
    private Quadreliteral quadreliteral;

    public ShapeView(Quadreliteral quadreliteral) {
        this.quadreliteral = quadreliteral;
    }
    public void showArea() {

        System.out.printf("Area of %s equal:", quadreliteral.getClass().getSimpleName());
        System.out.println(quadreliteral.getArea());
    }
}
