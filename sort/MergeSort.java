package sort;

/**
 * algoritma pengurutan merge
 */
public class MergeSort {
    int data[];

    /**
     * method constructor
     * 
     * @param data
     */
    public MergeSort(int data[]) {
        this.data = data;
    }

    /**
     * fungsi untuk melakukan sorting
     */
    public void sort() {
        this.sort(0, data.length - 1);
    }

    /**
     * mengembalikan data
     * 
     * @return int[]
     */
    public int[] getData() {
        return this.data;
    }

    /**
     * bagian penting dari merge sort
     * 
     * @param awal   index awal
     * @param tengah index partisi
     * @param n      index total
     */
    private void merge(int awal, int tengah, int n) {
        int p = awal, q = tengah + 1, k = 0;

        int temp[] = new int[n - awal + 1];

        for (int i = awal; i <= n; i++) {
            if (p > tengah)
                temp[k++] = data[q++];

            else if (q > n)
                temp[k++] = data[p++];

            else if (data[p] < data[q])
                temp[k++] = data[p++];

            else
                temp[k++] = data[q++];
        }
        for (int i = 0; i < k; i++) {
            data[awal++] = temp[i];
        }
    }

    /**
     * algoritma merge sort
     * 
     * @param awal index awal
     * @param n    total data
     */
    public void sort(int awal, int n) {
        if (awal < n) {
            int tengah = (awal + n) / 2;
            sort(awal, tengah);
            sort(tengah + 1, n);

            merge(awal, tengah, n);
        }
    }
}