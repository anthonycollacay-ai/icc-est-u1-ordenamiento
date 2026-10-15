public class App {
    public static void main(String[] args) throws Exception 
    {
        int[] original = {5, 3, 4, 1, 2};
        int[] b = original.clone();
        int[] c = original;

        //usar el metodo de archivo (clase) BUBBLE
        //Instanciar el archivo bubble

        Bubble bubble = new Bubble(); //la instancia solo es new ....
        //Ejecutar codigo del archivo bubble uso la instancia

        printArreglo(b);
        bubble.sort(b);
        printArreglo(b);
    }

    public static void printArreglo(int[] arr)
    {
        for(int i = 0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" - ");
        }
        System.out.println();
    }
}
