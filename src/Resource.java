public class Resource {
    public enum TYPE {Coal,Wood,Fish}
    public final Point point;
    public final TYPE type;
    public Resource(Point point,TYPE type) {
        this.point = point;
        this.type = type;
    }
}
