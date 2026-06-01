import java.util.*;
public class JaggedArray{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[][] arr=new int[3][];
		arr[0]=new int[3];
		arr[1]=new int[4];
		arr[2]=new int[5];
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter the marks of "+i+1+"  ");
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<arr.length;i++){
			System.out.print("Printing the student "+i+"'s total marks :");
			int sum=0;
			for(int j=0;j<arr[i].length;j++){
				sum+=arr[i][j];
			}
			System.out.println(sum);
		}
		
	}
}