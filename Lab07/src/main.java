import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Cub cub = new Cub(6);
        Sphere sfera = new Sphere(3.9);
        Parallelepiped paralepited = new Parallelepiped(4.3, 5.6, 3.1);

        System.out.printf("Suprafata : %.2f\n", cub.getSurface());
        System.out.printf("Volumuo  : %.2f\n", cub.getVolume());

        ArrayList<GeometricBody> obj = new ArrayList<GeometricBody>();
        obj.add(cub);
        obj.add(sfera);
        obj.add(paralepited);

       /*for (GeometricBody ob : obj) {
            System.out.printf("Suprafata : %.2f\n", ob.getSurface());
            System.out.printf("Volumuo  : %.2f\n", ob.getVolume());
            System.out.printf("-----------------------------------\n");
        }*/

        System.out.println("Cel mai mare volum : " + GeometricBodyController.getBiggestVolume(obj));
        System.out.println("Cea mai mare suprafata : " + GeometricBodyController.getBiggestSurface(obj));
    }

}
