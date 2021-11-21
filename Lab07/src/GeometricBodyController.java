import java.util.ArrayList;
public class GeometricBodyController {

    public static double getBiggestVolume(ArrayList<GeometricBody> objects) {
        double max = objects.get(0).getVolume();
        for (GeometricBody obj : objects) {
            if (max < obj.getVolume()) {
                max = obj.getVolume();
            }
        }
        return max;
    }

    public static double getBiggestSurface(ArrayList<GeometricBody> objects) {
        double max = objects.get(0).getSurface();
        for (GeometricBody obj : objects) {
            if (max < obj.getSurface()) {
                max = obj.getSurface();
            }
        }
        return max;
    }
}
