package week3.testequals;

public class ColorPointComposition {
    private Color color;
    private Point point;

    public ColorPointComposition(int x, int y, Color color) {
        this.point = new Point(x,y);
        this.color = color;
    }
    public Point asPoint(){
        return  point;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ColorPointComposition)) return false;

        ColorPointComposition cp = (ColorPointComposition) o;

        return cp.point.equals(point) && cp.color.equals(color);
    }

}
