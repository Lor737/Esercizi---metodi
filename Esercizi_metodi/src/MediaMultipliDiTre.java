import java.util.Scanner;

public class MediaMultipliDiTre
{
    public static void main(String[] args)
    {
        String multipli_di_tre = "";
        int somma = 0, media = 0;  //come inserire più variabili in una riga
        int quantita_numeri_divis_per_tre = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Dimmi, quanti numeri vuoi inserire?");
        int tot_numeri = input.nextInt();
        System.out.println("Inserisci i " + tot_numeri +" numeri");

        for(int i=0; i<tot_numeri; i++)
        {
            System.out.println("Numero: " + (i+1));
            int numero = input.nextInt();

            if (numero%3 == 0)  //se il numero è divisibile per 3
            {
                multipli_di_tre = multipli_di_tre + numero + " ";
                somma = somma + numero;
                quantita_numeri_divis_per_tre += 1;
            }
        }
        media = somma/quantita_numeri_divis_per_tre;
        System.out.println("I numeri divisibili per 3 sono: " + multipli_di_tre);
        System.out.println("La loro media è: "+ media);
    }
}
