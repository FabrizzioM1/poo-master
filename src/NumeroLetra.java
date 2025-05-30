import java.util.Scanner;
public class NumeroLetra {
    public class NumeroEnLetras {
        private int numero;

        public NumeroEnLetras(int numero) {
            if (numero < 0 || numero > 9999) {
                throw new IllegalArgumentException("El número debe estar entre 0 y 9999.");
            }
            this.numero = numero;
        }

        public String convertirANumerosEnLetras() {
            if (numero == 0) {
                return "Cero";
            }

            StringBuilder resultado = new StringBuilder();

            // Manejo de miles
            if (numero >= 1000) {
                int miles = numero / 1000;
                resultado.append(convertirCentenas(miles)).append(" mil ");
                numero %= 1000;
            }

            // Manejo de centenas
            if (numero >= 100) {
                int centenas = numero / 100;
                resultado.append(convertirCentenas(centenas)).append(" ");
                numero %= 100;
            }

            // Manejo de decenas y unidades
            if (numero >= 20) {
                int decenas = numero / 10;
                resultado.append(convertirDecenas(decenas)).append(" ");
                numero %= 10;
            } else if (numero >= 10) {
                resultado.append(convertirDecenasEspeciales(numero)).append(" ");
                numero = 0;
            }

            // Manejo de unidades
            if (numero > 0) {
                resultado.append(convertirUnidades(numero)).append(" ");
            }

            return resultado.toString().trim();
        }

        private String convertirCentenas(int centena) {
            switch (centena) {
                case 1: return "Cien";
                case 2: return "Doscientos";
                case 3: return "Trescientos";
                case 4: return "Cuatrocientos";
                case 5: return "Quinientos";
                case 6: return "Seiscientos";
                case 7: return "Setecientos";
                case 8: return "Ochocientos";
                case 9: return "Novecientos";
                default: return "";
            }
        }

        private String convertirDecenas(int decena) {
            switch (decena) {
                case 2: return "Veinte";
                case 3: return "Treinta";
                case 4: return "Cuarenta";
                case 5: return "Cincuenta";
                case 6: return "Sesenta";
                case 7: return "Setenta";
                case 8: return "Ochenta";
                case 9: return "Noventa";
                default: return "";
            }
        }

        private String convertirDecenasEspeciales(int numero) {
            switch (numero) {
                case 10: return "Diez";
                case 11: return "Once";
                case 12: return "Doce";
                case 13: return "Trece";
                case 14: return "Catorce";
                case 15: return "Quince";
                case 16: return "Dieciséis";
                case 17: return "Diecisiete";
                case 18: return "Dieciocho";
                case 19: return "Diecinueve";
                default: return "";
            }
        }

        private String convertirUnidades(int unidad) {
            switch (unidad) {
                case 1: return "Uno";
                case 2: return "Dos";
                case 3: return "Tres";
                case 4: return "Cuatro";
                case 5: return "Cinco";
                case 6: return "Seis";
                case 7: return "Siete";
                case 8: return "Ocho";
                case 9: return "Nueve";
                default: return "";
            }
        }

        public void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduce un número entre 0 y 9999: ");
            int numero = scanner.nextInt();

            try {
                NumeroEnLetras numeroEnLetras = new NumeroEnLetras(numero);
                String resultado = numeroEnLetras.convertirANumerosEnLetras();
                System.out.println("Salida: " + resultado);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}