package ejercicios;

import java.security.SecureRandom;

public class Ejer18 {
    int indice;
    char caracterAleatorio;

    String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    SecureRandom random = new SecureRandom();
    StringBuilder sb = new StringBuilder(8);

    public String generarContraseña(){

        for(int i=0; i<8; i++){
            indice = random.nextInt(caracteres.length());
            caracterAleatorio = caracteres.charAt(indice);

            sb.append(caracterAleatorio);
        }
        System.out.println(sb);
        return sb.toString();
    }
}
