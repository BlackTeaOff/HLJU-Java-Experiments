public class NineMultiplication {

    public static void Nine_nine() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
//                System.out.print(j + "X" + i + "=" + (j * i) + " ");
                System.out.printf("%dX%d=%d ", j, i, i * j);
            }
            System.out.println();
        }
    }

    public static void Nine_nine2() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j >= i) {
                    System.out.printf("%dX%d=%2d ", i, j, j * i);
                } else {
                    System.out.print("       ");
                }
            }
            System.out.println();
        }
    }

    public static void Nine_nine3() {
        for (int i = 1; i <= 9; i++) {
            for (int k = 1; k < (9 - i) * 4; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.printf("%dX%d=%d ", j, i, j * i);
            }
            System.out.println();
        }
    }

    public static void main (String[] args) {
        Nine_nine();
        Nine_nine2();
        Nine_nine3();
    }
}
