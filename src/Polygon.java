import java.util.List;
public class Polygon {
    private List<Point> pointsList;
    public String makePolygon(){
        StringBuilder polygon = new StringBuilder();
        polygon.append("<polygon points=\"");
        for(Point point : pointsList){
            polygon.append(point.x)
                    .append(",")
                    .append(point.y)
                    .append(" ");
        }
        polygon.append("\"");
        return String.valueOf(polygon);
    }
}
