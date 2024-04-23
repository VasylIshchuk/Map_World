public class Resource {
    public enum TYPE {Coal,Wood,Fish}
    public final Point point1;
    public final TYPE type;
    public Resource(Point point1,TYPE type) {
        this.point1 = point1;
        this.type = type;
    }
}
