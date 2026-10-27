import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
//import java.util.Comparator;
import java.util.List;

import models.Estudiante;

public class App {
    public static void main(String[] args) throws Exception 
    {
        //runEjemplosPrimitivos();
        runEjemplosObjetos();  
        runComparators();
        runComparatorsObj();
        runComparatorsObj2();
    }

    private static void runComparatorsObj2()
    {
        Estudiante e1 = new Estudiante("Anthony", 10);

        Estudiante[] estudiantes = {e1, 
                new Estudiante("Maria", 7), 
                new Estudiante("Diego", 3.5), 
                new Estudiante("Pedro", 6.8)
        };

        //e es el nombre de la variable, la -> e.getNota() es la funcion que se ejecuta para obtener el valor de la nota del estudiante
        Comparator<Estudiante> compNota = Comparator.comparingDouble(e -> e.getNota());
        Arrays.sort(estudiantes, compNota);

        //llamamos al metodo printArregloEstudiantes para imprimir el arreglo de estudiantes ordenado por nota
        printArregloEstudiantes(estudiantes);

        List<Estudiante> estudiantesLista = new ArrayList<>(List.of(estudiantes));

        //ordenar por la nota

        //al seer lista utilizamos el metodo sort de la clase List, que recibe el comparador como parametro
        estudiantesLista.sort(compNota);
        System.out.println(estudiantesLista);
    }

    private static void runComparatorsObj()
    {
        List<Integer> numeros = new ArrayList<>(List.of(5,6,4,1,2,3));
        
        //orden de menor a mayor
        //numeros.sort(Comparator.naturalOrder());
        numeros.sort(null);
        System.out.println(numeros);

        //Orden de mayor a menor

        numeros.sort(Comparator.reverseOrder());
        System.out.println(numeros);
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
        //Arrays.sort(original, Comparator.reversePOrder());
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
