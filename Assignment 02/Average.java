import java.util.*;
public class Average 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int sum = 0;
			System.out.println("Enter elements");
		for(int i =0;i<arr.length;i++){
		    arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++){
		    sum = sum + arr[i];
		}

		int avg = sum/n;
	     System.out.print("Average of elements is "+avg);
		
	}
}