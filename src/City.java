import java.util.ArrayList;

public class City extends Polygon{
    public final Point center;
    private String nameCity;
    boolean port;
    public String getNameCity() {
        return nameCity;
    }
    public City(Point center, String nameCity, double wallLength) {
        super(new ArrayList<>());
        double halfWallLength = wallLength/2.0;
        double x1 = center.x - halfWallLength;
        double x2 = center.x + halfWallLength;
        double y1 = center.y - halfWallLength;
        double y2 = center.y + halfWallLength;
        addPoint(new Point(x1,y1));
        addPoint(new Point(x2,y1));
        addPoint(new Point(x2,y2));
        addPoint(new Point(x1,y2));

        this.port = false;
        this.center = center;
        this.nameCity = nameCity;
    }
    public void checkCityIsPortCity(Land land){
        for(Point point : getPointsList()){
            if(!land.inside(point)){
                port = true;
                break;
            }
        }
    }
}
