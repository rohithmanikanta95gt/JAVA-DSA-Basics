import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
      }
      for(int k=0;k<n-1;k++){
        for(int j=0;j<n-1-k;j++){
          if(arr[j]>arr[j+1]){
            int z = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = z;
          }
        }
      }
      for(int l=0;l<n;l++){
        System.out.println(arr[l]);
      }
      sc.close();
    }
}
