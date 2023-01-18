import java.util.Scanner;

public class Stampa_inverso_senza_metodo
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci i 10 numeri");
        int[] array = new int[10];

        for(int i=0; i<10; i++)
        {
            System.out.println("Numero " + (i+1));
            int numero = input.nextInt();
            array[i] = numero;
        }
        for(int i=0; i<10; i++)
        {
            System.out.println(array[9-i]);
        }
    }
}
