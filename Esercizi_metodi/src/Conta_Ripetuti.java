public class Conta_Ripetuti
{
    public static int contaRipetuti(int[] array, int numero)
    {
        int occorenze = 0;
        for(int i =0;i< array.length; i++)
        {
            if (array[i] == numero)
            {
                occorenze += 1;
            }
        }
        return occorenze;
    }
    public static void main(String[] args)
    {
        int[] numeri = {1, 3, 6, 3, 9, 10};
        int numero = 3;
        System.out.println("Le occorrenze sono: " + contaRipetuti(numeri, numero));
    }
}
