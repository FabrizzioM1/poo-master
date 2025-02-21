public class MainBoleto {
    public static void main(String[] args) {
        Boleto bol = new Boleto();
        bol.setEvento("Concierto de TheWeeknd");
        bol.setPrecio(3200);
        bol.setAsiento(25);
        bol.setFecha("15/03/2025");
        bol.setHora(20);
        bol.setLugar("Foro Sol");

        Boleto bol1 = new Boleto();
        bol1.setEvento("Obra de Teatro");
        bol1.setPrecio(1200);
        bol1.setAsiento(12);
        bol1.setFecha("22/04/2025");
        bol1.setHora(18);
        bol1.setLugar("Teatro Benito Juarez");

        System.out.println(bol);
        System.out.println(bol1);
    }
}
