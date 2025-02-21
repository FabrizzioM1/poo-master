public class MainManzana {
    public static void main(String[] args) {
        Manzana man = new Manzana();
        man.setTipo("Fuji");
        man.setColor("Rojo");
        man.setSabor("Dulce");
        man.setTamanio("Grande");
        man.setKg_peso(2);
        man.setPrecio(50);

        Manzana man1 = new Manzana();
        man1.setTipo("Granny Smith");
        man1.setColor("Verde");
        man1.setSabor("Ácido");
        man1.setTamanio("Mediano");
        man1.setKg_peso(1);
        man1.setPrecio(40);

        System.out.println(man);
        System.out.println(man1);
    }
}
