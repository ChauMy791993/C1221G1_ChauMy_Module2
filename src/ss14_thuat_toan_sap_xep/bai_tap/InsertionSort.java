package ss14_thuat_toan_sap_xep.bai_tap;

import java.util.Arrays;

public class InsertionSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void insertionSort(int[] list) {
        int x;
        int pos;
        for (int i = 1; i < list.length; i++) {
            x = list[i];
            pos = i;
            while (0 < pos && x < list[pos - 1]) {
                list[pos] = list[pos - 1];
                pos--;
            }
            list[pos] = x;
            System.out.println("Sau lần thứ" + i + ": " + Arrays.toString(list));
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
    }
}
