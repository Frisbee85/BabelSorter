import java.util.Scanner;

public class ArrayBabelSorter {
    public static void main(String[] args) {

        System.out.println(" Podaj dowolne 10 liczb całkowitych , program posortuje BĄBELKOWO ;) od najmniejszego do największego.");

        Scanner scanner = new Scanner(System.in);

        int[] tab = new int[10];
        for (int i = 0; i < tab.length ; i++) {
            tab[i]= scanner.nextInt();
        }


        Sortable sorter = array -> {
            for (int i = 0; i < array.length; i++) {
                for (int j = 1; j < array.length - i; j++) {
                    if (array[j - 1] > array[j]) {
                        int temp = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = temp;
                    }
                }
            }
        };

        printArray(tab);
        sorter.sort(tab);
        printArray(tab);
        scanner.close();
    }

    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

}
