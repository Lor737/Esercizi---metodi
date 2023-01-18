import java.util.Scanner;

public class Parola_in_un_testo
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Scrivi la parola o la frase");
        String stringa = input.nextLine();
        if (stringa.length()>0)
        {
            System.out.println("Ci sono delle parole");
        }
    }
}
//??????? sarà giusto?