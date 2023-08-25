package ejercicios;

import java.util.Scanner;

public class Ejer8 {
    int numeroSecreto, numeroUsuario;


    public void numeroAleatorio(){
        numeroSecreto = (int)(Math.random()*100);
        System.out.println(numeroSecreto);

        
        do{
        System.out.println("Ingrese un número entre 1 y 100");
        Scanner entrada = new Scanner(System.in);
        numeroUsuario = entrada.nextInt();
        

        }while(numeroUsuario != numeroSecreto);
        System.out.println("Has acertado");
        
    }
}
