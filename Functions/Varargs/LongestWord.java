// Write a method using varargs that finds the longest word from a given list of words.

package Functions.Varargs;

public class LongestWord {
    public static void main(String[] args) {
        System.out.println(longestWord("apple", "banana", "cherry", "strawberry")); 
        // Output: "strawberry"

        System.out.println(longestWord("Java", "Python", "JavaScript")); 
        // Output: "JavaScript"
    }

    public static String longestWord(String...words) {

        if(words.length == 0){
            return "";
        }

        String longestWord = words[0];
        
        for(String word: words) {
            if(word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }
}
