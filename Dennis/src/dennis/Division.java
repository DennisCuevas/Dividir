package dennis;
import java.util.Scanner;
public class Division {
public static void main(String[] args) {
   Scanner leer= new Scanner (System.in);
   float n1, n2, r;
   System.out.println("Ingrese primer numero a dividir: ");
   n1= leer.nextFloat ();
    System.out.println("Ingrese segundo numero a dividir: ");
   n2= leer.nextFloat ();
     r= (n1/n2);
      System.out.println("El resultado es: "+r);
    }
    
}
