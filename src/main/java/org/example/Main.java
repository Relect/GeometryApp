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
    }
}
