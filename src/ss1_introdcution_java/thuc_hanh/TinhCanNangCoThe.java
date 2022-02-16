package ss1_introdcution_java.thuc_hanh;

import java.util.Scanner;

public class TinhCanNangCoThe {
    public static void main(String[] args) {
        System.out.println("tính chỉ số cân nặng cơ thể");
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập cân nặng");
        double weight = Double.parseDouble(scanner.nextLine());
        System.out.println("nhập chiều cao");
        double height = Double.parseDouble(scanner.nextLine());
        double bmi = weight / Math.pow(height, 2);
        System.out.printf("%-15s%s", "bmi", "Interpretation\n");
        if (bmi < 18)
            System.out.printf("%-15.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-15.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-15.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-15.2f%s", bmi, "Obese");
    }

}
