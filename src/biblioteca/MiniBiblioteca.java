package biblioteca;

import java.util.ArrayList;
import java.util.Scanner;


    class Libro {
        private String titulo;
        private String autor;
        private String idLibro;
        private boolean disponible;

        public Libro(String titulo, String autor, String idLibro) {
            this.titulo = titulo;
            this.autor = autor;
            this.idLibro = idLibro;
            this.disponible = true;
        }

        public String getIdLibro() {
            return idLibro;
        }

        public boolean isDisponible() {
            return disponible;
        }

        public void prestar() {
            disponible = false;
        }

        public void devolver() {
            disponible = true;
        }

        @Override
        public String toString() {
            return titulo + " |  Autor: " + autor + " | ID: " + idLibro + " | " +
                    (disponible ? "Disponible " : "Prestado ");
        }
    }

    class Usuario {
        private String nombre;
        private String idUsuario;
        private ArrayList<Libro> librosPrestados;

        public Usuario(String nombre, String idUsuario) {
            this.nombre = nombre;
            this.idUsuario = idUsuario;
            this.librosPrestados = new ArrayList<>();
        }

        public String getIdUsuario() {
            return idUsuario;
        }

        public void prestarLibro(String idLibro, Biblioteca biblioteca) {
            Libro libro = biblioteca.buscarLibro(idLibro);
            if (libro != null && libro.isDisponible()) {
                librosPrestados.add(libro);
                libro.prestar();
                System.out.println(nombre + " ha prestado: " + libro);
            } else {
                System.out.println("No se pudo prestar el libro. Puede que no esté disponible.");
            }
        }

        public void devolverLibro(String idLibro, Biblioteca biblioteca) {
            for (Libro libro : librosPrestados) {
                if (libro.getIdLibro().equals(idLibro)) {
                    librosPrestados.remove(libro);
                    libro.devolver();
                    System.out.println(nombre + " ha devuelto: " + libro);
                    return;
                }
            }
            System.out.println("El usuario no tiene este libro prestado.");
        }

        @Override
        public String toString() {
            return " Usuario: " + nombre + " | ID: " + idUsuario + " | Libros prestados: " + librosPrestados;
        }
    }

    class Biblioteca {
        private ArrayList<Usuario> usuarios;
        private ArrayList<Libro> libros;

        public Biblioteca() {
            this.usuarios = new ArrayList<>();
            this.libros = new ArrayList<>();
        }

        public void registrarUsuario(String nombre, String idUsuario) {
            if (buscarUsuario(idUsuario) == null) {
                usuarios.add(new Usuario(nombre, idUsuario));
                System.out.println("Usuario registrado: " + nombre + " (ID: " + idUsuario + ")");
            } else {
                System.out.println("El usuario ya está registrado.");
            }
        }

        public void agregarLibro(String titulo, String autor, String idLibro) {
            if (buscarLibro(idLibro) == null) {
                libros.add(new Libro(titulo, autor, idLibro));
                System.out.println("Libro agregado: " + titulo + " (ID: " + idLibro + ")");
            } else {
                System.out.println("El libro ya está registrado.");
            }
        }

        public void prestarLibro(String idUsuario, String idLibro) {
            Usuario usuario = buscarUsuario(idUsuario);
            if (usuario != null) {
                usuario.prestarLibro(idLibro, this);
            } else {
                System.out.println("Usuario no encontrado.");
            }
        }

        public void devolverLibro(String idUsuario, String idLibro) {
            Usuario usuario = buscarUsuario(idUsuario);
            if (usuario != null) {
                usuario.devolverLibro(idLibro, this);
            } else {
                System.out.println("Usuario no encontrado.");
            }
        }

        public Usuario buscarUsuario(String idUsuario) {
            for (Usuario usuario : usuarios) {
                if (usuario.getIdUsuario().equals(idUsuario)) {
                    return usuario;
                }
            }
            return null;
        }

        public Libro buscarLibro(String idLibro) {
            for (Libro libro : libros) {
                if (libro.getIdLibro().equals(idLibro)) {
                    return libro;
                }
            }
            return null;
        }

        public void mostrarEstadoBiblioteca() {
            System.out.println("\n Estado de la Biblioteca:");
            System.out.println("\n Usuarios Registrados:");
            for (Usuario usuario : usuarios) {
                System.out.println(usuario);
            }

            System.out.println("\n Libros en Biblioteca:");
            for (Libro libro : libros) {
                System.out.println(libro);
            }
        }
    }

    public class MiniBiblioteca {
        public static void main(String[] args) {
            Biblioteca biblioteca = new Biblioteca();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("\n *MENU BIBLIOTECA* ");
                System.out.println("1) Registrar Usuario");
                System.out.println("2) Agregar Libro");
                System.out.println("3) Prestar Libro");
                System.out.println("4) Devolver Libro");
                System.out.println("5) Mostrar Estado de la Biblioteca");
                System.out.println("6) Salir");
                System.out.print("Seleccione una opción: ");

                int opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese nombre del usuario: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Ingrese ID del usuario: ");
                        String idUsuario = scanner.nextLine();
                        biblioteca.registrarUsuario(nombre, idUsuario);
                        break;
                    case 2:
                        System.out.print("Ingrese título del libro: ");
                        String titulo = scanner.nextLine();
                        System.out.print("Ingrese autor del libro: ");
                        String autor = scanner.nextLine();
                        System.out.print("Ingrese ID del libro: ");
                        String idLibro = scanner.nextLine();
                        biblioteca.agregarLibro(titulo, autor, idLibro);
                        break;
                    case 3:
                        System.out.print("Ingrese ID del usuario: ");
                        idUsuario = scanner.nextLine();
                        System.out.print("Ingrese ID del libro a prestar: ");
                        idLibro = scanner.nextLine();
                        biblioteca.prestarLibro(idUsuario, idLibro);
                        break;
                    case 4:
                        System.out.print("Ingrese ID del usuario: ");
                        idUsuario = scanner.nextLine();
                        System.out.print("Ingrese ID del libro a devolver: ");
                        idLibro = scanner.nextLine();
                        biblioteca.devolverLibro(idUsuario, idLibro);
                        break;
                    case 5:
                        biblioteca.mostrarEstadoBiblioteca();
                        break;
                    case 6:
                        System.out.println("Saliendo del sistema...");
                        scanner.close();
                        return;
                    default:
                        System.out.println(" Opción inválida.");
                }
            }
        }
    }


//Checar la foto del nuevo metodo, en devolver libro tambien deberia d llevar la biblioteca
//agregar un menu