public class NumLetra {
    private static final String[] unidades = {"", "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve"};
    private static final String[] diez_a_veinte = {"Diez", "Once", "Doce", "Trece", "Catorce", "Quince", "Dieciséis", "Diecisiete", "Dieciocho", "Diecinueve"};
    private static final String[] decenas = {"", "Diez", "Veinte", "Treinta", "Cuarenta", "Cincuenta", "Sesenta", "Setenta", "Ochenta", "Noventa"};
    private static final String[] centenas = {"", "Cien", "Doscientos", "Trescientos", "Cuatrocientos", "Quinientos", "Seiscientos", "Setecientos", "Ochocientos", "Novecientos"};

    private int num;

    public NumLetra(int num){
        if (num < 0 || num > 9999) {
            throw new IllegalArgumentException("El número debe estar entre 0 y 9999");
        }
        this.num = num;
    }

    public String convertir () {
        if (num == (0)) {
            return "Cero";
        }
        return convertirNumero(num).trim();
    }

    private String convertirNumero (int num){
        StringBuilder resultado = new StringBuilder();

        if (num >= 1000) {
            if (num == 1000) {
                return "Mil";
            } else {
                resultado.append(unidades[num / 1000]).append(" Mil ");
                num %= 1000;
            }
        }

        if (num >= 100) {
            if (num == 100) {
                resultado.append("Cien");
                return resultado.toString();
            } else {
                resultado.append(centenas[num / 100]).append(" ");
                num %= 100;
            }
        }

        if (num >= 10 && num < 20) {
            resultado.append(diez_a_veinte[num - 10]);
            return resultado.toString();
        } else if (num >= 20) {
            resultado.append(decenas[num / 10]);
            if (num % 10 != 0) {
                resultado.append(" y ").append(unidades[num % 10]);
            }
            return resultado.toString();
        }

        resultado.append(unidades[num]);
        return resultado.toString();
    }

    public static void main (String[]args){
        NumLetra num = new NumLetra(4234);
        System.out.println(num.convertir());
    }
}