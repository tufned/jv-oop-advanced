package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_FIGURE_RADIUS = 10;
    private static final int AVAILABLE_FIGURES_NUMBER = 5;
    private static final int FIGURE_PARAM_BOUND = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int randomIndex = random.nextInt(AVAILABLE_FIGURES_NUMBER);
        return switch (randomIndex) {
            case 0 -> new Circle(
                    colorSupplier.getRandomColor(),
                    random.nextInt(FIGURE_PARAM_BOUND));
            case 1 -> new Square(
                    colorSupplier.getRandomColor(),
                    random.nextInt(FIGURE_PARAM_BOUND));
            case 2 ->
                    new Rectangle(
                            colorSupplier.getRandomColor(),
                            random.nextInt(FIGURE_PARAM_BOUND),
                            random.nextInt(FIGURE_PARAM_BOUND));
            case 3 ->
                    new IsoscelesTrapezoid(
                            colorSupplier.getRandomColor(),
                            random.nextInt(FIGURE_PARAM_BOUND),
                            random.nextInt(FIGURE_PARAM_BOUND),
                            random.nextInt(FIGURE_PARAM_BOUND));
            case 4 ->
                    new RightTriangle(
                            colorSupplier.getRandomColor(),
                            random.nextInt(FIGURE_PARAM_BOUND),
                            random.nextInt(FIGURE_PARAM_BOUND));
            default -> getDefaultFigure();
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_FIGURE_RADIUS);
    }
}
