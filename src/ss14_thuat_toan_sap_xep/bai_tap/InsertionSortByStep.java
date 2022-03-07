package ss14_thuat_toan_sap_xep.bai_tap;

public class InsertionSortByStep {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
    private static void showList() {
        for (int element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void insertionSort(int[] list) {
        int x;
        int pos;
        System.out.println("Bắt đầu sắp xếp mảng...");
        for (int i = 1; i < list.length; i++) {
            System.out.printf("Lấy %d ra khỏi vị trí %d\n", list[i], i);
            x = list[i];
            pos = i;
            while (pos > 0 && x < list[pos - 1]) {
                System.out.printf("-->Đưa %d vào vị trí %d\n", list[pos - 1], pos);
                list[pos] = list[pos - 1]; // đổi chỗ
                pos--;
            }
            list[pos] = x;
            System.out.printf("-->Đưa %d vào vị trí %d\n", x, pos);
            System.out.printf("Mảng sau sắp xếp lần %d: ", i);
            showList();
            System.out.println();
        }
        System.out.println("Đã hoàn thành sắp xếp!");

    }

    public static void main(String[] args) {
        System.out.print("Mảng ban đầu: ");
        showList();
        insertionSort(list);
        System.out.print("Mảng sau sắp xếp: ");
        showList();
    }


}
