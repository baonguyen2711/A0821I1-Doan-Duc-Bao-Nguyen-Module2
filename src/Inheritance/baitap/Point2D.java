package Inheritance.baitap;

import java.util.Arrays;

public class Point2D {
    private float x;
    private float y;
    public Point2D(){

    }
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }


    public void setXY(float x, float y){
        this.x= x;
        this.y= y;
    }
    public float[] getXY(){
        float[] res = {x,y};
        return res;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
class Point3D extends Point2D{
    private float z;
    public Point3D(){

    }
    public Point3D(float z){
        this.z = z;
    }
    public Point3D(float x,float y,float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        setXY(x,y);
        this.z= z;
    }

    public float[] getXYZ(){
        float[] res= {getX(), getY(), getZ()};
        return res;
    }
    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                '}'+ ", which is a subclass of " + super.toString();
    }
}
class MoveablePoint extends Point2D{
    private float xSpeed;
    private float ySpeed;
    public MoveablePoint(){

    }
    public MoveablePoint(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(float x,float y,float xSpeed,float ySpeed){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] a = {xSpeed,ySpeed};
        return a;
    }
    public MoveablePoint move(float x,float y){
        x += xSpeed;
        y += ySpeed;
        return this;
    }
    @Override
    public String toString() {
        return "MoveablePoint{" +
                "xSpeed=" + getxSpeed() +
                ", ySpeed=" + getySpeed() +
                '}'+ ", which is a subclass of " + super.toString();
    }
}
class TestPoint {
    public static void main(String[] args) {

        Point2D point2D = new Point2D();
        System.out.println(point2D);
        point2D = new Point2D(5, 5);
        System.out.println(point2D);
        float[] tmp = point2D.getXY();
        System.out.println(Arrays.toString(tmp));
        Point3D point3D = new Point3D();
        System.out.println(point3D);
        point3D = new Point3D(5, 6,7);
        System.out.println(point3D);
        float[] res = point3D.getXYZ();
        System.out.println(Arrays.toString(res));
        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);
        moveablePoint = new MoveablePoint(1,1,5,5);
        System.out.println(moveablePoint);
        float[] a = moveablePoint.getSpeed();
        System.out.println(Arrays.toString(a));
    }
}
