package Functions.MethodOverloading;

public class OverloadingEg1 {

    // // Method 1: Adds two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method 2: Adds three integers (same name, different parameters)
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Adds two double numbers (same name, different parameter type)
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        OverloadingEg1 obj = new OverloadingEg1();
        System.out.println(obj.add(5, 10));  // Calls Method 1
        System.out.println(obj.add(5, 10, 15)); // Calls Method 2
        System.out.println(obj.add(5.5, 2.5)); // Calls Method 3
    }
}
