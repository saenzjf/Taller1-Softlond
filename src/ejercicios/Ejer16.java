package ejercicios;

public class Ejer16 {
    
    int numero;

    public Ejer16() {
        Ejer2 objetoInterno16 = new Ejer2();
        numero = objetoInterno16.numero1;
    }

    public void fibonacci(){
        int a=0;
        int b=1;
        int c=1;
        
        for(int i=1; i<=numero; i++){
            System.out.print(" "+c);
            c = a + b;
            a = b;
            b = c;
        }

    }


}
