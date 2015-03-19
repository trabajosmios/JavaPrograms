package multiplos;

public class Multiplos {
//aqui empieza el programa
    public static void main(String[] args) {
        
      int i;
      for(i=1;i<=100;i++){
          if(i%15==0){//
          System.out.println("fizz y buzz");
         }else if(i%3==0){/*si son multiplos de 3 imprimir lo siguiente,
             combiear el numero por la frace */
              System.out.println("fizz");
         // System.out.println(i);
      }else if(i%5==0){ /*si los numeros son multiplo de 5 imprimir la
          frace y cambiarla por el numero*/
              System.out.println("buzz");
          
      }else if(i%3==0&&i%5==0){/* aqui cambiara este mensaje 
          cuando sean multiplos de 3 y 5*/
              System.out.println("fiz y buzz");
          
      }else{/*aqui imprime todos los numeros del 1 al 100*/
        System.out.println(i);  
      }
             
                  
              }
                  
              }
          
          
       
               
        
        
            
        }
        
        
        
 
        
        
    
       
        
    
   
