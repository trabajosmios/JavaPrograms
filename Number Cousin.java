import java.util.Scanner;


public class primowhile {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		int Num,i,cont=0;
		do{
		System.out.println("ingrese un numero entero:");
		Num=leer.nextInt();
		if(Num > 0){
			i=1;
		while(i<=Num){
			if((Num % i) ==0){
				cont++;	
				
			}
			i++;
			
		}
		if(cont<=2){
			System.out.println("el numero "+ Num +" es primo");
		}
		else{
			System.out.println(" el numero "+ Num +" no es primo");
		}
		}
		else{
			System.out.println("numero menor que 1");
		}
		
	}while(Num > 0);
}


	}


