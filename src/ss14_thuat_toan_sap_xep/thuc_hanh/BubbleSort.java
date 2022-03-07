package ss14_thuat_toan_sap_xep.thuc_hanh;

import java.util.Arrays;

public class BubbleSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void bubbleSort(int[] list) {
        boolean flag = true;
        for (int i = 0; i < list.length && flag; i++) {
            flag = false;
            for (int j = list.length - 1; i < j; j--) {
                if (list[j] < list[j - 1]) {
                    int temp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = temp;
                    flag = true;
                }
            }
            System.out.println("Lần thứ" + i + ": " + Arrays.toString(list));
        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
    }

}

