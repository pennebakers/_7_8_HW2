public class Circle extends Shape{

    private double radius;

    public Circle(){
        radius = 1;
    }

    public Circle(double radius){
        radius = radius;
    }

    public Circle(double radius, boolean isFilled, String color){
        super(isFilled, color);
        radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public String toString(){
        return "Radius: " + this.radius + "\n" + "Area: " + getArea() + "\n" + super.toString();
    }
}
