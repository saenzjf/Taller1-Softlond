package ejercicios;

public class Ejer3 {
    int radio;
    double resultado;

    public Ejer3() {
        Ejer2 objetoInterno3 = new Ejer2();
        radio = objetoInterno3.numero1;
    }

    public void area(){
        //A = pi*r^2
        resultado = Math.PI * Math.pow(radio, 2);
        System.out.println("El area del circulo de radio "+radio+" es de: "+resultado);
    }

    public void perimetro(){
            //P = 2*pi*r
            resultado = 2 * Math.PI * radio;
            System.out.println("El perimetro del circulo de radio "+radio+" es de: "+resultado);
        }
}
