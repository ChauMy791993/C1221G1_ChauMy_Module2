package ss3_mang_va_phuong_thuc_java.bai_tap;

import java.util.Arrays;

public class GopMang {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[4];
        int[] array3 = new int[9];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = i + 1;
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i + 2;
        }
        System.out.println("mảng của array1 :");
        System.out.println(Arrays.toString(array1));
        System.out.println("mảng của array2 :");
        System.out.println(Arrays.toString(array2));
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[array1.length + i] = array2[i];
        }
        System.out.println("mảng của array 3 :");
        System.out.println(Arrays.toString(array3));
    }
}
