package ss3_mang_va_phuong_thuc_java.bai_tap;


import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] array = new int[10];
        int x;
        int viTriX = 0;
        for (int i = 0; i < 10; i++) {
            array[i] = i + 1;
        }
        System.out.println("mảng trước khi xóa :");
        System.out.println(Arrays.toString(array));
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập x cần xóa");
        x = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                viTriX = i;
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println(x + " không có trong mảng");
        } else {
            for (int i = viTriX; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array[array.length - 1] = 0;
            System.out.println("mảng sau khi xóa :");
            System.out.println(Arrays.toString(array));
        }
    }
}

