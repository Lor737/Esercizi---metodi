import java.util.Scanner;

public class Spazi_vocali
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String[] vocali = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
        System.out.println("Scrivi la frase");
        String stringa = input.nextLine();
        String[] prima_lettera = new String[stringa.length()];
        String[] seconda_lettera = new String[stringa.length()-1]; //la dimensione della seconda array deve essere inferiore a 1rispetto alla prima
        int spazi = 0;

        for(int i=0, j=0; i<stringa.length() && j<(stringa.length()-1); i++,j++)  //j viaggia tra 0 e il massimo-1 rispetto alla i
        {
            prima_lettera[i] = stringa.substring(i,(i+1));      //legge tutta la stringa, parte a leggere dal 1°carattere fino alla fine
            seconda_lettera[j] = stringa.substring(j+1,(j+2));  //legge tutta la stringa, parte a leggere dal 2°carattere fino alla fine
            for (int k=0;k< vocali.length;k++)  //ciclo for per fare il confronto con tutte le vocali
            {
                if (prima_lettera[i].equals(" ") && (seconda_lettera[j].equals(vocali[k])))
                {
                    spazi += 1;
                }
            }

        }
        System.out.println("Le vocali successive ad uno spazio vuoto sono: " + spazi);
    }
}
