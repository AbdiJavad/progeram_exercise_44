public class Exercise_10_04 {
    public static void main(String[] args) {

        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(10, 30.5);

        // Display the distance between point1 and point2
        System.out.println("The distance between ("
                + point1.getX() + ", " + point1.getY() + ") and ("
                + point2.getX() + ", " + point2.getY() + ") is: " +
                point1.distance(point2));
    }
}

