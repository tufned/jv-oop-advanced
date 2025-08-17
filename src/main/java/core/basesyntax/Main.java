package core.basesyntax;

public class Main {
    private static final int FIGURES_LENGTH = 6;
    private static final FigureSupplier figureSupplier = new FigureSupplier();
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public static void main(String[] args) {
        Figure[] figures = generateFigures();
        for (Figure figure : figures) {
            figure.draw();
        }
    }

    private static Figure[] generateFigures() {
        Figure[] figures = new Figure[FIGURES_LENGTH];
        int halfFiguresLength = figures.length / 2;
        for (int i = 0; i < figures.length; i++) {
            figures[i] = i >= halfFiguresLength
                    ? figureSupplier.getDefaultFigure()
                    : figureSupplier.getRandomFigure();
        }
        return figures;
    }
}
