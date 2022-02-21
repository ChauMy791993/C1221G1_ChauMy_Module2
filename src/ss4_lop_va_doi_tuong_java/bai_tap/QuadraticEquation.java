package ss4_lop_va_doi_tuong_java.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    public double a, b, c, delta;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return delta = (this.b * this.b) -(4 * this.a * this.c);
    }

    public double getRoot1() {
        double root1;
        return root1 = (-this.b + Math.sqrt(delta)) / (2 *this.a);
    }

    public double getRoot2() {
        double root2;
        return root2 = (-this.b - Math.sqrt(delta)) / (2 * this.a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập a :");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("nhập b :");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("nhập c :");
        double c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        System.out.println("delta is : "+quadraticEquation.getDiscriminant());
        if (quadraticEquation.getDiscriminant()>0){
            System.out.println("the equation has two roots " +
                    quadraticEquation.getRoot1() + " and " + quadraticEquation.getRoot2());
        }else if (quadraticEquation.getDiscriminant()==0){
            System.out.println("the equation has one roots " +
                    quadraticEquation.getRoot1());
        }else {
            System.out.println("the equation has no real roots");
        }
    }
}
