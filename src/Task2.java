import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String enteredName;
        String waitedName = "Вячеслав";
        String exit = " ";

        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Введите имя или пробел для выхода:");
            enteredName = scan.nextLine();

            if (waitedName.equals(enteredName)) {
                System.out.println("Привет, Вячеслав");
            } else System.out.println("Повторите ввод или введите пробел для выхода");

        } while (!enteredName.equals(exit));

    }
}
