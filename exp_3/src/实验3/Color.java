package 实验3;

public class Color {
    int red;
    int green;
    int blue;
    
    public Color() {
        red = 0;
        green = 0;
        blue = 0;
    }

    public Color(int r, int g, int b) {
        if (r > 255) {
            red = 0;
        } else {
            red = r;
        }

        if (g > 255) {
            green = 0;
        } else {
            green = g;
        }

        if (b > 255) {
            blue = 0;
        } else {
            blue = b;
        }
    }

    void setRed(int v) {
        if (v >= 0 && v <= 255) {
            red = v;
        }
    }
    void setGreen(int v) {
        if (v >= 0 && v <= 255) {
            green = v;
        }
    }
    void setBlue(int v) {
        if (v >= 0 && v <= 255) {
            blue = v;
        }
    }

    int getRed() {
        return red;
    }
    int getGreen() {
        return green;
    }
    int getBlue() {
        return blue;
    }
}

