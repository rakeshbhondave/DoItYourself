import java.util.*;
public class Missing
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int sum = 0;
			System.out.println("Enter elements");
		for(int i = 0;i<arr.length;i++){
		    arr[i] = sc.nextInt();
		}
		for(int i = 1;i<arr.length;i++)
		{
		   if(arr[i]-arr[i-1]==2){
		   System.out.println(arr[i]-1);
		   }
		}
		  
	}
}