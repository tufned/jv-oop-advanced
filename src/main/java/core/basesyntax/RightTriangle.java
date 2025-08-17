package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(color, "RightTriangle");
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (double) (firstLeg + secondLeg) / 2;
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
                        .append(", firstLeg: ")
                        .append(firstLeg)
                        .append(" units")
                        .append(", secondLeg: ")
                        .append(secondLeg)
                        .append(" units")
                        .append(", color: ")
                        .append(color)
        );
    }
}
