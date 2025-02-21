public class MainComputadora {
    public static void main(String[] args) {
        Computadora com = new Computadora();
        com.setMarca("HP");
        com.setModelo("All-In-One");
        com.setProcesador("AMD Ryzen 7");
        com.setGB_RAM(8);
        com.setMemoria_almacenamiento(512);
        com.setEncendida(true);

        Computadora com2 = new Computadora();
        com2.setMarca("Lenovo");
        com2.setModelo("M920s SFF");
        com2.setProcesador("Intel Core i7 de octava generación");
        com2.setGB_RAM(16);
        com2.setMemoria_almacenamiento(1024);
        com2.setEncendida(false);

        System.out.println(com);
        System.out.println(com2);
    }
}
