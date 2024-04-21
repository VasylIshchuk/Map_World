import java.util.ArrayList;
import java.util.List;

public class Land extends Polygon{
    List<City> cities = new ArrayList<>();
    public Land(List<Point> pointsList) {
        super(pointsList);
    }
    public void addCity(City city){
        if (inside(city.center)) cities.add(city);
        else throw new RuntimeException(city.getNameCity());
    }
}
