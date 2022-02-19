package ss3_mang_va_phuong_thuc_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuTrongMang {
    public static void main(String[] args) {
        int[] array = new int[10];
        int x;
        int viTriChen;
        int n = 6;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập x cần chèn :");
        x = Integer.parseInt(scanner.nextLine());
        System.out.println("vị trí cần chèn :");
        viTriChen = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }
        System.out.println("mảng trước khi chèn :");
        System.out.println(Arrays.toString(array));
        System.out.println("mảng sau khi chèn :");
        for (int i = n; i > viTriChen; i--) {
            array[i] = array[i - 1];
        }
        array[viTriChen] = x;
        System.out.println(Arrays.toString(array));

    }
}
