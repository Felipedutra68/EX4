package Ex4;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class repitirCarecter {
    
     public static void main(String[] args) {
    
  Scanner teclado = new Scanner(System.in);   
  
  Scanner teclado2 = new Scanner(System.in);   
    
   System.out.println("Digite um numero");
  int v = teclado.nextInt();  
  
   System.out.println("Digite um carecter");
  String c = teclado2.nextLine();  
  
  for(int i = 1; i <= v; i++) {
  
  System.out.println(c);    
    

  
  
  }
 }
}
