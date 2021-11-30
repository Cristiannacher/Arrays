import java.util.Scanner;

public class ParesImpares {

    public static void rellenaArray(int[] array, int min, int max) {
        for (int i = 0; i < array.length; i++) {
            int aleatorio = (int) (Math.random() * (max - min + 1) + min);
            array[i] = aleatorio;
        }
    }

    public static void cuentaParesImpares (int[] numeros){
        int pares = 0;
        int impares = 0;

        for(int i = 0; i< numeros.length; i++){
            if(numeros[i]%2 == 0){
                pares ++;
            } else impares ++;
        }
        System.out.println("Hay "+pares+" pares");
        System.out.println("Hay "+impares+" impares");
    }
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Elige la largaria de la lista");
        int largo = reader.nextInt();

        int[] numeros = new int[largo];
        rellenaArray(numeros,1,10);

        System.out.println("Lista a comprovar");
        for(int i = 0; i<numeros.length; i++){
            System.out.print(numeros[i]+" ");
        }
        System.out.println(" ");

        cuentaParesImpares(numeros);
    }
}
