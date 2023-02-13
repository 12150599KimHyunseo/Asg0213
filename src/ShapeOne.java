import java.util.Arrays;
import java.util.List;

public class ShapeOne {
    private String type;

    private String color;

    private Double area;

    public ShapeOne(String type, String color, Double area) {
        this.type = type;
        this.color = color;
        this.area = area;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public Double getArea() {
        return area;
    }

    public String toString() {
        return String.format("%s(%s,%f))", type, color, area);
    }

    List<ShapeOne> shapes = Arrays.asList(
            new ShapeOne(type="삼각형", color="빨간색", area=10.5),
            new ShapeOne(type="사각형", color="파란색", area=11.2),
            new ShapeOne(type="원", color="파란색", area=16.5),
            new ShapeOne(type="원", color="빨간색", area=5.3),
            new ShapeOne(type="원", color="노란색", area=8.1),
            new ShapeOne(type="사각형", color="파란색", area=20.7),
            new ShapeOne(type="삼각형", color="파란색", area=3.4),
            new ShapeOne(type="사각형", color="빨간색", area=12.6)
    );
}
