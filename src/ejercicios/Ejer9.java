package ejercicios;

public class Ejer9 {
    
    int numeroUsuario;
    int factorial = 1;

    public Ejer9(){
        Ejer2 objetoInterno9 = new Ejer2();
        numeroUsuario = objetoInterno9.numero1;
    }

    public void factorial(){
        for(int i=1; i<=numeroUsuario; i++){
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
