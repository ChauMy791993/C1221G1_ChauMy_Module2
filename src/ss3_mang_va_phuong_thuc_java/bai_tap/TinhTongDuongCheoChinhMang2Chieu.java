package ss3_mang_va_phuong_thuc_java.bai_tap;

import java.util.Scanner;

public class TinhTongDuongCheoChinhMang2Chieu {
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
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i][i];
        }
        System.out.println("tổng của đường chéo chính là " + sum);
    }
}
