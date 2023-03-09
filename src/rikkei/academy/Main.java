package rikkei.academy;

public class Main {
    public static void main(String[] args) {
        System.out.println("---2D---");
        Point2D point2D = new Point2D() ;
        point2D.setXY(1,9);
        System.out.println("array --->"+point2D);

        Point3D point3D = new Point3D();
        point3D.setXYZ(5,6,7);
        System.out.println("array2---> "+ point3D);
    }
}