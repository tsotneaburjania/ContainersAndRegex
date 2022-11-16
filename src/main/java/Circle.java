public class Circle{
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

//    @Override
//    public int compareTo(Object o) {
//        Circle other = (Circle) o;
//        if (this.radius > other.getRadius()){
//            return 1;
//        }
//        else if (this.radius < other.getRadius()){
//            return -1;
//        }
//        else {
//            return 0;
//        }
//    }
}
