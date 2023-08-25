package ejercicios;

public class Ejer14 {
    int suma;
    int numero;


    public Ejer14() {
        Ejer2 objetoInterno14 = new Ejer2();
        numero = objetoInterno14.numero1;
    }

    public int calcularSumaDivisores(int numero){
        suma = 0;
        
        for(int i = 1; i <= numero/2; i++){
            if(numero % i == 0){
                suma += i;
            }
        }
        return suma;
    }

    public boolean esNumeroPerfecto(int numero){
        int sumaDivisores = calcularSumaDivisores(numero);
        return numero == sumaDivisores;
    }

    public void mostrarResultado(){
        if(esNumeroPerfecto(numero)){
            System.out.println(numero + " es un numero perfecto");
        }else{
            System.out.println(numero + " no es un numero perfecto");
        }
    }
}
