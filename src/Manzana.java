public class Manzana {
    private String tipo;
    private String color;
    private String sabor;
    private String tamanio;
    private int kg_peso;
    private int precio;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public int getKg_peso() {
        return kg_peso;
    }

    public void setKg_peso(int kg_peso) {
        this.kg_peso = kg_peso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Manzana{" +
                "tipo='" + tipo + '\'' +
                ", color='" + color + '\'' +
                ", sabor='" + sabor + '\'' +
                ", tamanio='" + tamanio + '\'' +
                ", kg_peso=" + kg_peso +
                ", precio=" + precio +
                '}';
    }
}
