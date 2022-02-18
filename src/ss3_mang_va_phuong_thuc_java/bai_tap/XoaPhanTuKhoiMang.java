package ss3_mang_va_phuong_thuc_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập độ dài mảng: ");
        size = Integer.parseInt(scanner.nextLine());
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("nhập giá trị thứ " + (i + 1) + " :");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(array));
        System.out.println("nhập phần tử cần xóa :");
        int x = Integer.parseInt(scanner.nextLine());
        int index = 1;
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                index = i + 1;
                System.out.println("vị trí của phần tử " + x + " trong mảng là : " + index);
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("phần tử " + x + " không có trong mảng");
        }
        for (int i = index; i <array.length-1 ; i++) {
            array[i]=array[i+1];
        }
        array[array.length-1]=0;

        System.out.println(Arrays.toString(array));

    }
}

