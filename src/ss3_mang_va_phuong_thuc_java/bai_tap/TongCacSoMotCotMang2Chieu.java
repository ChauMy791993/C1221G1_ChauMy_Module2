package ss3_mang_va_phuong_thuc_java.bai_tap;

import java.util.Scanner;

public class TongCacSoMotCotMang2Chieu {
    public static void main(String[] args) {
        int m, n;
        int cotTong;
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
        System.out.println("nhập vị trí cột cần tính");
        cotTong = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum = sum + array[i][cotTong-1];
        }
        System.out.println("tổng các số của "+cotTong+" là "+sum);

    }
}
