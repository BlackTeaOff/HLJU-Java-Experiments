import java.util.Arrays;
import java.util.Random;

public class ArrayTest {
    public static void main(String[] args) {
//        int[] data = new int[10];
//        Random r = new Random();
//
//        for (int i = 0; i < data.length; i++) {
//            data[i] = r.nextInt(100);
//        }
//
//        ArrayReverser test = new ArrayReverser(data);
//        System.out.println(test.toString());
//
//        test.reverse();
//        System.out.println(test.toString());

        System.out.println("--------------------");

        // 测试1
        ArrayReverser ar1 = new ArrayReverser(null);
        System.out.println(ar1.getData().length);
        System.out.println("--------------------");

        // 测试2
        System.out.println("测试2:");
        int[] data = {1, 2, 3, 4, 5};
        ArrayReverser ar2 = new ArrayReverser(data);
        System.out.println(ar2.toString());
        System.out.println("--------------------");

        // 测试3
        System.out.println("测试3:");
        ArrayReverser ar3 = new ArrayReverser(new int[]{1, 2, 3, 4, 5});
        ar3.setData(null);
        System.out.println(ar3.toString());
        System.out.println("--------------------");

        // 测试4
        System.out.println("测试4:");
        ArrayReverser ar4 = new ArrayReverser(new int[]{2, 3, 4, 5, 6, 7, 8, 9});
        System.out.println(ar4.toString());
        ar4.setData(data);
        System.out.println(ar4.toString());
        System.out.println("--------------------");

        // 测试5
        System.out.println("测试5:");
        ArrayReverser ar5 = new ArrayReverser(new int[]{1, 2, 3, 4, 5});
        System.out.println(ar5.toString());
        ar5.reverse();
        System.out.println(ar5.toString());
        System.out.println("--------------------");

        // 测试6
        System.out.println("测试6:");
        ArrayReverser ar6 = new ArrayReverser(new int[]{1, 2, 3, 4, 5});
        System.out.println(ar6.toString());
        System.out.println("--------------------");
    }
}
