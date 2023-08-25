package ejercicios;
import java.util.Scanner;

public class Ejer1 {
    int numero1, numero2;

    public Ejer1() {
        pedir_2_Numeros();
    }

    public void pedir_2_Numeros(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número entero");
        numero1 = scanner.nextInt();
        
        System.out.println("Ingrese el segundo número entero");
        numero2 = scanner.nextInt();

        //scanner.close();
    }


    public void suma(){
        int resultado = numero1 + numero2;
        System.out.println("La suma es: " + resultado);
    }
    public void resta(){
        int resultado = numero1 - numero2;
        System.out.println("La resta es: " + resultado);
    }
    public void multiplicacion(){
        int resultado = numero1 * numero2;
        System.out.println("La multiplicacion es: " + resultado);
    }
    public void division(){
        int resultado = numero1 / numero2;
        System.out.println("La division es: " + resultado);
    }
}
