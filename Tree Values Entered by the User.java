
package tresvalores;
import java.util.Scanner;

public class Tresvalores {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a,b,c;
        
        System.out.println("Introduzca su primer valor");
        a = teclado.nextInt();
        System.out.println("Introduzca su segundo valor");
        b = teclado.nextInt();
        System.out.println("Introduzca su tercer valor");
        c = teclado.nextInt();
        if(a>b && a>c){
            System.out.println("el mayor es:"+a);
        }else if (b>a && b>c)
            System.out.println("el mayor es:"+b); {
        if(c>b && c>a){
            System.out.println("el mayor es:"+c);
        }  
           
        }
      
    }
    
}