package ejercicios;

public class Ejer28 {
    
    int[] numeros = {17,2,64,8};

    public void calcularSuma(){
        
        int suma=0;
        for(int i=0;i<numeros.length;i++){
            suma = suma + numeros[i];
        }

        System.out.println("La suma es: "+suma);
    }
}
