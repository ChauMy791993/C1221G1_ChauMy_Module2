package ss2_vong_lap_java.thuc_hanh;

import java.util.Scanner;

public class TinhUocSoLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số a :");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập số b :");
        int b = Integer.parseInt(scanner.nextLine());
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("không có ước chung lớn nhất");
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;

        }
        System.out.println("ước số chung lớn nhất là : " + a);
    }
}
