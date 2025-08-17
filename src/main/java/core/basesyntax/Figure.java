package core.basesyntax;

public abstract class Figure implements AreaCalculator {
    private Color color;
    private String name;

    public Figure(Color color, String name) {
        this.color = color;
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void draw();
}
