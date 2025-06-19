public class ArrayReverser {
    int[] data;

    ArrayReverser(int[] data) {
        if (data == null) {
            data = new int[0];
        }
        this.data = new int[data.length];
        System.arraycopy(data, 0, this.data, 0, data.length);
    }

    int[] getData() {
        return data;
    }

    void setData(int[] data) {
        if (data == null) {
            return;
        }
        this.data = data;
    }

    void reverse() {
        int temp;
        for (int i = 0; i < data.length / 2; i++) {
            temp = data[i];
            data[i] = data[data.length - i - 1];
            data[data.length - i - 1] = temp;
        }
    }

    @Override
    public String toString() {
        String output = "[";
//        for (int numbers : data) { // 相当于 for numbers in data
        for (int i = 0; i < data.length; i++) {
            if (i == data.length - 1) {
                output += data[i]+"]";
            } else {
                output += data[i]+", ";
            }
        }
        return output;
    }
}