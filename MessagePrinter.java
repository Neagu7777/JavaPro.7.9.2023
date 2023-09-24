public class MessagePrinter {

    public void printStartInfo() {
        System.out.println("Игра началась");
        System.out.println("-------------");
    }

    public void printInfo() {
        System.out.println("Введите число:");
    }

    public void printSecondNumber() {
        System.out.println("Введите второе число:");
    }

    public void printWinMessage() {
        System.out.println("Молодец");
    }

    public void printLoseMessage() {
        System.out.println("Обидно");
    }

    public void printEndGame(int value) {
        System.out.println("Вы удачно поразили " + value + " целей");
    }


}