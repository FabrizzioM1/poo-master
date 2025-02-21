public class Computadora {
    private String marca;
    private String modelo;
    private String procesador;
    private int GB_RAM;
    private int memoria_almacenamiento;
    private boolean encendida;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getGB_RAM() {
        return GB_RAM;
    }

    public void setGB_RAM(int GB_RAM) {
        this.GB_RAM = GB_RAM;
    }

    public int getMemoria_almacenamiento() {
        return memoria_almacenamiento;
    }

    public void setMemoria_almacenamiento(int memoria_almacenamiento) {
        this.memoria_almacenamiento = memoria_almacenamiento;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", procesador='" + procesador + '\'' +
                ", GB_RAM=" + GB_RAM +
                ", memoria_almacenamiento=" + memoria_almacenamiento +
                ", encendida=" + encendida +
                '}';
    }
}

