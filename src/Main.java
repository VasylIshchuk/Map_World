import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        checkPointInsidePolygon();
//        checkPointOutsidePolygon();
//        checkPointRightOfPolygon();
//        ckeckAddCityOutsideLand();
//        ckeckAddCityInsideLand();
//        checkCityIsPortCity();
//        checkAddResources();
//        checkAddResourcesPortCity();
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
    public static void checkCityIsPortCity(){
            List<Point> points = new ArrayList<>();
            points.add(new Point(220,10));
            points.add(new Point(300,210));
            points.add(new Point(170,250));
            points.add(new Point(123,234));
            Land land = new Land(points);
            City city = new City(
                    new Point(220,12), "New York", 10.0);
            land.addCity(city);
            System.out.println(city.isPort());
    }
    public static void checkAddResources(){
        List<Point> points = new ArrayList<>();
        points.add(new Point(220,10));
        points.add(new Point(300,210));
        points.add(new Point(170,250));
        points.add(new Point(123,234));
        Land land = new Land(points);
        City city = new City(
                new Point(220,50), "New York", 10.0);
        List<Resource> resources = new ArrayList<>();
        resources.add(new Resource(new Point(206,38), Resource.TYPE.Wood));
        resources.add(new Resource(new Point(230,58), Resource.TYPE.Fish));

        city.addResourcesInRange(resources,15.0);
        land.addCity(city);
        for (Resource resource : city.resources) {
            System.out.println(resource.type);
        }
    }
    public static void checkAddResourcesPortCity(){
        List<Point> points = new ArrayList<>();
        points.add(new Point(220,10));
        points.add(new Point(300,210));
        points.add(new Point(170,250));
        points.add(new Point(123,234));
        Land land = new Land(points);
        City city = new City(
                new Point(220,12), "New York", 20.0);
        land.addCity(city);
        List<Resource> resources = new ArrayList<>();
        resources.add(new Resource(new Point(206,8), Resource.TYPE.Wood));
        resources.add(new Resource(new Point(230,21), Resource.TYPE.Fish));

        city.addResourcesInRange(resources,15.0);
        for (Resource resource : city.resources) {
            System.out.println(resource.type);
        }
    }
}