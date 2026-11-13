import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
      }
      for(int k=0;k<n;k++){
        int min = k;
        for(int j=k+1;j<n;j++){
          if(arr[j]<arr[min]){
            min = j;
          }
        }
        int z = arr[min];
        arr[min] = arr[k];
        arr[k] = z;
      }
      for(int l=0;l<n;l++){
        System.out.println(arr[l]);
      }
      sc.close();
    }
}
