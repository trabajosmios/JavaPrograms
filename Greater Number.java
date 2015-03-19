
import java.util.Scanner;
public class numeromayor {

	public static void main(String[] args) {
		Scanner numeromayor = new Scanner(System.in);
		
		 int a=3,b=12,c=10;
	        if(a>b &&a>c){
	            System.out.println(a);
	        }else if(b>a && b>c){
	            System.out.println(b);
	        }else{
	            System.out.println(c);
	    }
	}
	}