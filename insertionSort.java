import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
      }
      for(int k=1;k<n;k++){
        int key = arr[k];
        int j = k-1;
        while(j>=0 && arr[j]>key){
          arr[j+1] = arr[j];
          j = j-1;
        }
        arr[j+1] = key;
      }
      for(int l=0;l<n;l++){
        System.out.println(arr[l]);
      }
      sc.close();
    }
}
