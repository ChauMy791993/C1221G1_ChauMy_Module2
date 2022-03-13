package police_Department_transport_of_chanh.controllers;

import police_Department_transport_of_chanh.models.OTo;
import police_Department_transport_of_chanh.services.OToServiceImpl;
import police_Department_transport_of_chanh.utils.NotFoundVehicelException;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class OToController {
    private String bienKiemSoat;
    private String hangXe;
    private int namSanXuat;
    private String chuSoHuu;
    private int soChoNgoi;
    private String kieuXe;
    Scanner scanner = new Scanner(System.in);
    private static OToServiceImpl oToService = new OToServiceImpl();

    public void add() {
        System.out.println("nhập biển kiểm soát");
        bienKiemSoat = scanner.nextLine();
        System.out.println("nhập hãng xe");
        hangXe = scanner.nextLine();
        System.out.println("nhập năm sản xuất");
        namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập chủ sở hữu");
        chuSoHuu = scanner.nextLine();
        System.out.println("nhập số chỗ ngồi");
        soChoNgoi = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập kiểu xe");
        kieuXe = scanner.nextLine();
        OTo oTo = new OTo(bienKiemSoat, hangXe, namSanXuat, chuSoHuu, soChoNgoi, kieuXe);
        oToService.create(oTo);
    }

    public void display() {
        oToService.read();
    }

    public void remove(String bienKiemSoatCanXoa) throws NotFoundVehicelException {
        boolean flag = false;
        for (int i = 0; i < oToService.getoToList().size(); i++) {
            if (oToService.getoToList().get(i).getBienKiemSoat().equals(bienKiemSoatCanXoa.toUpperCase())) {
                flag = true;
                System.out.println(oToService.getoToList().get(i));
                System.out.println("Yes or No");
                String xacNhan = scanner.nextLine();
                if ("YES".equals(xacNhan.toUpperCase())) {
                    oToService.delete(oToService.getoToList().get(i));
                    System.out.println("xóa thành công");
                    break;
                } else if ("NO".equals(xacNhan.toUpperCase())) {
                    break;
                }
            }
            if (!flag) {
                throw new NotFoundVehicelException();
            }
        }
    }
}
