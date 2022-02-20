package ss3_mang_va_phuong_thuc_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TimPhanTuNhoNhatMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.println("nhập kích thước mảng :");
        size = Integer.parseInt(scanner.nextLine());
        int[] array= new int[size];
        System.out.println("nhập các phần tử của mảng");
        for (int i = 0; i <array.length ; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(array));
        int min =array[0];
        for (int i = 0; i <array.length ; i++) {
            if(array[i]<min){
                min = array[i];
            }
        }
        System.out.println("phần tử nhỏ nhất trong mảng : "+min);
    }
}
