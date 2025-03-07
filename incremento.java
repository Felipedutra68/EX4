package Ex4;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class incremento {
    
 public static void main(String[] args) {    
    
  Scanner teclado = new Scanner(System.in);
  
  Scanner teclado2 = new Scanner(System.in); 
  
System.out.println("Digite o primeiro numero");
  int v1 = teclado.nextInt();
  
  System.out.println("Digite o segungo numero");
  int v2 = teclado.nextInt();
  
  System.out.println("Digite um incremento");
  String s1 = teclado2.nextLine();

 for(int i = v1; i <= v2 ; i++) {
  
 System.out.println(s1);
     
     
     
  }
 }
}
