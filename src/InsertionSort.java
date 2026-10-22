public class InsertionSort 
{
    public void sort(int[] arreglo)
    {
        

        for(int i = 1; i < arreglo.length; i++)
        {
            //creamos un auxiliar para guardar el valor del elemento actual 
            // y una variable j para recorrer los elementos anteriores
            int aux = arreglo[i];
            int j = i - 1;

            //Modificamos el bucle while para que ordene de mayor a menor
            //Cambiamos el operadoe de comparacion de > a <
            while(j >= 0 && arreglo[j] < aux)
            {
                //desplazamos el elemento mayor hacia la derecha
                arreglo[j + 1] = arreglo[j];
                j--;
                
            }

            //colocamos el elemento actual en su posición correcta
            arreglo[j + 1] = aux;

            // Agregamos un mensaje para indicar en qué posición se insertó el elemento actual
            if(j + 1 != i)
            {
                System.out.println("El aux = " + aux + " se inserta en la posición " + (j + 1));
            }
        }

    }
    
}
