import java.text.DecimalFormat;

public class Square extends Rectangle implements Resizeable {
    private DecimalFormat decimalFormat = new DecimalFormat("#.##");

    public Square() {

    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A square with side = "
                + decimalFormat.format(getSide())
                + ", which is a subclass of "
                + super.toString();
    }

//    public void increaseSize(double percent) {
//        super(percent);
//    }
//    public void increaseSize(double percent){
//
//        setSide(getSide()*percent/100 + getSide());
//    }
}
