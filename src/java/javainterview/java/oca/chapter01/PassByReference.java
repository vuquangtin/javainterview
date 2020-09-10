package javainterview.java.oca.chapter01;
/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class PassByReference {


    public static void main(String[] args) {

        Circle c1  = new Circle("BLUE",30,new CentrePoint(12,12));

        ModifyShape ms = new ModifyShape();

        ms.upDateCircle(c1,13,14,"YELLOW");

        System.out.println(c1);

    }




}


class CentrePoint{
    private double xCordinate;
    private double yCordinate;

    public CentrePoint(){}

    public CentrePoint(double xCordinate,double yCordinate){

        this.xCordinate = xCordinate;
        this.yCordinate = yCordinate;
    }

    public double getxCordinate() {
        return xCordinate;
    }

    public void setxCordinate(double xCordinate) {
        this.xCordinate = xCordinate;
    }

    public double getyCordinate() {
        return yCordinate;
    }

    public void setyCordinate(double yCordinate) {
        this.yCordinate = yCordinate;
    }

    @Override
    public String toString() {
        return "CentrePoint{" +
                "xCordinate=" + xCordinate +
                ", yCordinate=" + yCordinate +
                '}';
    }
}

class Circle{
    private String color;
    private double radius;
    private CentrePoint centrePoint;

    public Circle(){}

    public Circle(String color,double radius, CentrePoint centrePoint){

        this.color = color;
        this.centrePoint = centrePoint;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public CentrePoint getCentrePoint() {
        return centrePoint;
    }

    public void setCentrePoint(CentrePoint centrePoint) {
        this.centrePoint = centrePoint;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", radius=" + radius +
                ", centrePoint=" + centrePoint +
                '}';
    }
}

class ModifyShape{

    public void upDateCircle(Circle circle, int deltaX, int deltaY,String Color) {
        // code to move origin of circle to x+deltaX, y+deltaY

        System.out.println("circle : "+circle.toString());

        CentrePoint centrePoint = circle.getCentrePoint();

        System.out.println("current circle centre point :"+centrePoint.toString());

        centrePoint.setxCordinate(circle.getCentrePoint().getxCordinate()+deltaX);
        centrePoint.setyCordinate(circle.getCentrePoint().getyCordinate()+deltaY);

        System.out.println("centrePoint update :"+centrePoint);


        circle.setCentrePoint(centrePoint);

        System.out.println("upDated circle"+circle);


        circle = new Circle("RED",25,new CentrePoint(0,0));

        System.out.println("Circle with new refrence "+circle);

        //circle.setX(circle.getX() + deltaX);
        //circle.setY(circle.getY() + deltaY);

        //circle.set
        // code to assign a new reference to circle
        // circle = new Circle(0,0);
    }

}
