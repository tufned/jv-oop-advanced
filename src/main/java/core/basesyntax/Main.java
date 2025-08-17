package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FiguresGenerator figuresGenerator = new FiguresGenerator();
        Figure[] figures = figuresGenerator.generateFigures();
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
