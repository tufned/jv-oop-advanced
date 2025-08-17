package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstParallel;
    private int secondParallel;
    private int height;

    public IsoscelesTrapezoid(String color, int firstParallel, int secondParallel, int height) {
        super(color, "IsoscelesTrapezoid");
        this.firstParallel = firstParallel;
        this.secondParallel = secondParallel;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((double) (firstParallel + secondParallel) / 2) * height;
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
                        .append(", firstParallel: ")
                        .append(firstParallel)
                        .append(" units")
                        .append(", secondParallel: ")
                        .append(secondParallel)
                        .append(" units")
                        .append(", height: ")
                        .append(height)
                        .append(" units")
                        .append(", color: ")
                        .append(getColor())
        );
    }
}
