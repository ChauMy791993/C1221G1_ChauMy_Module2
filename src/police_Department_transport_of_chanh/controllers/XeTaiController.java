package police_Department_transport_of_chanh.controllers;

import police_Department_transport_of_chanh.models.XeMay;
import police_Department_transport_of_chanh.models.XeTai;
import police_Department_transport_of_chanh.services.OToServiceImpl;
import police_Department_transport_of_chanh.services.XeTaiServicesImpl;
import police_Department_transport_of_chanh.utils.NotFoundVehicelException;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class XeTaiController {
    private String bienKiemSoat;
    private String hangXe;
    private int namSanXuat;
    private String chuSoHuu;
    private int trongTai;
    Scanner scanner = new Scanner(System.in);
    private static XeTaiServicesImpl xeTaiServices = new XeTaiServicesImpl();
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
        trongTai = Integer.parseInt(scanner.nextLine());
        XeTai xeTai = new XeTai(bienKiemSoat, hangXe, namSanXuat, chuSoHuu, trongTai);
        xeTaiServices.create(xeTai);
    }

    public void display() {
        xeTaiServices.read();
    }

    public void remove(String bienKiemSoatCanXoa) throws NotFoundVehicelException {
        for (int i = 0; i < xeTaiServices.getXeTaiList().size(); i++) {
            if (xeTaiServices.getXeTaiList().get(i).getBienKiemSoat().equals(bienKiemSoatCanXoa.toUpperCase())) {
                System.out.println(xeTaiServices.getXeTaiList().get(i));
                System.out.println("Yes or No");
                String xacNhan = scanner.nextLine();
                if ("YES".equals(xacNhan.toUpperCase())){
                    xeTaiServices.delete(xeTaiServices.getXeTaiList().get(i));
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
