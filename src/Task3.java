import java.util.ArrayList;

public class Task3 {

    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(0);
        list.add(6);
        list.add(297);
        list.add(7);
        list.add(8);
        list.add(15);

        listOutput(list);

    }

    public static void listOutput (ArrayList <Integer> list) {

        ArrayList listResult = new ArrayList();

        for (Integer e: list
             ) {
            if ((e % 3) == 0) {
            listResult.add(e);}
        }

        String temp = "";
        for (Object e: listResult
        ) {
            temp = temp + e + " ";
        }

        System.out.println(temp);

    }

}
