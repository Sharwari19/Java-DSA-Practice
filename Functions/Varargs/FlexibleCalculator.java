// Write a method that takes an operator (+, -, *, /) and a variable number of arguments, then performs that operation on all numbers.

package Functions.Varargs;

public class FlexibleCalculator {
    public static void main(String[] args) {
        System.out.println(calculator("+", 10, 20, 30)); // Output: 60
        System.out.println(calculator("*", 2, 3, 4)); // Output: 24
        System.out.println(calculator("-", 50, 10, 5)); // Output: 35
        System.out.println(calculator("/", 100, 2, 5)); // Output: 10
    }

    public static int calculator(String operator, int...operands) {
        if(operands.length == 0) {
            return (operator.equals("*")) ? 1 : 0;  // for multiplication initial value of result will be 1
        }

       int result = operands[0]; // start with first number

       for(int i = 1; i < operands.length; i++) {
        switch (operator) {
            case "+" -> result += operands[i];
            case "-" -> result -= operands[i];
            case "*" -> result *= operands[i];
            case "/" -> {
                if(operands[i] != 0) {
                    result /= operands[i];
                }
                else {
                    System.out.println("Error: Division by zero!");
                    return 0;
                }
                
            }
            case "%" -> result %= operands[i];
            default -> {
                System.out.println("Invalid operator!");
                return 0;
            }
        }
       }
        
        return result;

    }
}
