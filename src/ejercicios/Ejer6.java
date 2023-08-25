package ejercicios;

import java.util.Scanner;

public class Ejer6 {
    double numero;

    public void pedirNumero(){
        System.out.println("Ingrese un numero");
        Scanner entrada = new Scanner(System.in);
        numero = entrada.nextInt();
        //entrada.close();
    }

    public void determinar(){
        if(numero == 0){
            System.out.println("El numero es cero");
        }else if(numero > 0){
            System.out.println("El numero es mayor a cero");
        }else{
            System.out.println("El numero es menor a cero");
        }
    }


}
