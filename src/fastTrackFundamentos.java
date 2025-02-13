import java.net.SocketOption;
import java.util.Scanner;
public class fastTrackFundamentos {
    public static void main(String[] args) {
        /*
        //Variables en java
        int a;
        double b;
        String d;
        boolean e;

        a=3;
        b=20.50;
        d="Esto es una cadena";
        e=true;
        String nombre = "Fabrizzio Murillo"

                //Constantes

       final double PI=3.141516;

        Scanner intro= new Scanner(System.in);

        System.out.println(b);
        b=intro.nextDouble();
        System.out.println(b);

        System.out.println(PI);
        PI= intro.nextDouble();

        //Condicionales <, >, <=, >=, !=, ==
        //Operadores lógicos &&, ||, !

        int valor=21;
        int calif=82;
        if(!(valor>=20 || calif>85)){
            if(valor==20){
                System.out.println("Es exactamente 20");
            }else{
                System.out.println("Es superior a 20");
            }
        }
        else {
        System.out.println("Es menor o igual")
         
        }
        System.out.println("FIN DEL PROGRAMA");
        */

        //Condicionales múltiples "Switch"

        int opcion;
        opcion=4;

        switch (opcion){
            case 1:
             System.out.println("Vale 1");
                break;
            case 2:
                System.out.println("Vale 2");
                break;
            case 3:
                System.out.println("Vale 3");
                break;
            default:
                System.out.println("Valor no permitido");
                break;
        }
    }
}
