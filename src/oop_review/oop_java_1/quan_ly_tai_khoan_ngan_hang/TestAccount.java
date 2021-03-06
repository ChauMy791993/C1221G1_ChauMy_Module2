package oop_review.oop_java_1.quan_ly_tai_khoan_ngan_hang;

import java.util.Scanner;

public class TestAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account accounts = new Account(0, null);
        int choice;
        do {
            System.out.println("------Menu ngân hàng-----");
            System.out.println("1: Tạo tài khoản.");
            System.out.println("2: Kiểm tra số tiền tài khoản.");
            System.out.println("3: Nạp tiền vào tài khoản.");
            System.out.println("4: Rút tiền.");
            System.out.println("5: Số tiền sau khi đáo hạn.");
            System.out.println("6: Chuyền tiền.");
            System.out.println("0: Thoát");
            System.out.print("Nhập lựa chọn :");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập id:");
                    accounts.setId(Long.parseLong(scanner.nextLine()));
                    System.out.println("Nhập tên tài khoản");
                    accounts.setName(scanner.nextLine());
                    System.out.println(accounts);
                    break;
                case 2:
                    System.out.println("số tiền trong tài khoản : " + accounts.getMoney() + " VND");
                    break;
                case 3:
                    System.out.print("nhập số tiền cần nạp: ");
                    accounts.getInputMoney(Double.parseDouble(scanner.nextLine()));
                    System.out.println("số tiền trong tài khoản : " + accounts.getMoney());
                    break;
                case 4:
                    System.out.println("nhập số tiền cần rút : ");
                    accounts.getWithdawMoney(Double.parseDouble(scanner.nextLine()));
                    System.out.println("số tiền còn lại trong tài khoản : " + accounts.getMoney());
                    break;
                case 5:
                    accounts.getExpire();
                    System.out.println("số tiền sau khi đáo hạn : " + accounts.getMoney());
                    break;
                case 6:
                    System.out.println("nhập số tiền cần chuyển");
                    accounts.getTransferMoney(Double.parseDouble(scanner.nextLine()));
                    System.out.println("số tiền còn lại trong tài khoản : " + accounts.getMoney());
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("không hợp lệ");
            }

        } while (choice != 0);

    }
}
