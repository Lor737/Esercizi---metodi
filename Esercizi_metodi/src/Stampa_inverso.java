import java.util.Scanner;

public class Stampa_inverso
{
    public static int[] inserisciArray()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Dimmi, quanti numeri vuoi inserire?");
        int tot_numeri = input.nextInt();
        System.out.println("Inserisci i " + tot_numeri +" numeri");
        int[] array = new int[tot_numeri];

        for(int i=0; i<tot_numeri; i++)
        {
            System.out.println("Numero: " + (i+1));
            int numero = input.nextInt();
            array[i] = numero;
        }
        return array;
    }

    public static int[] invertiArray(int[] array)
    {
        int[] array2 = new int[array.length];
        for(int i=0;i< array.length;i++)
        {
            array2[i] = array[(array.length-1)-i];
        }
        return array2;
    }
    public static void stampaArray(int[] array)
    {
        for(int i=0;i< array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args)
    {
        int[] array = inserisciArray();
        int[] array_inversa = invertiArray(array);
        stampaArray(array_inversa);
    }
}
