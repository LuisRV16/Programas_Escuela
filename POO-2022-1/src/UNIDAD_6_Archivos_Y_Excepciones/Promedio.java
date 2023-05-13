package UNIDAD_6_Archivos_Y_Excepciones;
//@author Luis Ricardo Reyes Villar
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Promedio {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        String r1 = "D:\\POO-2022-1\\src\\UNIDAD_6_Archivos_Y_Excepciones";
        int cont=0,suma=0,x;
        float prom;
        r1=r1+"\\Calificaciones.txt";
        File Lector=new File(r1);
        FileReader fr= new FileReader(Lector);
        x=fr.read();
        while(x!=-1){
            suma+=x;
            cont++;
            x=fr.read();
        }
        prom =(float)suma/cont;
        System.out.println("Promedio de calificaciones de grupo: "+prom);
        fr.close();
    }
    
}
