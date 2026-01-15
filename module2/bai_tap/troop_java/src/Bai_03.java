package src;

public class Bai_03 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if (iselement(i)) {
                System.out.println(i);
            }
        }
    }
    static boolean iselement(int n) {
        if (n < 2) return false;

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
