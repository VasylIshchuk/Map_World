import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        checkPointInsidePolygon();
//        checkPointOutsidePolygon();
//        checkPointRightOfPolygon();
//        ckeckAddCityOutsideLand();
        ckeckAddCityInsideLand();
    }
    public static void checkPointInsidePolygon(){
        List<Point> points = new ArrayList<>();
        points.add(new Point(220,10));
        points.add(new Point(300,210));
        points.add(new Point(170,250));
        points.add(new Point(123,234));
        Polygon polygon = new Polygon(points);
        boolean result = polygon.inside(new Point(220,100));
        if(result) System.out.println("Point inside polygon");
        else System.out.println("Error");
    }
    public static void checkPointOutsidePolygon(){
        List<Point> points = new ArrayList<>();
        points.add(new Point(220,10));
        points.add(new Point(300,210));
        points.add(new Point(170,250));
        points.add(new Point(123,234));
        Polygon polygon = new Polygon(points);
        boolean result = polygon.inside(new Point(310,300));
        if(!result) System.out.println("Point outside polygon");
        else System.out.println("Error");
    }
    public static void checkPointRightOfPolygon(){
        List<Point> points = new ArrayList<>();
        points.add(new Point(220,10));
        points.add(new Point(300,210));
        points.add(new Point(170,250));
        points.add(new Point(123,234));
        Polygon polygon = new Polygon(points);
        boolean result = polygon.inside(new Point(310,100));
        //How to check if a point a really to the right of the polygon not to the left?
        if(!result) System.out.println("Point right of polygon");
        else System.out.println("Error");
    }
    public static void ckeckAddCityOutsideLand(){
        List<Point> points = new ArrayList<>();
        points.add(new Point(220,10));
        points.add(new Point(300,210));
        points.add(new Point(170,250));
        points.add(new Point(123,234));
        Land land = new Land(points);
        City city = new City(
                new Point(100, 100), "New York", 10.0);
        land.addCity(city);
    }
    public static void ckeckAddCityInsideLand(){
        List<Point> points = new ArrayList<>();
        points.add(new Point(220,10));
        points.add(new Point(300,210));
        points.add(new Point(170,250));
        points.add(new Point(123,234));
        Land land = new Land(points);
        City city = new City(
                new Point(220,100), "New York", 10.0);
        land.addCity(city);
        System.out.println(land.cities.get(0).getNameCity());
    }
}