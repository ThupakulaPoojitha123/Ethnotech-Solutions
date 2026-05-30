//1>>Rotation of array by k shifts right;
//2>>Store temperatures of 30 days and find what is hiheist,lowest,
//average and number of hot days >35degree celcius;
import java.util.*;
public class RightShiftByKPos{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array " );
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter Array elements ");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter K value ");
		int k=sc.nextInt();
		rightShift(arr,k);
		System.out.println(Arrays.toString(arr));
		
	}
    public static void rightShift(int[] arr, int k) {
        int n = arr.length;
        k = k % n; 
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[n - k + i];
        }
        for (int i = n - 1; i >= k; i--) {
            arr[i] = arr[i - k];
        }
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
    }
}
