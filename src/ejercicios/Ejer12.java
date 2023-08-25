package ejercicios;

public class Ejer12 {
    int numero;
    
    public Ejer12(){
        Ejer2 objetoInterno12 = new Ejer2();
        numero = objetoInterno12.numero1;
        //numero = Ejer2.pedir_1_numero();
    }

    public boolean esPrimo(int num) {
        
        if(num <= 1){
            return false;
        }
        if(num <=3){
            return true;
        }
        if(num % 2 == 0 || num % 3 == 0){
            return false;
        }

        for(int i = 5; i*i <=num; i+=6){
            if(num % i == 0 || num % (i+2) == 0){
                return false;
            }
        }
        return true;
    }

    public void imprimir(){
        if(esPrimo(numero)){
            System.out.println(numero + " es primo.");
        }else{
            System.out.println(numero+" no es primo.");
        }
    }
}
