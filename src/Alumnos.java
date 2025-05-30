import java.io.Serializable;

public class Alumnos implements Serializable {
    private String nombre;
    private String apellido;
    private String semestre;

    public Alumnos(String nombre, String apellido, String semestre) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.semestre = semestre;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getSemestre() {
        return semestre;
    }

    public String toString() {
        return nombre + " " + apellido + " " + semestre;
    }
}
