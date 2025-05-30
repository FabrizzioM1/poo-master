public class DemoHerenciaConstructores {
    public static void main(String[] args) {
        Elefante dumbo=new Elefante("Elephantidae", "Mamifero", 4000, "Asiatico");
        System.out.println(dumbo);

    }
}

abstract class Animal{
    private String especie;
    private String tipo_nacimiento;

    public Animal(){}

    public Animal(String especie, String tipo_nacimiento) {
        this.especie = especie;
        this.tipo_nacimiento = tipo_nacimiento;
    }

    public String getTipo_nacimiento() {
        return tipo_nacimiento;
    }

    public void setTipo_nacimiento(String tipo_nacimiento) {
        this.tipo_nacimiento = tipo_nacimiento;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "especie='" + especie + '\'' +
                ", tipo_nacimiento='" + tipo_nacimiento + '\'' +
                '}';
    }
}


class Elefante extends Animal{
    private String raza;
    private double peso;

    public Elefante(){
    }

    public Elefante(String especie, String tipo_nacimiento, double peso, String raza) {
        super(especie, tipo_nacimiento);  //super: para invocar el constructor de la clase padre
        this.peso = peso;
        this.raza = raza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Elefante{" +
                "especie='" + super.getEspecie() + '\'' +
                ", tipo='" + super.getTipo_nacimiento() + '\'' +
                ", peso=" + peso +
                ", raza='" + raza + '\'' +
                '}';
    }
}

//if regresa un dato booleano