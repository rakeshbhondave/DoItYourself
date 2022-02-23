import java.util.*;
public class Thirteen
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
	      int a = sc.nextInt();
	      int b = sc.nextInt();
	      int c = sc.nextInt();
	    // smallest of three numbers without using < or > :-
	    int sum = a+b+c;
	    for(int i = 0;i<= sum;i++)
	    {
	        a--;
	        b--;
	        c--;
	        if(a==0){
	            System.out.println("a is the smallest");
	            break;
	        }
	        else if(b==0){
	            System.out.println("b is the smallest");
	            break;
	        }
	        else if(c==0){
	            System.out.println("c is the smallest");
	            break;
	        }
	    }
	    
	}
}