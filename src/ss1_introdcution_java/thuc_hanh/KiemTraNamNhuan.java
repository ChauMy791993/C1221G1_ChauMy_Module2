package ss1_introdcution_java.thuc_hanh;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        System.out.println("kiểm tra năm nhuận");
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập năm:");
        long year = Long.parseLong(scanner.nextLine());
        boolean namNhuan = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    namNhuan = true;
                }
            } else {
                namNhuan = true;
            }
        }
        if (namNhuan) {
            System.out.printf("năm %d là năm nhuần", year);
        } else {
            System.out.printf("năm %d không phải là năm nhuần", year);
        }
    }
}
