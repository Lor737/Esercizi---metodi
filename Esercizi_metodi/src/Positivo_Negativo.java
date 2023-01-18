import java.util.Scanner;

public class Positivo_Negativo
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numero;
        int negativo = 0;
        int segnala_positivo = 0;

            do {
                System.out.println("Scrivi il numero");
                numero = input.nextInt();
                if (numero >0)
                {
                   segnala_positivo = 1;
                }
                if (numero <0 && segnala_positivo == 1)
                {
                    negativo = 1;
                }
            }while(numero != 0);
        if (negativo == 1)
        {
            System.out.println("SI");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
//prima numero positivo
//dopo numero negativo