/**
 * @author ArunBabu Subramaniam
 * Time Complexity
 * 	Best Case - O(N)
 * 	Average Case - O(N^2)
 * 	Worst Case - O(N^2)
 * Inplace sorting Algorithm
 * Stable sorting Algorithm
 * Space Complexity - O(1)
 * @param <T>
 */
public class InsertionSort<T> {

  public void sort(T[] obj){
    int i;

    //Loop through the array
    for(i=0;i<obj.length;i++){
      int c = i+1;
      
      while(c > 0){
        if((((Comparable)obj[c]).compareTo(obj[c-1])) < 0){
          swap(c,c-1,obj);
        } else{
          break;
        }
        c--;
      }
    }
  }

  private static swap (int from, int to, obj){
    T temp = obj[to];
    obj[to] = obj[from];
    obj[from] = temp;
  }

}
