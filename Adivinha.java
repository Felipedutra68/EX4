package Ex4;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author ADM
 */
public class Adivinha {
    
public static void main(String[] args) {    
    
  Scanner teclado = new Scanner(System.in);
  
  int r1 = new Random().nextInt(100);
  
 
  for(int i = 1; i <= 7; i++) {     
    
  System.out.println("Digite um numero");
  int n1 = teclado.nextInt();      
  
  if (n1 > r1) {
    System.out.println("O numero eh menor");
    
  }  else if (n1 < r1) {
  
   System.out.println("O numero eh maior");
        
          
   } else if (n1 == r1) { 
  
   System.out.println("Voce venceu");  
   }
  
  
  }    
      
      
  }
}
 