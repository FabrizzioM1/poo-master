//Vamos a agregar un constructor a nuestra clase
//CONSTRUCTOR: Un metodo especial que es invocado
//en el proceso de instanciamiento de la clase.
//Es público, se llama igual que la clase y no tiene
//tipo de retorno

public class DemoConstructores_01 {
    String atributo1;
    double atributo2;
    String atributo3;

    public DemoConstructores_01() { //Este es un constructor por default
        System.out.println("Creando el objeto");  // Aunque no lo veías existía
        atributo1 = "Valor del atributo 1";
    }

    public DemoConstructores_01(String valor) {          //( String )
        atributo1 = "valor";
    }

    public DemoConstructores_01(String valor, String valor2) {          //( String, String )
        atributo3 = "valor";

    }
}