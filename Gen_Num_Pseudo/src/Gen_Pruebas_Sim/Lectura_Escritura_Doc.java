package Gen_Pruebas_Sim;
//@RC

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lectura_Escritura_Doc {

    public void escribir_val(String s) {
        String cadena = s;
        /*Es necesario crear una carpeta en el disco C: con nombre "Num_Pseudo" para que funcione
            correctamente el programa*/
        
        try {
            int numArchivo = 1;
            String nombreArchivo = "Variables_Aleatorias_" + numArchivo + ".txt";
            File archivo = new File("C:\\Num_Pseudo\\" + nombreArchivo);
            
            while (archivo.exists()) {
                numArchivo++;
                nombreArchivo = "Variables_Aleatorias_" + numArchivo + ".txt";
                archivo = new File("C:\\Num_Pseudo\\" + nombreArchivo);
            }

            FileWriter fw = new FileWriter(archivo);
            for (int i = 0; i < cadena.length(); i++) {
                fw.write(cadena.charAt(i));
            }
            
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Lectura_Escritura_Doc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String leer_val() {
        
        String s ="";
        int numArchivo = 100;
        String nombreArchivo = "Variables_Aleatorias_" + numArchivo + ".txt";
        File archivo = new File("C:\\Num_Pseudo\\" + nombreArchivo);
        
            try {
                FileReader fr = new FileReader(archivo);
                int c;
                while ((c = fr.read()) != -1) {
                    char caracter = (char) c;
                    if (c != 10) {
                        s+=caracter;
                    } else {
                        s+="\n";
                    }
                }
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(Lectura_Escritura_Doc.class.getName()).log(Level.SEVERE, null, ex);
            }

        return s;
    }
    public void escribir_num(String s) {
        String cadena = s;
        /*Es necesario crear una carpeta en el disco C: con nombre "Num_Pseudo" para que funcione
            correctamente el programa*/
        try {
            int numArchivo = 1;
            String nombreArchivo = "Num_Pseudo_" + numArchivo + ".txt";
            File archivo = new File("C:\\Num_Pseudo\\" + nombreArchivo);
            while (archivo.exists()) {
                numArchivo++;
                nombreArchivo = "Num_Pseudo_" + numArchivo + ".txt";
                archivo = new File("C:\\Num_Pseudo\\" + nombreArchivo);
            }

            FileWriter fw = new FileWriter(archivo);
            for (int i = 0; i < cadena.length(); i++) {
                fw.write(cadena.charAt(i));
            }
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Lectura_Escritura_Doc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
