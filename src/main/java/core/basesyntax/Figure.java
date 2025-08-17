package core.basesyntax;

public abstract class Figure implements AreaCalculator {
    Color color;
    String name;

    public Figure(Color color, String name) {
        this.color = color;
        this.name = name;
    }

    abstract void draw();
}
