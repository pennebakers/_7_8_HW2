public class Shape {

    private boolean isFilled;
    private String color;

    public Shape(){
        this.isFilled = true;
        this.color = "Green";
    }

    public Shape(boolean isFilled, String color){
        this.isFilled = isFilled;
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setFilled(boolean filled) {
        this.isFilled = filled;
    }

    public boolean getFilled(){
        return this.isFilled;
    }

    @Override
    public String toString(){
        return "Filled: " + getFilled() + "\n" + "Color: " + getColor();
    }
}
