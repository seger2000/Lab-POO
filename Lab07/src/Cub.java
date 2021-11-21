public class Cub implements GeometricBody {
    private double l;

    public Cub(double l) {
        this.l = l;
    }

    public double getSurface() {
        return 6 * java.lang.Math.pow(this.l, 2);
    }

    public double getVolume() {
        return java.lang.Math.pow(l, 3);
    }
}
