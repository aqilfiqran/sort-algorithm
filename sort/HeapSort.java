package sort;

/**
 * algoritma pengurutan heapsort
 */
public class HeapSort {
    int data[];

    public HeapSort(int data[]) {
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
     * merupakan bagian penting dari heapsort
     * 
     * @param n total
     * @param i index
     */
    private void Root(int n, int i) {
        int root = i;
        int left = 2 * i + 1;
        int right = left + 1;

        if (left < n && data[left] > data[root])
            root = left;

        if (right < n && data[right] > data[root])
            root = right;

        if (root != i) {
            swap(i, root);

            Root(n, root);
        }
    }

    /**
     * algoritma utama dari heapsort
     * 
     * @param n total data
     */
    public void sort(int n) {
        for (int i = n / 2 - 1; i >= 0; i--)
            Root(n, i);

        for (int i = n - 1; i >= 0; i--) {
            swap(0, i);

            Root(i, 0);
        }
    }

    /**
     * fungsi untuk melakukan sorting
     */
    public void sort() {
        this.sort(data.length);
    }

    /**
     * mengembalikan semua data
     * 
     * @return int[]
     */
    public int[] getData() {
        return this.data;
    }
}