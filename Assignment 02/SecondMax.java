import java.util.*;
public class SecondMax
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
		int temp=0;
		for(int i=0;i<arr.length;i++){
		    
		    for(int j=i+1;j<arr.length;j++){
		        if(arr[i]>arr[j])
		        {
		          temp = arr[i];
		          arr[i] = arr[j];
		          arr[j] = temp;
		        }
		    }
		}
		     System.out.println(arr[arr.length-2]);
	}
}
