package rikkei.academy;

public class Point3D extends Point2D{
    private float z = 0.0f;

    public Point3D() {
        super();
        this.z = z;
    }

    public Point3D(float z) {
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x,float y , float z){
        this.setXY(x,y);
        this.z = z;
    }
    public float[] getXYZ(){
        float[] array = {this.getX(),this.getY(),this.getZ()};
        return array;
    }

    @Override
    public String toString() {
        return "Point3D{" +
               " x="+getX()+", y="+getY()+ ", z=" + z +
                '}';
    }
}
