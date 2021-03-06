package ss12_map_tree.bai_tap.luyen_tap_su_dung_arraylist_linkedlist;

import java.util.Scanner;

public class ProductTest {
    static ProductManager productManager = new ProductManager();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean out = false;
        while (!out) {
            System.out.print("Chọn chức năng:\n" +
                    "1. Thêm sản phẩm\n" +
                    "2. Sửa thông tin sản phẩm (theo id)\n" +
                    "3. Xóa sản phẩm (theo id)\n" +
                    "4. Hiển thị danh sách sản phẩm\n" +
                    "5. Tìm kiếm sản phẩm (theo tên)\n" +
                    "6. Sắp xếp sản phẩm tăng dần/ giảm dần\n" +
                    "7. Thoát\n" +
                    "Nhập yêu cầu của bạn: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    productManager.addProduct();
                    out = false;
                    break;
                case 2:
                    productManager.editProduct();
                    out = false;
                    break;
                case 3:
                    productManager.deleteProduct();
                    out = false;
                    break;
                case 4:
                    System.out.println("Danh sách sản phẩm: ");
                    productManager.showListProduct();
                    out = false;
                    break;
                case 5:
                    productManager.searchProduct();
                    out = false;
                    break;
                case 6:
                    productManager.sortProduct();
                    out = false;
                    break;
                default:
                    System.out.println("Đã hoàn thành.");
                    out = true;
            }
        }
    }
}
