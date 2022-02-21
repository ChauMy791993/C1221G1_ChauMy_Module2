package ss4_lop_va_doi_tuong_java.thuc_hanh;

import java.util.Scanner;

public class HinhChuNhat {
    public double width, height;

    public HinhChuNhat() {
    }

    public HinhChuNhat(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double dienTich() {
        return this.width * this.height;
    }

    public double chuVi() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "hình chữ nhật{" + "width=" + width + ", height=" + height + "}";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập chiều rộng");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.print("nhập chiều cao:");
        double height = Double.parseDouble(scanner.nextLine());
        HinhChuNhat hinhChuNhat = new HinhChuNhat(width, height);
        System.out.println("hình chữ nhật\n" + hinhChuNhat.display());
        System.out.println("chu vi hình chữ nhật : " + hinhChuNhat.chuVi());
        System.out.println("diện tích hình chữ nhật : " + hinhChuNhat.dienTich());

    }
}

