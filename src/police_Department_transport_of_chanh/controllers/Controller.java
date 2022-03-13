package police_Department_transport_of_chanh.controllers;

import police_Department_transport_of_chanh.utils.NotFoundVehicelException;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Controller {
    private int choice = 1;
    Scanner scanner = new Scanner(System.in);
    OToController oToController = new OToController();
    XeTaiController xeTaiController = new XeTaiController();
    XeMayController xeMayController = new XeMayController();

    public void mainMenu() {
        do {
            System.out.println("----Quản lý phương tiên giao thông----");
            System.out.println("1: Thêm mới phương tiện.\n" +
                    "2: Hiện thị phương tiện\n" +
                    "3: Xóa phương tiện\n" +
                    "4: Thoát\n");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("chọn phươn tiện\n" +
                            "1: Oto\n" +
                            "2: Xe tải\n" +
                            "3: Xe máy\n");
                    System.out.println("nhập lưa chọn");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            oToController.add();
                            break;
                        case 2:
                            xeTaiController.add();
                            break;
                        case 3:
                            xeMayController.add();
                            break;
                        default:
                            System.out.println("nhập sai lựa chọn");
                    }
                    break;
                case 2:
                    System.out.println("chọn phươn tiện\n" +
                            "1: Oto\n" +
                            "2: Xe tải\n" +
                            "3: Xe máy\n");
                    System.out.println("nhập lưa chọn");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            oToController.display();
                            break;
                        case 2:
                            xeTaiController.display();
                            break;
                        case 3:
                            xeMayController.display();
                            break;
                        default:
                            System.out.println("nhập sai lựa chọn");
                    }
                    break;
                case 3:
                    String bienKiemSoatCanXoa;
                    int count;
                    do {
                        count = 0;
                        System.out.println("nhập biển kiểm soát cần xóa");
                        bienKiemSoatCanXoa = scanner.nextLine();
                        try {
                            oToController.remove(bienKiemSoatCanXoa);
                        } catch (NotFoundVehicelException e) {
                            count++;
                            try {
                                xeMayController.remove(bienKiemSoatCanXoa);
                            } catch (NotFoundVehicelException e1) {
                                count++;
                                try {
                                    xeTaiController.remove(bienKiemSoatCanXoa);
                                } catch (NotFoundVehicelException e2) {
                                    count++;
                                }
                            }
                            if (count == 3) {
                                if ("".equals(bienKiemSoatCanXoa)){
                                    break;
                                }
                                e.printStackTrace();
                            }
                        }
                    } while (count == 3);
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("nhập sai lựa chọn");
            }
        } while (choice != 4);
    }

}
