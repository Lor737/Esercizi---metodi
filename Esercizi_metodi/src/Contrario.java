import java.util.Scanner;

public class Contrario
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Scrivi la parola o la frase");
        String stringa = input.nextLine();
        String stringa_al_contrario = "";
        String[] lettera = new String[stringa.length()];

        for(int i=0; i<stringa.length(); i++)
        {
            lettera[i] = stringa.substring((stringa.length()-1)-i,((stringa.length()-1)-(i-1)));
            stringa_al_contrario = stringa_al_contrario + lettera[i];
        }
        System.out.println(stringa_al_contrario);
    }
}

/*
            Se i = 0 e stringa.length() = 4
            lettera[i] = stringa.substring((stringa.length()-1)-i,((stringa.length()-1)-(i-1)));
            lettera[0] = stringa.substring((4-1)-0,((4-1)-(0-1)));
            lettera[0] = stringa.substring(3-0,(3-(0-1)));
            lettera[0] = stringa.substring(3,(3+1));
            lettera[0] = stringa.substring(3,4);

            Se i = 1 e stringa.length() = 4
            lettera[i] = stringa.substring((stringa.length()-1)-i,((stringa.length()-1)-(i-1)));
            lettera[1] = stringa.substring((4-1)-1,((4-1)-(1-1)));
            lettera[1] = stringa.substring(3-1,(3-(1-1)));
            lettera[1] = stringa.substring(2,(3-0));
            lettera[1] = stringa.substring(2,3);

            Se i = 2 e stringa.length() = 4
            lettera[i] = stringa.substring((stringa.length()-1)-i,((stringa.length()-1)-(i-1)));
            lettera[2] = stringa.substring((4-1)-2,((4-1)-(2-1)));
            lettera[2] = stringa.substring(3-2,(3-(2-1)));
            lettera[2] = stringa.substring(1,(3-1));
            lettera[2] = stringa.substring(1,2);

            Se i = 3 e stringa.length() = 4
            lettera[i] = stringa.substring((stringa.length()-1)-i,((stringa.length()-1)-(i-1)));
            lettera[3] = stringa.substring((4-1)-3,((4-1)-(3-1)));
            lettera[3] = stringa.substring(3-3,(3-(3-1)));
            lettera[3] = stringa.substring(0,(3-2));
            lettera[3] = stringa.substring(0,1);

 */
