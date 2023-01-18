public class Cerca_Elemento
{
    public static boolean cercaElemento(int[] array, int numero)
    {
        //entri nel ciclo for
        for(int i =0;i< array.length; i++)
        {
            //se il numero array[i] è uguale a numero, allora mi fai return true
            //altrimenti return false
            if (array[i] == numero)
            {
                System.out.println("Il numero è stato trovato :)");
                return true;
            }
        }
        System.out.println("Il numero non è stato trovato :(");
        return false;
    }

    public static void main(String[] args)
    {
        int[] array = {2, 8 , 9, -3};
        int numero = 8;
        System.out.println(cercaElemento(array, numero));
    }
}
