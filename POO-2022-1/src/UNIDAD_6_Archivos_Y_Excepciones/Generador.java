package UNIDAD_6_Archivos_Y_Excepciones;
//@author Luis Ricardo Reyes Villar
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Generador {
    public static void main(String[] args) throws IOException {
        int n=50;
        String r1 = "D:\\POO-2022-1\\src\\UNIDAD_6_Archivos_Y_Excepciones";
        r1=r1+"\\Calificaciones.txt";
        File ruta=new File(r1);
        FileWriter fw=new FileWriter(ruta);
        for (int i = 1; i <= n; i++) {
            fw.write((int)(Math.random()*100+1));
        }
        fw.close();
    }
    
}
