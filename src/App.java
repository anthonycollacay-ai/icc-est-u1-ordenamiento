import java.util.Arrays;
import java.util.Comparator;

import models.Estudiante;

public class App {
    public static void main(String[] args) throws Exception 
    {
        //runEjemplosPrimitivos();
        runEjemplosObjetos();  
        runComparators();
    }

    private static void runComparators()
    {
        int[] original = {5, 6, 4, 1, 2 ,3};
        
        //Arrays.sort() permite ordenar un arreglo de manera ascendente
        Arrays.sort(original);
        for(int i = 0; i < original.length; i++)
        {
            System.out.print(original[i] );
        }

        //con dos parametros es objetos
        //Original debe de ser un arreglo de objetos, no de primitivos
        //Arrays.sort(original, Comparator.reverseOrder());
    }

    private static void runEjemplosObjetos() 
    {
        Estudiante e1 = new Estudiante("Anthony", 10);

        Estudiante[] estudiantes = {e1, 
                new Estudiante("Maria", 7), 
                new Estudiante("Diego", 3.5), 
                new Estudiante("Pedro", 6.8)
        };

        Bubble bubble = new Bubble();
        System.out.println("Original: ");
        printArregloEstudiantes(estudiantes);
        bubble.sortEstudiantesNota(estudiantes);
        System.out.println("Ordenado por Notas: ");
        printArregloEstudiantes(estudiantes);
    }

    public static void runEjemplosPrimitivos()
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

        System.out.println("==== Selection Sort ====");
        Selection selection = new Selection();
        System.out.println("Original: "); 
        printArreglo(c);
        selection.sort(c);
        System.out.println("Ordenado Asc: " );
        printArreglo(c);

        System.out.println("======= Insertion Sort ======= ");
        InsertionSort insertion = new InsertionSort(); 
        System.out.println("Original: "); 
        printArreglo(d);
        insertion.sort(d);
        System.out.println("Ordenado Des: ");
        printArreglo(d);
    }

    public static void printArreglo(int[] arr) //un metodo static no es necesario de ser instanciado
    {
        for(int i = 0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" - ");
        }
        System.out.println();
    }

    public static void printArregloEstudiantes(Estudiante[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i].toString() + " - ");
        }
        System.out.println();
    }

}
