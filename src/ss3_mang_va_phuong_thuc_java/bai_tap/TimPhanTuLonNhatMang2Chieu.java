package ss3_mang_va_phuong_thuc_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TimPhanTuLonNhatMang2Chieu {
    public static void main(String[] args) {
        int m, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số dòng :");
        m = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập số cột :");
        n = Integer.parseInt(scanner.nextLine());
        int[][] array = new int[m][n];
        System.out.println("nhập các phần tử cho ma trận :");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("A[" + i + "][" + j + "]=");
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        int max = array[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max<array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("phần tử có giá trị lớn nhất : " + max);
    }
}
