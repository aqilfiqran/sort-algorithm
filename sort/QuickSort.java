package sort;

/**
 * algoritma quick sort
 */
public class QuickSort {
    int data[];

    /**
     * method constructor
     * 
     * @param data
     */
    public QuickSort(int data[]) {
        this.data = data;
    }

    /**
     * untuk menukarkan data array
     * 
     * @param i data a
     * @param j data b
     */
    private void swap(int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    /**
     * fungsi utama untuk melakukan sorting
     */
    public void sort() {
        this.sort(0, data.length - 1);
    }

    /**
     * mengembalikan data array
     * 
     * @return int[]
     */
    public int[] getData() {
        return this.data;
    }

    /**
     * bagian penting quick sort yang menjalankan algoritma setelah data dipartisi
     * 
     * @param awal index awal
     * @param n    index total
     * @return int
     */
    private int partisi(int awal, int n) {
        int i = awal + 1;
        int piv = data[awal];
        for (int j = awal + 1; j <= n; j++) {
            if (data[j] < piv) {
                swap(i, j);
                i += 1;
            }
        }
        swap(awal, i - 1);
        return i - 1;
    }

    /**
     * algoritma quick sort
     * 
     * @param awal index awal
     * @param n    total data
     */
    public void sort(int awal, int n) {
        if (awal < n) {
            int piv_pos = partisi(awal, n);
            sort(awal, piv_pos - 1);
            sort(piv_pos + 1, n);
        }
    }
}