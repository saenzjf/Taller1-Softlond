package ejercicios;
import java.util.Scanner;

public class Ejer2 {
    //static 
    int numero1;
    
    public Ejer2(){
        //Ejer1 objetoInterno = new Ejer1();
        pedir_1_numero();
    }

    public void /*static int*/ pedir_1_numero(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        numero1 = entrada.nextInt();
        //entrada.close();
        //return numero1;
    }

    public void par_impar(){
        if(numero1 % 2 == 0){
            System.out.println(numero1 + " es par");
        }else{
            System.out.println(numero1 + " es impar");
        }
    }
}
