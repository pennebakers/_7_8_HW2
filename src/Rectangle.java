public class Rectangle extends Shape{

    private double width;
    private double length;

    public Rectangle(){
        this.width = 1;
        this.length = 2;
    }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, boolean isFilled, String color){

        super(isFilled, color);
        this.length = length;
        this.width = width;

    }

    public void setLW(int x, int y){
        if(x > y){
            this.length = x;
            this.width = y;
        }
        else{
            this.length = y;
            this.width = x;
        }

    }

    public double getArea(){
        return this.width * this.length;
    }

    public String toString(){
        return "Width: " + this.width + "\n" + "Length: " + this.length + "\n" + "Area: " + getArea() + "\n" + super.toString();
    }



}
