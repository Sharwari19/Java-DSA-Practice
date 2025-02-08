package Functions.MethodOverloading;

public class Multiply {

    int multiply(int a, int b) {
        return a * b;
    }

    int multiply(int a, int b, int c) {
        return a * b * c;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        Multiply obj = new Multiply();

        System.out.println(obj.multiply(11, 12)); // Calls method 1
        System.out.println(obj.multiply(11.1, 21.5)); //Calls method 3
        System.out.println(obj.multiply(11, 21, 51)); // Calls method 2
    }


}
