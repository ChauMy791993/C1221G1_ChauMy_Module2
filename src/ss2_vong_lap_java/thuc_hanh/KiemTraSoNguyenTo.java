package ss2_vong_lap_java.thuc_hanh;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        System.out.println("nhập một số bất kỳ :");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        if (number < 2) {
            System.out.println("không phải là số nguyên tố");
        } else {
            int i = 2;
            boolean flag = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0){
                    flag = false;
                    break;
                }
                i++;
            }if (flag){
                System.out.println(number+" là số nguyên tố");
            }else {
                System.out.println(number +" không phải là số nguyên tố");
            }
        }
    }
}
