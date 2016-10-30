package week3.testequals;

public class ColorPoint extends Point {
    private Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || !(o.getClass() == ColorPoint.class)) return false;
        ColorPoint cp = (ColorPoint) o;
        return super.equals(o) && cp.color.equals(color);

    }
}
