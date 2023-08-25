package ejercicios;

public class Ejer5 {
    int numeroA, numeroB;
    
    public Ejer5(){
        Ejer1 objetoInterno5 = new Ejer1();
        numeroA = objetoInterno5.numero1;
        numeroB = objetoInterno5.numero2;
    }

    public void mayor(){
        if(numeroA > numeroB){
            System.out.println("El número mayor es: "+ numeroA);
        }else{
            System.out.println("El número mayor es: "+ numeroB);
        }
    }
}
