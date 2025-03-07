package Ex4;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class idades {

 public static void main(String[] args) {    
    
  Scanner teclado = new Scanner(System.in);    
int c1 = 0;
for(int i = 1; i <= 5; i++) {  
  
System.out.println("Digite uma idade");
  int idade = teclado.nextInt();  
  
  c1 = c1 + idade;
   
  }
 int c2 = c1/5;

 System.out.println("A media dos numeros eh:"+c2);
 
 }    
    
    
}
