import models.Estudiante;

public class Bubble {

    public void sort(int[] arreglo)
    {
        int cambios = 0;
        int comparaciones = 0;

        for(int i = 0;i<arreglo.length-1; i++)
        {
            System.out.println("Pasada: "+i);
            boolean combinaciones = false;

            for(int j = 1;j < arreglo.length-i; j++)
            {   
                comparaciones++;
                //comparacion
                if(arreglo[j-1]>arreglo[j])
                {
                    //INTERCAMBIO
                    cambios++;
                    combinaciones = true;
                    int aux = arreglo[j-1];
                    arreglo[j-1] = arreglo[j];
                    arreglo[j] = aux;
                    
                }
            }
        
            if(!combinaciones)
            {
                break;
            }

            System.out.println("Cambios: " + cambios);
            System.out.println("Comparaciones: " + comparaciones);
            
        }
        System.out.println("Comparaciones: " + cambios);
        System.out.println("Intercambios: " + comparaciones);
        //return arreglo;
    }

    public void sortEstudiantesNota(Estudiante[] estudiantes)
    {
        int cambios = 0;
        int comparaciones = 0;

        for(int i = 0;i<estudiantes.length-1; i++)
        {
            //System.out.println("Pasada: "+i);
            boolean combinaciones = false;

            for(int j = 1;j < estudiantes.length-i; j++)
            {   
                comparaciones++;
                //comparacion
                //usamos el metodo getNota() para obtener la nota del estudiante y compararlas
                //get sirve para obtener el valor de un atributo privado de una clase
                if(estudiantes[j-1].getNota()>estudiantes[j].getNota())
                {
                    //INTERCAMBIO
                    cambios++;
                    combinaciones = true;
                    Estudiante aux = estudiantes[j-1];
                    estudiantes[j-1] = estudiantes[j];
                    estudiantes[j] = aux;
                    
                }
            }
        
            if(!combinaciones)
            {
                break;
            }

            /*System.out.println("Cambios: " + cambios);
            System.out.println("Comparaciones: " + comparaciones);*/
            
        }
        /*System.out.println("Comparaciones: " + cambios);
        System.out.println("Intercambios: " + comparaciones);
        return arreglo;*/
    }

    public void sortEstudiantesName(Estudiante[] estudiantes)
    {
        for(int i = 0;i<estudiantes.length-1; i++)
        {
            boolean combinaciones = false;

            for(int j = 1;j < estudiantes.length-i; j++)
            {   
                //comparacion
                //usamos el metodo getName() para obtener el nombre del estudiante y compararlos
                //get sirve para obtener el valor de un atributo privado de una clase
                if(estudiantes[j-1].getName().compareTo(estudiantes[j].getName()) > 0)
                {
                    //INTERCAMBIO
                    combinaciones = true;
                    Estudiante aux = estudiantes[j-1];
                    estudiantes[j-1] = estudiantes[j];
                    estudiantes[j] = aux;
                    
                }
            }
        
            if(!combinaciones)
            {
                break;
            }
            
        }
    }
}
