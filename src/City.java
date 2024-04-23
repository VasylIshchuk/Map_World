import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class City extends Polygon{
    public final Point center;
    private String nameCity;
    private boolean port;
    public Set<Resource> resources = new HashSet<>();
    public String getNameCity() {
        return nameCity;
    }
    public boolean isPort() {
        return port;
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

    public void addResourcesInRange(List<Resource> resourceList, double range){
       for (Resource resourse : resourceList){
            if ((center.x-range < resourse.point.x && resourse.point.x < center.x+range)
                 && (center.y-range < resourse.point.y && resourse.point.y < center.y+range)){
                //calculateDistance(resource.getPosition(), center) <= range   d = sqrt(x2−x1)^2+(y2 −y1)^2
                if (resourse.type.equals(Resource.TYPE.Fish) && !port) continue;
                resources.add(resourse);
            }
        }
    }
}
