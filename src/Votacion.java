import java.util.ArrayList;
import java.util.HashMap;
public class Votacion {

        // Clase Boleta
        static class Boleta {
            private String planillaElegida;

            public Boleta(String planillaElegida) {
                this.planillaElegida = planillaElegida;
            }

            public String getPlanillaElegida() {
                return planillaElegida;
            }
        }

        // Clase Urna
        static class Urna {
            private ArrayList<Boleta> boletas;

            public Urna() {
                boletas = new ArrayList<>();
            }

            public void depositarBoleta(Boleta boleta) {
                boletas.add(boleta);
            }

            public void contarVotos() {
                HashMap<String, Integer> conteo = new HashMap<>();

                for (Boleta b : boletas) {
                    String planilla = b.getPlanillaElegida();
                    conteo.put(planilla, conteo.getOrDefault(planilla, 0) + 1);
                }

                System.out.println("Resultados de la votación:");
                for (String planilla : conteo.keySet()) {
                    System.out.println("Planilla " + planilla + ": " + conteo.get(planilla) + " votos");
                }
            }
        }

        // Método principal
        public static void main(String[] args) {
            // Crear 3 boletas
            Boleta boleta1 = new Boleta("Azul");
            Boleta boleta2 = new Boleta("Rojo");
            Boleta boleta3 = new Boleta("Verde");

            // Crear una urna y depositar las boletas
            Urna urna = new Urna();
            urna.depositarBoleta(boleta1);
            urna.depositarBoleta(boleta2);
            urna.depositarBoleta(boleta3);

            // Contar votos
            urna.contarVotos();
        }
    }
