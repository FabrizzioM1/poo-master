public class Ejercicio_Interfaz {

    public void main(String[] args) {
        Nodo n1=new Nodo("Izquierdo");
        Nodo n2=new Nodo("Derecho");
        n1.conectarDerecha();
    }

    interface Conectable{
        public void conectarDerecha();
        public void conectarIzquierda();
    }

    class Nodo implements Conectable {
        int valor;
        String nombre;
        Nodo nodoizq;
        Nodo nodoDer;

        public Nodo(String derecho) {
        }

        @Override
        public void conectarDerecha() {

        }

        @Override
        public void conectarIzquierda() {

        }
    }

}


/*
    Crear una interfaz llamada Conectable con los métodos:
    - conectarDerecha
    - conectarIzquierda

    Crear una clase concreta llamada Nodo que contenga los campos:
    - valor
    - nombre

    Implementar en la clase Nodo la interfaz, de tal manera que
    un nodo en la izquierda se conecte con el nodo a su derecha y
    automaticamente el nodo a su derecha se conecte con el nodo izquierdo.
    De igual manera si el nodo a la derecha se conecta al de la izquierda
    automaticamente el nodo izquierdo se conecta a la derecha.
 */