public class Matrix {
    double[][] data;

    Matrix(int rows, int cols) {
        if (rows == 0 || cols == 0) {
            try {
                throw new IllegalArgumentException("行数列数必须大于0");
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
                return;
            }
        }
        data = new double[rows][cols];
    }
    Matrix(double[][] data) {
        if (data == null) {
            try {
                throw new IllegalArgumentException("参数不能为空");
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
                return;
            }
        }
        this.data = data;
    }

    boolean check(int row, int col) {
        if (row < 0) {
            try {
                throw new IllegalIndexException("行号<0");
            } catch (IllegalIndexException e) {
                e.printStackTrace();
                return false;
            }
        }
        if (col < 0) {
            try {
                throw new IllegalIndexException("列号<0");
            } catch (IllegalIndexException e) {
                e.printStackTrace();
                return false;
            }
        }
        if (row >= this.getRows()) {
            try {
                throw new IllegalIndexException("行号>=行数");
            } catch (IllegalIndexException e) {
                e.printStackTrace();
                return false;
            }
        }
        if (col >= this.getCols()) {
            try {
                throw new IllegalIndexException("列号>=列数");
            } catch (IllegalIndexException e) {
                e.printStackTrace();
                return false;
            }
        }
        return true;
    }

    double getData(int row, int col) {
        if (!check(row, col)) {
            return 1;
        }
        return data[row][col];
    }
    void setData(int row, int col, double value) {
        if (!check(row, col)) {
            return;
        }
        data[row][col] = value;
    }
    int getRows() {
        return data.length;
    }
    int getCols() {
        return data[0].length;
    }

    Matrix multiply(Matrix m) {
        if (m == null) {
            try {
                throw new MatrixMultiplicationException();
            } catch (MatrixMultiplicationException e) {
                e.printStackTrace();
                return null;
            }
        }
        if (this.getCols() != m.getRows()) {
            try {
                throw new MatrixMultiplicationException();
            } catch (MatrixMultiplicationException e) {
                e.printStackTrace();
                return null;
            }
        }
        double[][] result = new double[getRows()][m.getCols()];
        for (int r = 0; r < getRows(); r++) {
            for (int c = 0; c < m.getCols(); c++) {
                for (int i = 0; i < getCols(); i++) {
                    result[r][c] += getData(r, i) * m.getData(i, c);
                }
            }
        }
        return new Matrix(result);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Matrix) {
            Matrix m = (Matrix)obj;
            if (getRows() != m.getRows() || getCols() != m.getCols()) {
                return false;
            }
            for (int r = 0; r < getRows(); r++) {
                for (int c = 0; c < getCols(); c++) {
                    if (getData(r, c) != m.getData(r, c)) {
                        return false;
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String output = "";
        for (int r = 0; r < getRows(); r++) {
            for (int c = 0; c < getCols(); c++) {
                output += getData(r,c) + " ";
            }
            output += "\n";
        }
        return output;
    }
}
