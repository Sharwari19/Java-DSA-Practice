package LinearSearch;

public class SearchInRange {
  public static void main(String[] args) {

  }

  static int linearSearch(int[] arr, int target, int start, int end) {
    if(arr.length == 0){
      return -1;
    }

    // run a for loop
    for(int index = start; index <= end; index++){
      // check for element at every index if it if equal to target
      int element = arr[index];
      if(element == target){
        return index;
      }
    }

    
    // this line will execute if none of the return statements above have executed
    // hence target is not found
    return -1;
  }
}
