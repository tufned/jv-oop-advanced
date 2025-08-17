package core.basesyntax;

public class FiguresGenerator {
    private final int FIGURES_LENGTH = 6;
    private FigureSupplier figureSupplier = new FigureSupplier();

    public Figure[] generateFigures() {
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
