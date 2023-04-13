public class Box {
    private double length, width, height;
    private static int numberBoxes = 0;

    public Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
        numberBoxes++;
    }

    public double volume() {
        return length * width * height;
    }

    public double surfaceArea() {
        return 2 * length * width + 2 * length * height + 2 * length * width;
    }
}
