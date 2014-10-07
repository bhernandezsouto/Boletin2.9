
package ejercicio9;
import java.util.Scanner;

public class Ejercicio9 {

   
    public static void main(String[] args) {
       int c1, c2, c3, c4, cuenta;
       Scanner sc = new Scanner (System.in);
       System.out.println ("Introduzca el número de billetes de 100€:");
       c1 = sc.nextInt();
       System.out.println ("Introduzca el número de billetes de 20€:");
       c2 = sc.nextInt();
       System.out.println ("Introduzca el número de billetes de 5€:");
       c3 = sc.nextInt();
       System.out.println ("Introduzca el número de billetes de 1€:");
       c4 = sc.nextInt ();
       cuenta = (100*c1)+(20*c2)+(5*c3)+(c1);
       System.out.println ("La cantidad de dinero introducida es de: "+cuenta+"€");
    }
    
}
