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
        String color = colorSupplier.getRandomColor();
        switch (randomIndex) {
            case 0:
                int radius = getRandomNumber();
                return new Circle(color, radius);
            case 1:
                int side = getRandomNumber();
                return new Square(color, side);
            case 2:
                int length = getRandomNumber();
                int width = getRandomNumber();
                return new Rectangle(color, length, width);
            case 3:
                int firstParallel = getRandomNumber();
                int secondParallel = getRandomNumber();
                int height = getRandomNumber();
                return new IsoscelesTrapezoid(color, firstParallel, secondParallel, height);
            case 4:
                int firstLeg = getRandomNumber();
                int secondLeg = getRandomNumber();
                return new RightTriangle(color, firstLeg, secondLeg);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_FIGURE_RADIUS);
    }

    private int getRandomNumber() {
        return random.nextInt(FIGURE_PARAM_BOUND);
    }
}
