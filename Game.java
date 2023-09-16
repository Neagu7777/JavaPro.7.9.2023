import java.util.Objects;
import java.util.Scanner;

public class Game {

    private MessagePrinter messagePrinter;
    private Scanner scanner;

    public Game(MessagePrinter messagePrinter, Scanner scanner) {
        this.messagePrinter = messagePrinter;
        this.scanner = scanner;
    }

    public MessagePrinter getMessagePrinter() {
        return messagePrinter;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public void setMessagePrinter(MessagePrinter messagePrinter) {
        this.messagePrinter = messagePrinter;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(messagePrinter, game.messagePrinter) && Objects.equals(scanner, game.scanner);
    }

    public void start(Field field) {

        messagePrinter.printInfo();
        int row = scanner.nextInt();
        messagePrinter.printSecondNumber();
        int column = scanner.nextInt();

        boolean result = field.checkCell(row, column);

        if (result) {
            messagePrinter.printWinMessage();
        }
        else {
            messagePrinter.printLoseMessage();
        }
    }

}
