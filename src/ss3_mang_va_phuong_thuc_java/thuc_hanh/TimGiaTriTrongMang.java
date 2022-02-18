package ss3_mang_va_phuong_thuc_java.thuc_hanh;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] hocSinh = {"long", "trinh", "my", "luat"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ten hoc sinh :");
        String hocSinh1 = scanner.nextLine();
        boolean flag = false;
        for (int i = 0; i < hocSinh.length; i++) {
            if (hocSinh[i].equals(hocSinh1)) {
                System.out.println("vị trí của học sinh " + hocSinh1 + " trong danh sách là " + i);
                flag = true;
                break;
            }
        }
        if (!flag){
            System.out.println("tên "+hocSinh1+" không có trong danh sách");
        }
    }
}
