import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
      }
      int val = sc.nextInt();
      int low = 0;
      int high = n-1;
      
      while(low <= high){
        int mid = (low+high)/2;
        if(val == arr[mid]){
          System.out.println("Element found "+arr[mid]);
          break;
        }
        else if(val<arr[mid]){
          high = mid-1;
        }
        else if(val>arr[mid]){
          low = mid+1;
        }
        else{
          System.out.println("No Element");
        }
      }
      sc.close();

    }
}
