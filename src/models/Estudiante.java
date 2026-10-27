package models;

public class Estudiante 
{
    private String name;
    private double nota;
    

    //el constructor con atributos permite crear un objeto de la clase Estudiante con valores iniciales
    public Estudiante(String name, double nota) 
    {
        this.name = name;
        this.nota = nota;
    }

    //los getters permiten obtener el valor de los atributos de la clase
    //los setters permiten modificar el valor de los atributos de la clase

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Estudiante [" + name + " | " + nota + "]";
    }

}
