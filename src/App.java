public class App {
    public static void main(String[] args) throws Exception 
    {
        int[] original = {5, 6, 4, 1, 2 ,3};
        int[] b = original.clone();
        int[] c = original.clone();
        int[] d = original.clone();

        //usar el metodo de archivo (clase) BUBBLE
        //Instanciar el archivo bubble

        Bubble bubble = new Bubble(); //la instancia solo es new ....
        //Ejecutar codigo del archivo bubble uso la instancia

        printArreglo(b);
        bubble.sort(b);
        printArreglo(b);

        System.out.println("Selection Sort: ");
        Selection selection = new Selection();
        printArreglo(c);
        selection.sort(c);
        printArreglo(c);

        System.out.println("======= Insertion Sort ======= ");
        InsertionSort insertion = new InsertionSort(); 
        System.out.println("Original: "); 
        printArreglo(d);
        insertion.sort(d);
        System.out.println("Ordenado Des: ");
        printArreglo(d);
    }

    public static void printArreglo(int[] arr) //un metodo void no es necesario de ser instanciado
    {
        for(int i = 0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" - ");
        }
        System.out.println();
    }
}
