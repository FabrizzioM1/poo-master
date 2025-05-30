public class DemoString {
    public static void main(String[] args) {
        String nombre = new String("Shakira");
        System.out.println(nombre.charAt(0));
        System.out.println(nombre.length());
        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.toLowerCase());
        nombre=nombre.toUpperCase();
        System.out.println(nombre);

        System.out.println(nombre.equals("SHAKIRA"));

        //Crear una rutina para dada una frase, buscar si existe la
        //palabra "AMOR"
        String frase="Leo-anda-en-busca-del-     aMoR     ";
        String[] resultado = frase.split("-");

        for(String s:resultado){
            System.out.println(s.trim());

            System.out.println(frase.equals("aMoR"));

        }
    }
    }


