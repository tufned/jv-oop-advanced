package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(Color color, int side) {
        super(color, "Square");
        this.side = side;
    }

    @Override
    public double getArea() {
        return (double) side * side;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder("Figure: ");
        System.out.println(
                builder
                        .append(getName())
                        .append(", area: ")
                        .append(getArea())
                        .append(" sq. units")
                        .append(", side: ")
                        .append(side)
                        .append(" units")
                        .append(", color: ")
                        .append(getColor())
        );
    }
}
