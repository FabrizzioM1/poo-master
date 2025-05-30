import java.util.ArrayList;
import java.util.Scanner;

public class Clase_POO {

    class Alumno {
        private String nombre;
        private int numControl;

        public Alumno(String nombre, int numControl) {
            this.nombre = nombre;
            this.numControl = numControl;
        }

        public String getNombre() {
            return nombre;
        }

        public int getNumControl() {
            return numControl;
        }
    }

    class Asistencia {
        private Alumno alumno;
        private boolean presente;

        public Asistencia(Alumno alumno, boolean presente) {
            this.alumno = alumno;
            this.presente = presente;
        }

        public Alumno getAlumno() {
            return alumno;
        }

        public boolean isPresente() {
            return presente;
        }
    }

    class ListaAsistencia {
        private ArrayList<Asistencia> asistencias;

        public ListaAsistencia() {
            asistencias = new ArrayList<>();
        }

        public void registrarAsistencia(Alumno alumno, boolean presente) {
            Asistencia ast = new Asistencia(alumno, presente);
            asistencias.add(ast);
        }

        public void mostrarAsistencias() {
            System.out.println("Clase POO (8-9):");
            for (Asistencia asistencia : asistencias) {
                String vino = asistencia.isPresente() ? "Presente" : "Ausente";
                System.out.println("serializacion.Alumno: " + asistencia.getAlumno().getNombre() +": " + vino);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Clase_POO clase = new Clase_POO();
        ListaAsistencia listaAsistencia = clase.new ListaAsistencia();

        Alumno a1 = clase.new Alumno("Fabrizzio Murillo", 24020266);
        Alumno a2 = clase.new Alumno("Samuel Reyes", 24020345);
        Alumno a3 = clase.new Alumno("Leonardo García", 24020289);
        Alumno a4 = clase.new Alumno("Javier Guerrero", 24020356);

        listaAsistencia.registrarAsistencia(a1, true);
        listaAsistencia.registrarAsistencia(a2, false);
        listaAsistencia.registrarAsistencia(a3, true);
        listaAsistencia.registrarAsistencia(a4, true);


        listaAsistencia.mostrarAsistencias();
        scanner.close();
    }
}

/*
Crear un programa en POO que contenga las clases serializacion.Alumno, Asistencia,
ListaAsistencia. Haga que interactuen para registrar la asistencia de
un grupo.
 */