import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Double> massiv = new ArrayList<Double>();
        System.out.println("Введите элементы массива и слово quit в конце: ");
        while (true) {
            String nextLine = in.nextLine();
            if (Objects.equals(nextLine, "quit")) break;
            double item = Double.parseDouble(nextLine);
            massiv.add(item);
        }
        System.out.print("Исходный массив: ");
        for (var elements: massiv) System.out.print(elements + " ");
        System.out.print("\nМассив после обработки: ");
        double summachisel = 0.0;
        for (int i = 0; i < massiv.size(); i++) {
            summachisel += massiv.get(i);
            double result = summachisel / (double)(i+1);
            System.out.print(result + " ");
        }
        in.close();
    }

}

