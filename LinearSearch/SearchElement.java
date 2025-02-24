package LinearSearch;

public class SearchElement {
  public static void main(String[] args) {
    int[] nums = {23, 34, 55, 6, 12, 31, 47, 89, -4, 55};
    int target = 31;
    int ans = linearSearch(nums, target);
    System.out.println(ans);
  }

  // search in the array: return the index if item found
  // otherwise if item not found return -1
  static int linearSearch(int[] arr, int target) {
    if(arr.length == 0){
      return -1;
    }

    // run a for loop
    for(int index = 0; index < arr.length; index++){
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


  // search in the array: return the element if found
  // otherwise if item not found return -1
  static int linearSearch2(int[] arr, int target) {
    if(arr.length == 0){
      return -1;
    }

    // run a for loop
    for(int element : arr){
      // check for element at every index if it if equal to target
      if(element == target){
        return element;
      }
    }

    
    // this line will execute if none of the return statements above have executed
    // hence target is not found
    return Integer.MAX_VALUE;
  }


  // search in the array: return true or false
  // otherwise if item not found return -1
  static boolean linearSearch3(int[] arr, int target) {
    if(arr.length == 0){
      return false;
    }

    // run a for loop
    for(int element : arr){
      // check for element at every index if it if equal to target
      if(element == target){
        return true;
      }
    }

    
    // this line will execute if none of the return statements above have executed
    // hence target is not found
    return false;
  }
}
