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
    public boolean inside (Point point){
        int counter = 0;
        double d,x,a,b;
        for(int i = 0; i < pointsList.size();i = i+2){
            Point point1 = pointsList.get(i);
            Point point2 = pointsList.get(i + 1);
            if(point1.y > point2.y){
                Point tmp = point1;
                point1 = point2;
                point2 = tmp;
            }
            if(point1.y < point.y && point.y < point2.y){
                d = point2.x - point1.x;
                if(d == 0){
                    x = point1.x;
                } else {
                    a = (point2.y - point1.y)/d;
                    b = point1.y - a * point1.x;
                    x = (point.y - b)/a;
                }
                if(x < point.x) ++counter;
            }
        }
        if((counter % 2) == 1)return  false;
        else return  true;
    }
}
