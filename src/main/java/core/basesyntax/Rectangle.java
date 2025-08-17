package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(Color color, int length, int width) {
        super(color, "Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return (double) length * width;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder("Figure: ");
        System.out.println(
                builder
                        .append(name)
                        .append(", area: ")
                        .append(getArea())
                        .append(" sq. units")
                        .append(", length: ")
                        .append(length)
                        .append(" units")
                        .append(", width: ")
                        .append(width)
                        .append(" units")
                        .append(", color: ")
                        .append(color)
        );
    }
}
