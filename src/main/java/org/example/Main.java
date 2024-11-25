package org.example;

public class Main {
    public static void main(String[] args) throws Exception {
        Shape circle = new Circle(2.0);
        System.out.println("Circle radius: 2.0");
        System.out.println("Circle area:" + circle.getArea());
        System.out.println("Circle perimeter:" + circle.getPerimeter());
        Shape rectangle = new Rectangle(2.0, 5.0);
        System.out.println("Rectangle height 2.0, width 5.0");
        System.out.println("Rectangle area:" + rectangle.getArea());
        System.out.println("Rectangle perimeter:" + rectangle.getPerimeter());
        Shape triangle = new Triangle(2.0, 2.0, 2.0);
        System.out.println("Triangle a=2, b=2, c=2");
        System.out.println("Triangle area:" + triangle.getArea());
        System.out.println("Triangle perimeter:" + triangle.getPerimeter());

        Shape circle1 = new Circle(2.0);
        Shape circle2 = new Circle(2.0);
        Shape circle3 = new Circle(2.1);
        Shape triangle1 = new Triangle(1.0, 2, 3);
        Shape triangle2 = new Triangle(3,2,1);
        System.out.println(Shapes.compareShape(circle1, circle2));
        System.out.println(Shapes.compareShape(circle1, circle3));
        System.out.println(Shapes.compareShape(triangle1, triangle2));
        System.out.println(Shapes.compareShape(circle1, triangle1));
        System.out.println(Shapes.toCubicCentimeter(circle1.getArea()));
    }
}
