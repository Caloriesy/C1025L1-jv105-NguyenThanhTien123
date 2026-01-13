import java.util.Scanner;

public class bai_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("chuyển đổi tiền tệ từ VND thành USD");
        int VND = sc.nextInt();
        int VNDToUsd = VND / 25000;
        System.out.println("Thành tiền USD " + VNDToUsd);
    }
}
