import java.io.*;

public class DemoArchivos_04 {
    public static void main(String[] args) throws IOException {
        File f = new File("archivo4.txt");
        FileOutputStream fos = new FileOutputStream(f);
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeInt(120);
        dos.writeDouble(314.567890);
        dos.writeBoolean(true);
        dos.writeByte(65);
        dos.close();
        fos.close();

        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);
        System.out.println(dis.readInt());
        System.out.println(dis.readDouble());
        System.out.println(dis.readBoolean());
        System.out.println(dis.readByte());
        dis.close();
        fis.close();
    }
}
