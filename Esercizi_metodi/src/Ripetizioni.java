import java.util.Scanner;

public class Ripetizioni
{
    public static void main(String[] args)
    {
        for(int i=0;i<5;i++)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Dimmi, quanti caratteri vuoi inserire?");
            int tot_caratteri = input.nextInt();
            System.out.println("Inserisci i " + tot_caratteri +" caratteri");

            for(int j=0; j<tot_caratteri; j++)
            {
                System.out.println("Carattere: " + (j+1));
                String carattere = input.nextLine();
                input.next();  //input a vuoto per permettere all'utente di inserire il primo input, altrimenti salta il primo input
                System.out.println(carattere);
            }
        }

    }
}
