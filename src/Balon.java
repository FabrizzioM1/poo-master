public class Balon {
    private String marca;
    private int num_tamanio;
    private String color;
    private String tipo;
    private String material;
    private boolean inflado;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNum_tamanio() {
        return num_tamanio;
    }

    public void setNum_tamanio(int num_tamanio) {
        this.num_tamanio = num_tamanio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isInflado() {
        return inflado;
    }

    public void setInflado(boolean inflado) {
        this.inflado = inflado;
    }

    @Override
    public String toString() {
        return "Balon{" +
                "marca='" + marca + '\'' +
                ", num_tamanio=" + num_tamanio +
                ", color='" + color + '\'' +
                ", tipo='" + tipo + '\'' +
                ", material='" + material + '\'' +
                ", inflado=" + inflado +
                '}';
    }
}
