public class Selection 
{
    public void sort(int[] arreglo)
    {
        //creamos los contadores de cambios, pasadas y comparaciones
        int cambios = 0;
        int pasadas = 0;
        int comparaciones = 0;

        for(int i = 0; i < arreglo.length - 1; i++)
        {
            pasadas++;
            int min = i;

            for(int j = i + 1; j < arreglo.length; j++)
            {
                comparaciones++;

                // Comparar el elemento actual con el mínimo encontrado hasta ahora
                if(arreglo[j] < arreglo[min])
                {
                    min = j;
                }
            }

            // Intercambiar el elemento mínimo encontrado con el primer elemento no ordenado
            if(min != i)
            {
                cambios++;

                //mostramos las comparaciones y los cambios realizados en cada pasada
                System.out.println("Pasada: " + pasadas + " | Cambio " + arreglo[i] + " <-> " + arreglo[min]);
                int temp = arreglo[i];
                arreglo[i] = arreglo[min];
                arreglo[min] = temp;
            }

        }

        //Mostramios el total de pasadas, cambios y comparaciones realizadas
        System.out.println("Pasadas: " + pasadas);
        System.out.println("Cambios: " + cambios);
        System.out.println("Comparaciones: " + comparaciones);
        System.out.println("Ordenado Asc: " );
        
    }
}
