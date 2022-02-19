package ss3_mang_va_phuong_thuc_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TimPhanTuLonNhatMang2Chieu {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter " + array.length + " rows and " +
                array[0].length + " columns: ");
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {

                System.out.println(array[row][column]+" ");
                array[row][column] = scanner.nextInt();
            }
        }
        System.out.println(a);
    }
}
