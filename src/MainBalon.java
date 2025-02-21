public class MainBalon {
    public static void main(String[] args) {
        Balon bal = new Balon();
        bal.setMarca("Nike");
        bal.setNum_tamanio(5);
        bal.setColor("Negro");
        bal.setTipo("Fútbol");
        bal.setMaterial("Cuero");
        bal.setInflado(true);

        Balon bal1 = new Balon();
        bal1.setMarca("Adidas");
        bal1.setNum_tamanio(7);
        bal1.setColor("Rojo");
        bal1.setTipo("Baloncesto");
        bal1.setMaterial("Goma");
        bal1.setInflado(false);

        System.out.println(bal);
        System.out.println(bal1);
    }
}
