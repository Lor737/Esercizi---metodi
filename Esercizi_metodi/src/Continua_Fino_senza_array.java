import java.util.Scanner;

public class Continua_Fino_senza_array
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numero = 0, somma = 0;

        do {
            System.out.println("Scrivi il numero");
            numero = input.nextInt();
            if ((numero < 0) && (numero%2 == 0) || (numero > 0) && (numero%3 == 0))
            {
                somma = somma + numero;
            }
        }while((numero < 0) && (numero%2 == 0) || (numero > 0) && (numero%3 == 0));
        System.out.println("La somma di tutti i numeri escluso l'ultimo inserito è: " + somma);
    }
}
