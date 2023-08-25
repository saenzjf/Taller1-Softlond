package ejercicios;

public class Ejer7 {
    int numero, resultado;
    
    public Ejer7() {
        Ejer2 objetoInterno7 = new Ejer2();
        numero = objetoInterno7.numero1;
    }

    public void tablaMultiplicar(){
        System.out.println("TABLA DEL "+ numero);
        for(int i = 0; i <= 10; i++){
            resultado = numero * i;
            System.out.println(i+" X "+numero+" = "+resultado);
        }
    }
}
