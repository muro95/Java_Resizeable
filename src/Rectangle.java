import java.text.DecimalFormat;
public class Rectangle extends Shape implements Resizeable{
    private double width = 1.0;
    private double length = 1.0;
    private DecimalFormat decimalFormat = new DecimalFormat("#.##");

    public Rectangle(){

    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getArea(){
        return width * this.length;
    }
    public double getPerimeter(){
        return 2 * (width + this.length);
    }

    @Override
    public String toString(){
        return "A Rectangle with width = "
                +decimalFormat.format(getWidth())
                +" and length = "
                +decimalFormat.format(getLength())
                +", which is a subclass of "
                +super.toString();
    }
    public void increaseSize(double percent){
        this.width = getWidth()*percent/100 + getWidth();
        this.length = getLength()*percent/100 + getLength();
    }
}
