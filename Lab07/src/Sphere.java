public class Sphere implements GeometricBody {
    private double r;

    public Sphere(double r) {
        this.r = r;
    }

    public double getSurface() {
        return 4 * java.lang.Math.PI * java.lang.Math.pow(this.r, 2);
    }

    public double getVolume() {
        return 4 / 3 * java.lang.Math.PI * java.lang.Math.pow(this.r, 3);
    }
}
