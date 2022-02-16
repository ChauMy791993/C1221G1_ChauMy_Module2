package ss1_introdcution_java.thuc_hanh;

import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in); //Khai báo đối tượng Scanner
        System.out.println("nhập chiều rộng");
        width = Float.parseFloat(scanner.nextLine());
        System.out.println("nhập chiều cao");
        height = Float.parseFloat(scanner.nextLine());
        float area = width * height;
        System.out.println("area is: " + area);
    }
}
