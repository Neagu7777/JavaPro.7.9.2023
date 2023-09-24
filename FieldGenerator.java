import java.util.Random;

public class FieldGenerator {

    private static final int SIZE_OF_FIELD = 10;
    private static final int PERCENTS = 100;
    private static final int SUCCESS_PERCENT = 50;


    public Field generateField() {
        Random random = new Random();

        Cell[][] cells = new Cell[SIZE_OF_FIELD][SIZE_OF_FIELD];

        for (int i = 0; i < SIZE_OF_FIELD; i++) {
            for (int j = 0; j < SIZE_OF_FIELD; j++) {
                int number = random.nextInt(PERCENTS);//0-99
                boolean isShip = (number < SUCCESS_PERCENT);//true, если будет значение от 0 до 9
                cells[i][j] = new Cell(isShip);
            }
        }

        Field field = new Field(cells);

        return field;
    }
}