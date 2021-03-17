
package classe;

import java.util.Scanner;

public class SequenciaFibonacci {
    
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in); 
        int aux;
        int a = 0;
        int b  = 1;
        int n = 0;
        int auxI = 0;
        
       
       n = teclado.nextInt();
       
        for ( int i = 0; i <= n; i++) {
            System.out.print(a);
            aux = a;
            a = a+b;
            b = aux;
            auxI = a;
            
            if(n != i ){
            System.out.print(" "); 
           }
        }
        System.out.println();
        
    }
    
}
