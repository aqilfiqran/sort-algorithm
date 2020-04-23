import sort.*;

/**
 * kelas utama untuk mencoba 3 algoritma pengurutan
 * 
 * @author Aqil Fiqran Dzi'Ul Haq
 * @since 4-april-2020
 */
public class Main {
    public static void main(String args[]) {
        int data[] = { 1, 34, 32, 4, 342, 34, 2, 3, 6, 1, 77, 54, 345, 234, 54, 234, 234, 23, 423, 423, 423, 4, 324, 3,
                423, 4, 2, 2222 };

        MergeSort sort = new MergeSort(data);
        // QuickSort sort = new QuickSort(data);
        // HeapSort sort = new HeapSort(data);

        sort.sort();
        for (int i : sort.getData())
            System.out.println(i);
    }
}