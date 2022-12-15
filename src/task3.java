import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        var massiv = new ArrayList<Double>();
        System.out.println("Введите элементы массива и слово quit в конце: ");
        while (true) {
            var nextLine = in.nextLine();
            if (Objects.equals(nextLine, "quit")) break;
            massiv.add(Double.parseDouble(nextLine));
        }
        System.out.print("Исходный массив: ");
        for (var elements: massiv) System.out.print(elements + " ");
        System.out.print("\nМассив после обработки: ");
        var newmassiv = new ArrayList<Double>();
        newmassiv.add(massiv.get(0));
        for (int i = 1; i < massiv.size(); i++)
            if (massiv.get(i) > newmassiv.get(newmassiv.size() - 1))
                newmassiv.add(massiv.get(i));
        for (var elements: newmassiv) {
            System.out.print(elements + " ");
        }
        in.close();
    }
}


