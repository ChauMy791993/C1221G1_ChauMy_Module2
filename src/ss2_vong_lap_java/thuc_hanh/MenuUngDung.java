package ss2_vong_lap_java.thuc_hanh;

import java.util.Scanner;

public class MenuUngDung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu\n"+"1. vẽ tam giác\n"+"2. vẽ hình vuông\n"+"3. vẽ hình chữ nhật\n"+"0. thoát");
        System.out.println("Enter your choice: ");
        while (true) {
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("vẽ tam giác");
                    System.out.println("*");
                    System.out.println("**");
                    System.out.println("***");
                    System.out.println("****");
                    System.out.println("*****");
                    System.out.println("******");
                    break;
                case 2:
                    System.out.println("vẽ hình vuông");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 3:
                    System.out.println("vẽ hình chữ nhật");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("không chọn!");
            }
        }

    }
}


