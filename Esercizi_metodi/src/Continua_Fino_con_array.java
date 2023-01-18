import java.util.Scanner;

public class Continua_Fino_con_array
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numero = 0, somma = 0;
        int max_numeri = 0;
        String stringa_numeri = "";
        //int[] array = {};
        do {
            System.out.println("Scrivi il numero");
            numero = input.nextInt();
            if ((numero < 0) && (numero%2 == 0) || (numero > 0) && (numero%3 == 0))
            {
                max_numeri+=1;
                int[] array = new int[max_numeri];
                array[max_numeri-1] = numero;
                somma = somma + numero;
            }
        }while((numero < 0) && (numero%2 == 0) || (numero > 0) && (numero%3 == 0));
        System.out.println("La somma di tutti i numeri escluso l'ultimo inserito è: " + somma);
    }
}
