import java.util.Scanner;

public class Stampa_elementi_positivi
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

    public static int[] arraySoloNumPositivi(int[] array)
    {
        int numeri_positivi = 0;
        for(int i=0, j=0;i< array.length;i++)
        {
            if (array[i] >= 0)
            {
                numeri_positivi += 1;
            }
        }
        int[] array2 = new int[numeri_positivi];
        for(int i=0, j=0;i< array.length && j<numeri_positivi;i++)
        {
            if (array[i] >= 0)
            {
                array2[j] = array[i];
                j++;
            }
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
    public static void stampaArraysuRiga(int[] array)
    {
        String array_su_riga = "";
        for (int i=0;i< array.length;i++)
        {
            array_su_riga = array_su_riga + array[i] + " ";
        }
        System.out.println(array_su_riga);
    }
    public static void main(String[] args)
    {
        int[] array = inserisciArray();
        int[] array_num_pos = arraySoloNumPositivi(array);
        stampaArray(array_num_pos);
        //stampaArraysuRiga(array_num_pos);
    }
}
