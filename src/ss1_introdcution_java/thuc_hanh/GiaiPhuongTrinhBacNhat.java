package ss1_introdcution_java.thuc_hanh;

import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        System.out.println("giải phương trình bậc nhất");
        System.out.println("cho một phương trình 'a*x+b=c',nhập các hằng số");
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập a:");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("nhập b:");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("nhập c:");
        double c = Double.parseDouble(scanner.nextLine());
        if (a != 0) {
            double x = (c - b) / a;
//            System.out.printf("phương trình với kết quả x=%f\n", x);
            System.out.println("phương trình với kết quả x = "+x);
        } else {
            if (b == c) {
                System.out.println("phương trình vô số nghiệm");
            } else {
                System.out.println("phương trình vô nghiệm");
            }
        }

    }
}
