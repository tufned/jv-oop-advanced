package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(Color color, int radius) {
        super(color, "Circle");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
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
                        .append(", radius: ")
                        .append(radius)
                        .append(" units")
                        .append(", color: ")
                        .append(getColor())
        );
    }
}
