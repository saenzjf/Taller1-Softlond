package ejercicios;

public class Ejer17 {
    
    int inicio, fin;

    public Ejer17() {
        Ejer1 objetoInterno17 = new Ejer1();
        inicio = objetoInterno17.numero1;
        fin = objetoInterno17.numero2;
    }

    public boolean esPrimo(int numero) {
        if(numero <=1){
            return false;
        }

        for(int i = 2; i < Math.sqrt(numero); i++) {
            if(numero % i == 0){
                return false;
            }
        }
        return true;
    }

    public void imprimirPrimos() {
        for(int i = inicio; i <= fin; i++) {
            if(esPrimo(i)){
                System.out.print(i+" ");
            }
        }
    }
}
