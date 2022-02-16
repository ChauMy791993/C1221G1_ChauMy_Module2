package ss1_introdcution_java.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        System.out.println("ứng dụng chuyển đổi tiền tệ :");
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập giá trị tiền USD : ");
        float USD = Float.parseFloat(scanner.nextLine());
        float VND = USD*23000;
        System.out.println("giá trị VND = "+VND);
    }
}
