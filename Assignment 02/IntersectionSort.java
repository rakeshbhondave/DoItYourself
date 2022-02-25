import java.util.*;
public class IntersectionSort
{
	public static void main(String[] args) {
	     int arr1[] = {6,5,4,3,2,1,0,7,3,8};
	     Arrays.sort(arr1);
	     int arr2[] = {5,6,7,8,9,10};
	     Arrays.sort(arr2);
	     for(int i=0;i<arr1.length;i++)
	     {
	         for(int j=0;j<arr2.length;j++)
	         {
	            
	            if(arr1[i]==arr2[j])
	            System.out.println(arr1[i]);
	         }
	     }
	}
}