import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipInputStream;

public class zipRelease {
    public static void main(String[] args) {
        FileInputStream fin = new FileInputStream(zip이름);
                ZipInputStream zin = new ZipInputStream(fin);
                ZipEntry entry = null;
                while((entry - zin.getNextEntry())) != null){
            System.out.println("압축해제 " + entry.getName());
            FileOutputStream fout = new FileOutputStream(entry.getName());
            for(int c = zin.read(); c != -1; c = zin.read()){
                fout.write(c);
            }
            zin.closeEntry();
            fout.close();
        }
        zin.close();
}
}
