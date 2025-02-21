public class Boleto {
    private String evento;
    private int precio;
    private int asiento;
    private String fecha;
    private int hora;
    private String lugar;

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return "Boleto{" +
                "evento='" + evento + '\'' +
                ", precio=" + precio +
                ", asiento=" + asiento +
                ", fecha='" + fecha + '\'' +
                ", hora=" + hora +
                ", lugar='" + lugar + '\'' +
                '}';
    }
}
