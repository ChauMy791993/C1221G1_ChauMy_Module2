package ss2_vong_lap_java.thuc_hanh;

import java.util.Scanner;

public class TinhTienLaiChoVay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số tiền cho vay :");
        double money = Double.parseDouble(scanner.nextLine());
        System.out.println("nhập số tháng vay :");
        int month = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập lãi xuất hàng tháng :");
        double interestRate = Double.parseDouble(scanner.nextLine());
        double totalInteres = 0;
        for (int i = 0; i < month; i++) {
            totalInteres += money * (interestRate / 100) / 12 * month;
        }
        System.out.println("số tiền lãi khi gởi ngân hàng là : " + totalInteres);
    }
}
