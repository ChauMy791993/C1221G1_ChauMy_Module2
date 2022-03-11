package ss17_binary_file_serialization.bai_tap.controllers;

import java.util.Scanner;

public class Controllers {
    private int choice = -1;
    Scanner scanner = new Scanner(System.in);
    ProductController productController = new ProductController();

    public void displayMenu() {
        do {
            System.out.println("---Menu---");
            System.out.println("1: add new product\n" +
                    "2: display product\n" +
                    "3: search product\n" +
                    "4: return menu");
            System.out.println("enter choice");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productController.addNewProduct();
                    break;
                case 2:
                    productController.displayProduct();
                    break;
                case 3:
                    productController.searchProduct();
                    break;
                case 4:
                    break;
                default:
                    System.err.println("wrong choice");
            }
        } while (choice != 5);
    }
}
