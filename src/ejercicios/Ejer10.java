package ejercicios;

import java.util.Scanner;

public class Ejer10 {
    
    double a, b, c;

    public void pedir3numeros(){

        System.out.println("CALCULO DE ÁREA POR HERON");
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el primer lado");
        a = entrada.nextDouble();
        System.out.println("Ingrese el segundo lado");
        b = entrada.nextDouble();
        System.out.println("Ingrese el tercer lado lado");
        c = entrada.nextDouble();

        //entrada.close();
    }

    public void calcularArea(){
        double area, s;
        // s = (a+b+c) / 2
        // A = raiz[ s * (s-a) * (s-b) * (s-c)]

        s = (a + b + c) / 2;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("El area es: " + area);
    }
}
