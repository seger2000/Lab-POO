public class Parallelepiped implements GeometricBody {
    private double l, L, h;

    public Parallelepiped(double l, double L, double h) {
        this.l = l;
        this.L = L;
        this.h = h;
    }

    public double getSurface() {
        return 2 * (l * L + l * h + L * h);
    }

    public double getVolume() {
        return l * L * h;
    }
}
