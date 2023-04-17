import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String enteredName;
        String waitedName = "Вячеслав";
        String exit = " ";

        Scanner scan = new Scanner(System.in);

            System.out.print("Введите имя:");
            enteredName = scan.nextLine();

            if (waitedName.equals(enteredName)) {
                System.out.println("Привет, Вячеслав");
            } else System.out.println("Нет такого имени.");
            scan.close();



    }
}
