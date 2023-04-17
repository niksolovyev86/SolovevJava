import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        double enteredNum;

        Scanner scan = new Scanner(System.in);


        do {
            System.out.print("Введите целое число или ноль для выхода:");
            enteredNum = scan.nextDouble();

            if (enteredNum > .7) {
                System.out.println("Привет");
            } else if (enteredNum == .0) {
                System.out.println("Выход");
            } else
                System.out.println("Повторите ввод или введите ноль для выхода");

        } while (enteredNum != .0);

    }
}
