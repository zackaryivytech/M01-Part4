

public class Main {
    public static void main(String[] args) {

        RegularPolygon p1 = new RegularPolygon();
        System.out.println("Perimeter: " + p1.getPerimeter());
        System.out.println("Area: " + p1.getArea());

        RegularPolygon p2 = new RegularPolygon(6, 4);
        System.out.println("Perimeter: " + p2.getPerimeter());
        System.out.println("Area: " + p2.getArea());

        RegularPolygon p3 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println("Perimeter: " + p3.getPerimeter());
        System.out.println("Area: " + p3.getArea());


    }
}