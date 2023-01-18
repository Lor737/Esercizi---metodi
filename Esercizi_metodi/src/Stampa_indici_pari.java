import java.util.Scanner;

public class Stampa_indici_pari
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

    public static int[] arraySoloindiciPari(int[] array)
    {
        int indici_pari = 0;
        for (int i=0;i< array.length;i++)
        {
            if(i%2 == 0)
            {
                indici_pari += 1;
            }
        }

        int[] array2 = new int[indici_pari];
        for(int i=0;i< indici_pari;i++)
        {
                array2[i] = array[2*i];
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
        int[] array_indici_pari = arraySoloindiciPari(array);
        stampaArray(array_indici_pari);
    }
}
