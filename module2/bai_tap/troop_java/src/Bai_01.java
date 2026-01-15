package src;

public class Bai_01 {
    public static void main(String[] args) {
        for (int i = 0; i <3; i++) {
            System.out.print("*");
            for (int j = 0; j <13; j++) {
                System.out.print("*");

            }
            System.out.print("\n");
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.print("*");
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println();
        for (int i = 5; i>=0; i--) {
            System.out.print("*");
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
