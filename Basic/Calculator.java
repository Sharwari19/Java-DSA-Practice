// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Take input from user till user does not press X or x

        int answer = 0;

        System.out.println("Welcome to the calculator application!");
        System.out.println();

        System.out.println("Press X or x to exit the application");
        System.out.println();

        while(true) {
            // take the operator as input 

            System.out.print("Enter the operator");
            char operator = scan.next().trim().charAt(0);

            if(operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {
                // input two number

                System.out.print("Enter two numbers");

                int num1 = scan.nextInt();
                int num2 = scan.nextInt();

                if(operator == '+') {
                    answer = num1 + num2;
                }
                if(operator == '-') {
                    answer = num1 - num2;
                }
                if(operator == '*') {
                    answer = num1 * num2;
                }
                if(operator == '/') {
                    if(num2 != 0){
                        answer = num1 / num2;
                    }
                }
                if(operator == '%') {
                    answer = num1 % num2;
                }
            }
            else if(operator == 'X' || operator == 'x') {
                break;
            }
            else {
                System.out.println("Invalid Operation");
            }

            System.out.println("Result: " + answer);
        }
    }
}
