package ss2_vong_lap_java;

import java.util.Scanner;

public class Algorithim {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap size");
        int size = Integer.parseInt(scanner.nextLine());
//        int size = 5;
        // Top
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j < 2 * size + 1; j++) {
                if (i == 0) {
                    break;
                } else {
                    if (j == (size - i) || j == (size + i)) {
                        System.out.print(i);
                    } else {
                        System.out.print(" ");
                    }

                }
            }
            System.out.println();
        }
        // Bototom
        for (int i = size-1; i >0; i--) {
            for (int j = 0; j < 2 * size + 1; j++) {
                if (j == (size - i) || j == (size + i)) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

