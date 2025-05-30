import java.util.ArrayList;

class Vehiculo {
    String marca;
    String modelo;
    String anio;
    String motor;
    String no_ruedas;
    String tipo_combustible;
    String matricula;
}

class Motocicleta extends Vehiculo{
    String cc;
}

class Coche extends Vehiculo{
    int no_puertas;
}

public class Algo {
    public static void main(String[] args) {
        ArrayList<Vehiculo> motos = new ArrayList<>();
        Motocicleta motito=new Motocicleta();
        Coche cochecito = new Coche();
        motos.add(motito);
        motos.add(cochecito);
    }
}