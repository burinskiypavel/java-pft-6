public class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static double distance(Point p1, Point p2){
        double resX = (p2.x - p1.x) * (p2.x - p1.x);
        double resY = (p2.y - p1.y) * (p2.y - p1.y);
        double sum = resX + resY;
        double result = Math.sqrt(sum);
        return result;
    }
}
