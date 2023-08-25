package ejercicios;

public class Ejer11 {
    int numero;

    public void fibonacci(){
        int a=0;
        int b=1;
        int c=1;
        
        for(int i=1; i<=20; i++){
            System.out.print(" "+c);
            c = a + b;
            a = b;
            b = c;
        }

    }
}
