package homework3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Сгенерировать список объектов типа Notebook с разными значениям price и ram
// Релизовать 3 сортировки: 1 - по цене, 2 - по памяти, 3 - сначала по памяти, потом по цене
// Отсортировать тремя способами стандартными средствами (Collections#sort или List#sort)

public class NoteBookMain {
    public static void main(String[] args) {
        List<Notebook> notebooks = new ArrayList<>();
        notebooks.add(new Notebook(45000, 16));
        notebooks.add(new Notebook(20000, 8));
        notebooks.add(new Notebook(90000, 32));
        notebooks.add(new Notebook(30000, 16));
        notebooks.add(new Notebook(17000, 12));

        System.out.println("Сортировка по цене:");
        Comparator<Notebook> PriceComparator = new priceSort();
        Collections.sort(notebooks, PriceComparator);
        for (Notebook notebook : notebooks) {
            notebook.printNotebook();
        }

        System.out.println("Сортировка по оперативной памяти:");
        Collections.sort(notebooks, Comparator.comparingInt(Notebook::getRam));
        for (Notebook notebook : notebooks) {
            notebook.printNotebook();
        }

        System.out.println("Сортировка сначала по оперативной памяти, потом по цене:");
        Comparator<Notebook> RamPriceComparator = new RamPriceSort();
        Collections.sort(notebooks, RamPriceComparator);
        for (Notebook notebook : notebooks) {
            notebook.printNotebook();
        }

    }

}
