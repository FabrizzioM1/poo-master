//Crear un programa orientado a objetos que permita crear objetos calculadora
//de cambios de divisas. Debe recibir la cantidad de un tipo de moneda y dar
//como salida la cantidad equivalente en la otra moneda.
//Crear 5 objetos que realicen cambios diferentes.
//Evitar que el objeto pida los datos de entrada desde teclado.
//Implementar herencia.
//Implementar 2 constructores no vacíos.

class Divisa {
    protected double cantidad;
    protected String nombreOrigen;
    protected String nombreDestino;

    public Divisa(double cantidad, String nombreOrigen, String nombreDestino) {
        this.cantidad = cantidad;
        this.nombreOrigen = nombreOrigen;
        this.nombreDestino = nombreDestino;
    }

    public Divisa(String nombreOrigen, String nombreDestino) {
        this.cantidad = 0;
        this.nombreOrigen = nombreOrigen;
        this.nombreDestino = nombreDestino;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getCantidad() {
        return cantidad;
    }

    public String getNombreOrigen() {
        return nombreOrigen;
    }

    public String getNombreDestino() {
        return nombreDestino;
    }
}

class CalcularDiv extends Divisa {
    private double tasaCambio;

    public CalcularDiv(double cantidad, String nombreOrigen, String nombreDestino, double tasaCambio) {
        super(cantidad, nombreOrigen, nombreDestino);
        this.tasaCambio = tasaCambio;
    }

    public CalcularDiv(String nombreOrigen, String nombreDestino, double tasaCambio) {
        super(nombreOrigen, nombreDestino);
        this.tasaCambio = tasaCambio;
    }

    public double convertir() {
        return cantidad * tasaCambio;
    }

    public void mostrarResultado() {
        System.out.printf("%.2f %s = %.2f %s", cantidad, nombreOrigen, convertir(), nombreDestino);
    }
}


public class CalculadoraDivisas {
    public static void main(String[] args) {
        CalcularDiv c1 = new CalcularDiv(25, "dolar(es)", "euro(s)", 0.88);
        CalcularDiv c2 = new CalcularDiv(34, "euro(s)", "yen(es)", 163.01);
        CalcularDiv c3 = new CalcularDiv(76, "libra(s) esterlina(s)", "dolar(es)", 1.34);
        CalcularDiv c4 = new CalcularDiv(102, "dolar(es) canadiense(s)", "peso(s) mexicano(s)", 13.95);
        CalcularDiv c5 = new CalcularDiv(137, "dolar(es) australiano(s)", "franco(s) suizo(s)", 0.53);

        c1.mostrarResultado();
        c2.mostrarResultado();
        c3.mostrarResultado();
        c4.mostrarResultado();
        c5.mostrarResultado();
    }
}

