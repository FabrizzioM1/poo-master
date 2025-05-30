import java.io.*;
import java.util.*;

class Ingrediente {
    private String nombre;
    private String cantidad;

    public Ingrediente(String nombre, String cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String toString() {
        return nombre + " - " + cantidad;
    }
}

class Receta {
    private String nombre;
    private ArrayList<Ingrediente> ingredientes;
    private String instrucciones;

    public Receta(String nombre) {
        this.nombre = nombre;
        this.ingredientes = new ArrayList<>();
    }

    public void agregarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public String getNombre() {
        return nombre;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Receta: ").append(nombre).append("\nIngredientes:\n");
        for (Ingrediente ing : ingredientes) {
            sb.append("- ").append(ing).append("\n");
        }
        sb.append("Instrucciones: ").append(instrucciones).append("\n");
        return sb.toString();
    }
}

class Recetario {
    private static final String ARCHIVO = "recetas.txt";

    public static void guardarReceta(Receta receta) throws IOException {
        FileWriter fw = new FileWriter(ARCHIVO, true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(receta.getNombre());
        pw.println(receta.toString());
        pw.close();
    }

    public static void buscarReceta(String nombre) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(ARCHIVO));
        String linea;
        boolean encontrada = false;

        while ((linea = br.readLine()) != null) {
            if (linea.equals("###" + nombre)) {
                encontrada = true;
                System.out.println("Receta encontrada:");
                while ((linea = br.readLine()) != null && !linea.startsWith("###")) {
                    System.out.println(linea);
                }
                break;
            }
        }

        if (!encontrada) {
            System.out.println("Receta no encontrada.");
        }
        br.close();
    }

    public static void eliminarReceta(String nombre) throws IOException {
        File inputFile = new File(ARCHIVO);
        File tempFile = new File("temp.txt");

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        PrintWriter writer = new PrintWriter(new FileWriter(tempFile));

        String linea;
        boolean eliminar = false;

        while ((linea = reader.readLine()) != null) {
            if (linea.equals("###" + nombre)) {
                eliminar = true;
                continue;
            }
            if (eliminar && linea.startsWith("###")) {
                eliminar = false;
            }
            if (!eliminar) {
                writer.println(linea);
            }
        }

        writer.close();
        reader.close();

        inputFile.delete();
        tempFile.renameTo(inputFile);
        System.out.println("Receta eliminada si existía.");
    }
}

public class MainRecetario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n MENÚ DE RECETAS ");
            System.out.println("1. Crear receta");
            System.out.println("2. Buscar receta");
            System.out.println("3. Eliminar receta");
            System.out.print("Seleccione una opción: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    crearReceta(sc);
                    break;
                case 2:
                    buscarReceta(sc);
                    break;
                case 3:
                    eliminarReceta(sc);
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);

        sc.close();
    }

    private static void crearReceta(Scanner sc) {
        try {
            System.out.print("Nombre de la receta: ");
            String nombre = sc.nextLine();
            Receta receta = new Receta(nombre);

            String respuesta;
            do {
                System.out.print("Nombre del ingrediente: ");
                String ing = sc.nextLine();
                System.out.print("Cantidad: ");
                String cant = sc.nextLine();
                receta.agregarIngrediente(new Ingrediente(ing, cant));

                System.out.print("¿Agregar otro ingrediente? (s/n): ");
                respuesta = sc.nextLine();
            } while (respuesta.equalsIgnoreCase("s"));

            System.out.print("Instrucciones: ");
            receta.setInstrucciones(sc.nextLine());

            Recetario.guardarReceta(receta);
            System.out.println("Receta guardada correctamente.");
        } catch (Exception e) {
            System.out.println("Error al guardar la receta: " + e.getMessage());
        }
    }

    private static void buscarReceta(Scanner sc) {
        try {
            System.out.print("Nombre de la receta a buscar: ");
            String nombre = sc.nextLine();
            Recetario.buscarReceta(nombre);
        } catch (Exception e) {
            System.out.println("Error al buscar la receta: " + e.getMessage());
        }
    }

    private static void eliminarReceta(Scanner sc) {
        try {
            System.out.print("Nombre de la receta a eliminar: ");
            String nombre = sc.nextLine();
            Recetario.eliminarReceta(nombre);
        } catch (Exception e) {
            System.out.println("Error al eliminar la receta: " + e.getMessage());
        }
    }
}

