public class MainProfesionista {
    public static void main(String[] args) {
        Profesionista pro = new Profesionista();
        pro.setNombre("Ana López");
        pro.setEmpleo("Diseñadora gráfica");
        pro.setAnios_exp(7);
        pro.setEspecialidad("Identidad Visual");
        pro.setEmpresa("Meta");
        pro.setSalario(45000);

        Profesionista pro1 = new Profesionista();
        pro1.setNombre("Carlos Ramirez");
        pro1.setEmpleo("Análisis de Datos");
        pro1.setAnios_exp(4);
        pro1.setEspecialidad("Big Data");
        pro1.setEmpresa("Microsoft");
        pro1.setSalario(60000);

        System.out.println(pro);
        System.out.println(pro1);
    }
}
