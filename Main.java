import java.util.Scanner;

public class Main {

    public Main() {

    }

    public static void main(String[] args) {
        MessagePrinter messagePrinter = new MessagePrinter();
        Scanner scanner = new Scanner(System.in);
        FieldGenerator fieldGenerator = new FieldGenerator();

        Field field = fieldGenerator.generateField();

        System.out.println(field);

        Game game = new Game(messagePrinter, scanner);
        game.start(field);


    }
}
/*
 1 уровень сложности: Улучшить наш морской бой
1) Все числа в классе FieldGenerator вынести,
как private final static переменные (константы) прямо в этом классе
2) Добавить классам, описывающим структуры (поле, например) гетеры,
сетеры и реализовать все нужные методы из класса object
3) Добавить возможность "стрелять" не 1 раз, а 10 раз. ввести подсчет очков
 */