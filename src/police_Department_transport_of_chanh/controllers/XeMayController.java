package police_Department_transport_of_chanh.controllers;

import police_Department_transport_of_chanh.models.OTo;
import police_Department_transport_of_chanh.models.XeMay;
import police_Department_transport_of_chanh.services.OToServiceImpl;
import police_Department_transport_of_chanh.services.XeMayServiceImpl;
import police_Department_transport_of_chanh.utils.NotFoundVehicelException;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class XeMayController {
    private String bienKiemSoat;
    private String hangXe;
    private int namSanXuat;
    private String chuSoHuu;
    private String congSuat;
    Scanner scanner = new Scanner(System.in);
    private static final XeMayServiceImpl xeMayService = new XeMayServiceImpl();
    public void add() {
        System.out.println("nhập biển kiểm soát");
        bienKiemSoat = scanner.nextLine();
        System.out.println("nhập hãng xe");
        hangXe = scanner.nextLine();
        System.out.println("nhập năm sản xuất");
        namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập chủ sở hữu");
        chuSoHuu = scanner.nextLine();
        System.out.println("nhập công xuất");
        congSuat = scanner.nextLine();
        XeMay xeMay = new XeMay(bienKiemSoat, hangXe, namSanXuat, chuSoHuu, congSuat);
        xeMayService.create(xeMay);
    }

    public void display() {
        xeMayService.read();
    }

    public void remove(String bienKiemSoatCanXoa) throws NotFoundVehicelException {
        for (int i = 0; i < xeMayService.getXeMayList().size(); i++) {
            if (xeMayService.getXeMayList().get(i).getBienKiemSoat().equals(bienKiemSoatCanXoa.toUpperCase())) {
                System.out.println(xeMayService.getXeMayList().get(i));
                System.out.println("Yes or No");
                String xacNhan = scanner.nextLine();
                if ("YES".equals(xacNhan.toUpperCase())){
                    xeMayService.delete(xeMayService.getXeMayList().get(i));
                    System.out.println("xóa thành công");
                    break;
                }else if ("NO".equals(xacNhan.toUpperCase())){
                    break;
                }
            }else {
                throw new NotFoundVehicelException();
            }
        }
    }
}
