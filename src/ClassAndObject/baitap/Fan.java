package ClassAndObject.baitap;

public class Fan {
    private final static int SLOW= 1;
    private final static int MEDIUM = 2;
    private final static int FAST = 3;
    private int speed = 1;
    private boolean off = false;
    private double radius = 5;
    private String color = "blue";
    public Fan(int speed,boolean off,String color,double radius){
        this.speed = speed;
        this.off = off;
        this.color = color;
        this.radius = radius;
    }
    public int getSLOW() {
        return SLOW;

    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }
    public boolean isOff() {
        return off;
    }
    public Fan() {

    }
    public String toString() {
        String state = "";
        if (this.isOff()) {
            state = "Fan is off\n";
        } else {
            state += "Fan is on\n";
            state += "Speed : " + this.speed + "\n";
        }
        state += "Color : " + this.color + "\n";
        state += "Radius : " + this.radius + "\n";
        return state;
    }

}
class TestFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3,true,"green",10);
        Fan fan2 = new Fan(1,false,"red",5);
        System.out.println("Fan 1 : ");
        System.out.println(fan1.toString());
        System.out.println("Fan 2 : ");
        System.out.println(fan2.toString());
    }
}
