package ejercicios;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Ingrese el número del problema desea resolver.");
        Scanner sc = new Scanner(System.in);
        int problema = sc.nextInt();
        //sc.close();

        switch (problema) {
         
            case 1:
                Ejer1 ejercicio = new Ejer1();
                ejercicio.suma();
                ejercicio.resta();
                ejercicio.multiplicacion();
                ejercicio.division();
                break;

            case 2:
                Ejer2 ejercicio2 = new Ejer2();
                ejercicio2.par_impar();
                break;
            
            case 3:
                Ejer3 ejercicio3 = new Ejer3();
                ejercicio3.area();
                ejercicio3.perimetro();
                break;
            
            case 4:
                Ejer4 ejercicio4 = new Ejer4();
                ejercicio4.pedirEdad();
                ejercicio4.mostrarEdad();
                break;
            
            case 5:
                Ejer5 ejercicio5 = new Ejer5();
                ejercicio5.mayor();
                break;
            
            case 6:
                Ejer6 ejercicio6 = new Ejer6();
                ejercicio6.pedirNumero();
                ejercicio6.determinar();
                break;
            
            case 7:
                Ejer7 ejercicio7 = new Ejer7();
                ejercicio7.tablaMultiplicar(); 
                break;

            case 8:
                Ejer8 ejercicio8 = new Ejer8();
                ejercicio8.numeroAleatorio();  
                break;

            case 9:
                Ejer9 ejercicio9 = new Ejer9();
                ejercicio9.factorial();
                break;

            case 10:
                Ejer10 ejercicio10 = new Ejer10();
                ejercicio10.pedir3numeros();
                ejercicio10.calcularArea();
                break;
            
            case 11:
                Ejer11 ejercicio11 = new Ejer11();
                ejercicio11.fibonacci();
                break;
            
            case 12:
                Ejer12 ejercicio12 = new Ejer12();
                ejercicio12.imprimir();
                break;
            
            case 13:
                Ejer13 ejercicio13 = new Ejer13();
                ejercicio13.pedirNumeroDecimal();
                ejercicio13.mostrar();
                break;
            
            case 14:
                Ejer14 ejercicio14 = new Ejer14();
                ejercicio14.mostrarResultado();
                break;
            
            case 15:
                Ejer15 ejercicio15 = new Ejer15();
                ejercicio15.mostrarResultado();
                break;
            
            case 16:
                Ejer16 ejercicio16 = new Ejer16();
                ejercicio16.fibonacci();
                break;
            
            case 17:
                Ejer17 ejercicio17 = new Ejer17();
                ejercicio17.imprimirPrimos();
                break;
            
            case 18:
                Ejer18 ejercicio18 = new Ejer18();
                ejercicio18.generarContraseña();
                break;
            
            case 19:
                Ejer19 ejercicio19 = new Ejer19();
                ejercicio19.pedirNombre();
                break;
            
            case 20:
                Ejer20 ejercicio20 = new Ejer20();
                ejercicio20.invertirCadena();
                break;
            
            case 21:
                Ejer21 ejercicio21 = new Ejer21();
                ejercicio21.pedirDatos();
                break;
            
            case 22:
                Ejer22 ejercicio22 = new Ejer22();
                ejercicio22.pedirOracion();
                break;
            
            case 23:
                Ejer23 ejercicio23 = new Ejer23();
                ejercicio23.pedirOracion();
                break;
            
            case 24:
                Ejer24 ejercicio24 = new Ejer24();
                ejercicio24.pedirDatos();
                break;
            
            case 25:
                Ejer25 ejercicio25 = new Ejer25();
                ejercicio25.pedirFrase();
                break;
            
            case 26:
                Ejer26 ejercicio26 = new Ejer26();
                ejercicio26.pedirCadena();
                break;
            
            case 27:
                Ejer27 ejercicio27 = new Ejer27();
                ejercicio27.pedirCadena();
                break;
            
            case 28:
                Ejer28 ejercicio28 = new Ejer28();
                ejercicio28.calcularSuma();
                break; 
            
            case 29:
                Ejer29 ejercicio29 = new Ejer29();
                ejercicio29.pedirArreglo();
                break;
            
            case 30:
                Ejer30 ejercicio30 = new Ejer30();
                ejercicio30.pedirArreglo();
                break;
            
            case 31:
                Ejer31 ejercicio31 = new Ejer31();
                ejercicio31.pedirArreglo();
                break;
            
            case 32:
                Ejer32 ejercicio32 = new Ejer32();
                ejercicio32.iniciar();
                break;
            
            case 33:
                Ejer33 ejercicio33 = new Ejer33();
                ejercicio33.iniciar();
                break;
            
            case 34:
                Ejer34 ejercicio34 = new Ejer34();
                ejercicio34.iniciar();
                break;
            
            case 35:
                Ejer35 ejercicio35 = new Ejer35();
                ejercicio35.iniciar();
                break;

            
            default:
                System.out.println("default");
                //sc.close();
        }
    }
}
