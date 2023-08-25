package ejercicios;

public class Ejer15 {
    int numero;
    
    public Ejer15() {
        Ejer2 objetoInterno15 = new Ejer2();
        numero = objetoInterno15.numero1;
    }

    public boolean esCapicua(int numero){
        
        int numeroOriginal = numero;
        int numeroReverso = 0;

        while(numero > 0){
            int digito = numero % 10;
            numeroReverso = numeroReverso * 10 + digito;
            numero = numero / 10;
            System.out.println(numero);
        }

        return numeroReverso == numeroOriginal;
    }

    public void mostrarResultado(){
        if(esCapicua(numero)){
            System.out.println(numero+" es Capicua");
        }else{
            System.out.println(numero+" no es Capicua");
        }
    }
}
