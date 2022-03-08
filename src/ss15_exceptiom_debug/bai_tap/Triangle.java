package ss15_exceptiom_debug.bai_tap;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first side");
        double side1 = Double.parseDouble(scanner.nextLine());
        System.out.println("enter second side");
        double side2 = Double.parseDouble(scanner.nextLine());
        System.out.println("enter third side");
        double side3 = Double.parseDouble(scanner.nextLine());
        Triangle triangle = new Triangle();
        try {
            triangle.checkSideOfTriangle(side1, side2, side3);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

    public void checkSideOfTriangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 < 0 || side2 < 0 || side3 < 0 || side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1) {
            throw new IllegalTriangleException("các cạnh không hợp lý");
        } else {
            System.out.println("tam giác có các cạnh lần lượt là :" + side1 + " " + side2 + " " + side3 + " ");
        }


    }
}
