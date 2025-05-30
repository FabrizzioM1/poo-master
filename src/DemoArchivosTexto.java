import java.io.*;

public class DemoArchivosTexto {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File arch=new File("miArchivo.txt");
        FileReader fr=new FileReader(arch);
        FileWriter fw=new FileWriter("./src/copia.txt");
        int c;
        while((c= fr.read())!=-1){
            System.out.print((char)c);
            fw.write(c);
        }
        fr.close();
        fw.close();
    }
}
