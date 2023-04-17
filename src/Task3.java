import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Double enteredNum;
        Double exit = .0;

        Scanner scan = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();

        do {
            System.out.print("Введите число или 0 для получения результата:");
            enteredNum = scan.nextDouble();

            if (enteredNum == .0) {
                scan.close();
            } else list.add(enteredNum);

        } while (!enteredNum.equals(exit));

        listOutput(list);

    }

    public static void listOutput(ArrayList<Double> list) {

        ArrayList<Double> listResult = new ArrayList<>();

        for (Double e : list
        ) {
            if ((e % 3) == 0) {
                listResult.add(e);
            }
        }

        String temp = "";
        for (Object e : listResult
        ) {
            temp = temp + e + " ";
        }
        System.out.print("Среди чисел, введеных ранее есть числа кратные трем: ");
        System.out.println(temp);

    }

}
