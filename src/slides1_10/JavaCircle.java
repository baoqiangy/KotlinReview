package slides1_10;

public class JavaCircle {
    private double radius;

    public JavaCircle(){}


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "JavaCircle{" +
                "radius=" + radius +
                '}';
    }
}
