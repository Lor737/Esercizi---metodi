import java.util.Scanner;

public class Somma_interi
{
    public static int somma(int[] val)
    {
        int tot = 0;
        for(int i =0;i< val.length; i++)
        {
            tot += val[i];
        }
        return tot;
    }
    public static void main(String[] args)
    {
        int[] array = {4,7,75,23,-4,29};
        System.out.println(somma(array));
    }
}