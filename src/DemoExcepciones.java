import java.io.FileInputStream;

public class DemoExcepciones {
    public static void main(String[] args){
            PruebaExcepcion pe= new PruebaExcepcion();
            try {
                pe.creaArreglo();
            }catch (IndexOutOfBoundsException e){
                System.out.println("Mi mensaje de excepción");
            }
    }
}

class PruebaExcepcion{
    public void creaArreglo() throws IndexOutOfBoundsException{
        int arreglo[] = new int[10];
        arreglo[11]=30;
    }
}
//Error es algo de lo que ya no te puedes recuperar
//Excepción es algo en lo que puedo trabajar

//escepcion verificada o no verificada