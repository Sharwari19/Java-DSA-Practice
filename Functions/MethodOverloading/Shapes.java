// very imp program practicle example to explain in interview


package Functions.MethodOverloading;

public class Shapes {


    // Calculates area of circle
    void area(double radius) {
        double PI = 3.14;
        double area = PI * radius * radius;
        System.out.println("Area of circle: " + area);
    }

    // calculates area of rectangle
    void area(int length, int width) {
        int area = length * width;
        System.out.println("Area of reactangle: " + area);
    }

    // calculates area of triangle using heron's formula
    void area(double side1, double side2, double side3) {
        // using heron's formula

        double s = (side1 + side2 + side3) / 2; // semi-perimeter s = (a + b + c) / 2

        // heron's formula A = sqrt(s(s - a)(s - b)(s - c))
        double area = Math.sqrt(s * (s- side1) * (s - side2) * (s - side3));  

        System.out.println("Area of triangle: " + area);
    }
    public static void main(String[] args) {
        Shapes obj = new Shapes();

        obj.area(11.0, 21.1, 51.3);     // calls triangle area method
        obj.area(11.5);             // calls circle area method
        obj.area(11, 21);      // calls rectangle area method
    }
}
