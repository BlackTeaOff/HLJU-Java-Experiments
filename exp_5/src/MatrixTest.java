public class MatrixTest {
    public static void main(String[] args) {
        int row = 3;
        int col = 3;

        double[][] m = { { 2, 1, 3 }, { 7, 9, 5 }, { 4, 6, 0 } };
//        Matrix test = new Matrix(m);
//        System.out.println(test);

        // 测试7
        System.out.println("测试7:");
        Matrix m7 = new Matrix(2, 3);
        System.out.println(m7.toString());
        System.out.println("--------------------");

        // 测试8
        System.out.println("测试8:");
        Matrix m8 = new Matrix(m);
        System.out.println(m8.toString());
        System.out.println("--------------------");

        // 测试9
        System.out.println("测试9:");
        Matrix m9 = new Matrix(0, 3);
        System.out.println("--------------------");

        // 测试10
        System.out.println("测试10:");
        Matrix m10 = new Matrix(null);
        System.out.println("--------------------");

        // 测试11
        System.out.println("测试11:");
        System.out.println(m8.getCols());
        System.out.println("--------------------");

        // 测试12
        System.out.println("测试12:");
        System.out.println(m8.getRows());
        System.out.println("--------------------");

        // 测试13
        System.out.println("测试13:");
        System.out.println(m8.getData(0, 0));
        System.out.println("--------------------");

        // 测试14
        System.out.println("测试14:");
        m8.setData(0, 0, 10);
        System.out.println(m8.getData(0, 0));
        System.out.println("--------------------");

        // 测试15
        System.out.println("测试15:");
        m8.getData(-1, 0);
        m8.getData(m8.getRows(), 0);

        m8.getData(0, -1);
        m8.getData(0, m8.getCols());
        System.out.println("--------------------");

        // 测试16
        System.out.println("测试16:");
        m8.setData(0, -1, 0);
        m8.setData(0, m8.getCols(), 0);

        System.out.println("--------------------");

        // 测试17
        System.out.println("测试17:");
        double[][] data_1 = {{1, 0, 0}, {-3, 1, 0}, {0, 0, 1}};
        double[][] data_2 = {{1, 2, 1}, {3, 8, 1}, {0, 4, 1}};
        Matrix m1 = new Matrix(data_1);
        Matrix m2 = new Matrix(data_2);
        System.out.println(m1.multiply(m2).toString());
        System.out.println("--------------------");

        // 测试18
        System.out.println("测试18:");
        m1.multiply(null);
        System.out.println("--------------------");

        // 测试19
        System.out.println("测试19:");
        Matrix m19_1 = new Matrix(3, 3);
        Matrix m19_2 = new Matrix(4, 3);
        m19_1.multiply(m19_2);
        System.out.println("--------------------");

        // 测试20
        System.out.println("测试20:");
        System.out.println(m1.toString());
        System.out.println("--------------------");
    }
}
