package ss3_mang_va_phuong_thuc_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class DemSoLanXuatHienKyTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.println("nhập kích thước mảng :");
        size = Integer.parseInt(scanner.nextLine());
        String[] array = new String[size];
        System.out.println("nhập các ký tự của mảng");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.next();
        }
        System.out.println(Arrays.toString(array));
        String kyTu;
        System.out.println("nhập kí tự cần kiểm tra");
        kyTu = scanner.next();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(kyTu)){
                count++;
            }
        }
        System.out.println("số lần ký tự "+kyTu+" xuất hiện trong mảng là "+count);
    }
}
