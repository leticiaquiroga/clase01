package ar.edu.unahur;

public class Ejercicio2 {

    public int[] compara() {
        int valor=10;
        int[] lista = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[] respuesta = new int[20];
        int aux = 0;
        for (int i = 0; i < lista.length; i++) {
            //System.out.println(lista[i]);
            if (lista[i]>valor){
                respuesta[aux] = lista[i];
                System.out.println(respuesta[aux]);
                aux = aux + 1;
            }
        }
        return respuesta;
    }
}