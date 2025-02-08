package Functions.MethodOverloading;

public class Printer {

    void printMessage(String message) {
        System.out.println(message);
    }

    void printMessage(int num) {
        System.out.println(num);
    }

    void printMessage(String message, int num) {
        System.out.println("Message: " + message + ", num: " + num);
    }

    public static void main(String[] args) {
        Printer obj = new Printer();
        
        obj.printMessage(19); // calls method 2
        obj.printMessage("Jay Ganesh"); // calls method 1
        obj.printMessage("Jay Hanuman", 1);// calls method 3
    }
}
