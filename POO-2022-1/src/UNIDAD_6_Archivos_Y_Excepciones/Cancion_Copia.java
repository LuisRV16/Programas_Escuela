package UNIDAD_6_Archivos_Y_Excepciones;
//@author Luis Ricardo Reyes Villar
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Cancion_Copia {
    public static void main(String[] args)throws IOException, FileNotFoundException {
        String ruta="D:\\POO-2022-1\\src\\UNIDAD_6_Archivos_Y_Excepciones\\Cancion.txt";
        String ruta2="D:\\POO-2022-1\\src\\UNIDAD_6_Archivos_Y_Excepciones\\copiaCancion.txt";
        int x;
        File Lector = new File(ruta);
        File Escritor = new File(ruta2);
        FileReader fr = new FileReader(Lector);
        FileWriter fw = new FileWriter(Escritor);
        while((x=fr.read())!=-1){
            fw.write(x);
        }
        fr.close();
        fw.close();
    }
    
}
