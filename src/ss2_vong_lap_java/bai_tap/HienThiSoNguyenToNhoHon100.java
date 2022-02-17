package ss2_vong_lap_java.bai_tap;

public class HienThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        System.out.println("các số nguyên tố nhỏ hơn 100: ");
        int N = 2;
        while (N < 100) {
            boolean flag = true;
            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(N);
            }
            N++;
        }
    }
}
