public class Selection 
{
    public void sort(int[] arreglo)
    {
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
                if(arreglo[j] < arreglo[min])
                {
                    min = j;
                }
            }

            if(min != i)
            {
                cambios++;
                System.out.println("Pasada: " + pasadas + " | Cambio " + arreglo[i] + " <-> " + arreglo[min]);
                int temp = arreglo[i];
                arreglo[i] = arreglo[min];
                arreglo[min] = temp;
            }

        }

        System.out.println("Pasadas: " + pasadas);
        System.out.println("Cambios: " + cambios);
        System.out.println("Comparaciones: " + comparaciones);
        System.out.println("Ordenado Asc: " );
        
    }
}
