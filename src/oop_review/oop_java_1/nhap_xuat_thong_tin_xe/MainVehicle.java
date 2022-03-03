package oop_review.oop_java_1.nhap_xuat_thong_tin_xe;

import java.util.Scanner;

public class MainVehicle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehicle vehicles = new Vehicle();
        int choice;

        do {
            System.out.println("1. Tạo các đối tượng xe và nhập thông tin");
            System.out.println("2. Xuất bảng kê khai tiền thuế của các xe");
            System.out.println("3. Thoát");
            System.out.print("Nhập lựa chọn :");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Nhập giá trị xe ");
                    vehicles.setGiaXe(Long.parseLong(scanner.nextLine()));
                    System.out.println("Nhập dung tích xi lanh:");
                    vehicles.setDungTich(Integer.parseInt(scanner.nextLine()));
                    System.out.println(vehicles.toString());
                    System.out.println("Vui lòng chọn tiếp mục 2 để tính thuế cho phương tiện của bạn, nếu bạn muốn nhập lại thông tin phương tin thì chọn mục 1");
                    break;
                case 2:
                    System.out.println(vehicles.toString());
                    double display = vehicles.getThueXe();
                    System.out.println("Số tiền thuế cho xe của bạn là: " + display + " VND");
                    break;
                case 3:
                    System.exit(0);
            }
        } while (choice != 0);
    }
}

