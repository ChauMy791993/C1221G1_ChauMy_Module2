package ss3_mang_va_phuong_thuc_java.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class DemSoLuongSinhVien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.println("nhập số lượng sinh viên");
            size = Integer.parseInt(scanner.nextLine());
            if (size > 30) {
                System.out.println("số lượng không quá 30");
            }
        } while (size > 30);
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("nhập điểm của sinh viên thứ " + (i + 1));
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        int count = 0;
        System.out.println("danh sách điểm thi :");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
            if (array[i] < 10 && array[i] > 5) {
                count++;
            }
        }
        System.out.println("\n số lượng sinh viên thi đỗ : "+count);
    }
}
