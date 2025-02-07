// Write a method using varargs that takes multiple strings and concatenates them into a single sentence.

package Functions.Varargs;

public class ConcatenateStrings {
    public static void main(String[] args) {
        System.out.println(concat("Hello", "world", "this", "is", "Java")); 
        // Output: "Hello world this is Java"

        System.out.println(concat("Varargs", "make", "life", "easier")); 
        // Output: "Varargs make life easier"
    }

    public static String concat(String...words) {

        if(words.length == 0) {
            return "";
        }

        // use string builder for efficiency over string
        StringBuilder result  = new StringBuilder();

        for(String word: words) {
            result.append(word).append(" ");
        }

        return result.toString().trim(); // remove trailing spaces
    }
}
