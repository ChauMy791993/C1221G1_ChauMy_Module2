package ss2_vong_lap_java.bai_tap;

import java.util.Scanner;

public class HienThiSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("số nguyên tố cần in ra : ");
        int numbers = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int n = 2;
        System.out.println("các số nguyên tố :");
        while (count < numbers) {
            boolean flag = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
                System.out.println(n);
            }
            n++;
        }
    }
}
