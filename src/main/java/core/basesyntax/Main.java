package core.basesyntax;

public class Main {
    final static FiguresGenerator figuresGenerator = new FiguresGenerator();

    public static void main(String[] args) {
        Figure[] figures = figuresGenerator.generateFigures();
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
