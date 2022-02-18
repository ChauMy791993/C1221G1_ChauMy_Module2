package ss3_mang_va_phuong_thuc_java.thuc_hanh;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chiều dài mảng :");
        size = scanner.nextInt();
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("nhập phần tử thử " + (i + 1) + " :");
            array[i] = scanner.nextInt();
        }
        System.out.println("các phần tử trong mảng : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        int min = minValue(array);
        System.out.println("phần tử nhỏ nhất của mảng : " + min);
    }

    public static int minValue(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
