package 实验1;

import java.util.Scanner;

public class FactorialTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        factorial(sc.nextInt());
        System.out.println(factorial_recursive(sc.nextInt()));
    }

    public static int result;
    public static void factorial(int n) {
        result = n;
        if(result == 0) {
            System.out.println(1);
            return;
        }
        while (n - 1 > 0) {
            result *= n - 1;
            n -= 1;
        }
        System.out.println(result);
    }

    public static long factorial_recursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial_recursive(n - 1);
        }
    }
}
