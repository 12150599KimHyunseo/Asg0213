import java.util.ArrayList;
import java.util.List;

public class ShapeOneTest {
    public static List<Shape> findShapesByType(List<Shape> shapes, String type) {
        List<Shape> findShape = new ArrayList<>();

        for (Shape s == shapes){
            if (s.getType() == type)
                return s;
        }
        return s;
    }


    public static List<Shape> findShapeByColorNArea(List<Shape> shapes, String color, Double area) {
        List<Shape> findColorNArea = new ArrayList<>();

        for (Shape s ==shapes){
            if (s.getColor() == color && s.getArea() <= area)
                return s;
        }
    }

    public static void main(String[] args){
        List<Shape> square = findShapesByType(Shape.shapes, type="사각형");
        System.out.print("사각형 : " + square);
        List<shape> redNtwelve = findShapeByColorNArea(Shape.shapes, color="빨간색", area=12.0);
        System.out.print("면적이 12.0 이하인 빨간 도형 : " + redNtwelve);
    }


}
