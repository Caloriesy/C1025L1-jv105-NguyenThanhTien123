package src;

import java.util.ArrayList;

public class Bai_02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        int count = 0;
        int n = 2;
        while (count < 20) {

            if (iselement(n)) {
                count++;
                list.add(String.valueOf(n));
            }
            n++;
        }
        for (String x : list)
        System.out.println(x);
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
