package ss2_vong_lap_java.bai_tap;

public class HienThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        System.out.println("các số nguyên tố nhỏ hơn 100: ");
        int n = 2;
        while (n < 100) {
            boolean flag = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(n);
            }
            n++;
        }
    }
}
