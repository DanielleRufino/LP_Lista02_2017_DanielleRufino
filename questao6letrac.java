package ordena;

public class Ordena {

    public static void main (String args []){
         int elementos[] = {9,6,2,7,3};
         ordem(elementos);
         System.out.println("Numeros Ordenados: ");
         for (int numero : elementos){
        	 System.out.println(numero);
         }
     }
    public static void ordem(int elementos[]){
        int contA, contB,aux;
        for(contA =0; contA<5; contA++){
            for(contB =0; contB <4; contB++){
                if(elementos[contB]> elementos[contB+1]){
                    aux = elementos[contB];
                    elementos[contB] = elementos[contB+1];
                    elementos[contB+1] = aux;
                }
            }
        }
    }
}
