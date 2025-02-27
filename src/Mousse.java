public class Mousse {
    private String marca;
    private String color;
    private int dpi;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    @Override
    public String toString() {
        return "Mousse{" +
                "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", dpi=" + dpi +
                '}';
    }

    public Mousse(String marca) {
        this.marca = marca;
    }

    public Mousse(int dpi, String marca) {
        this.dpi = dpi;
        this.marca = marca;
    }

    public Mousse(String color, String marca) {
        this.color=color;
        this.marca=marca;
    }

    public Mousse(int dpi, String color, String marca) {
        this.dpi = dpi;
        this.color = color;
        this.marca = marca;
    }
}
