/**
 * @author ArunBabu subramaniam
 * Time Complexity O(n^2)
 * In-place & May be stable or unstable which is based on the order of the elements in the array
 * Space complexity - O(1)
 * @param <T>
 */
public class SelectionSort<T>{

  public void sort( T[] obj) {
    int i,j,c;
    int len = obj.length;

    //Loop through the array
    for(i=0;i<len-1;i++){
      int l = i;
      //assigning the current position
      c = i;
      for(j=i+1;j<len;j++){
        //compare and assign the least value to l
        if((((Comparable<T>)obj[j]).compareTo(obj[l]) < 0)){
          l = j;
        }
      }
      //swap  value in the current position with the lowest value
      T temp = obj[c];
      obj[c] = obj[l];
      obj[l] = temp;
    }
  }
}
