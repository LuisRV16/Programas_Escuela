package Gen_Pruebas_Sim;
//@RC

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lectura_Escritura_Doc {

    public void escribir(String s) {
        String cadena = s;
        /*Es necesario crear una carpeta en el disco C: con nombre "Num_Pseudo" para que funcione
            correctamente el programa*/
        try {
            int numArchivo = 1;
            String nombreArchivo = "_Variables_Aleatorias_" + numArchivo + ".txt";
            File archivo = new File("C:\\Num_Pseudo\\Variables_aletorias" + nombreArchivo);
            while (archivo.exists()) {
                numArchivo++;
                nombreArchivo = "_Variables_Aleatorias_" + numArchivo + ".txt";
                archivo = new File("C:\\Num_Pseudo\\Variables_aletorias" + nombreArchivo);
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

    public String leer() {
        StringBuilder concatenar = new StringBuilder();
        int numArchivo = 1;
        String nombreArchivo = "_Variables_Aleatorias_" + numArchivo + ".txt";
        File archivo = new File("C:\\Num_Pseudo\\Variables_aletorias" + nombreArchivo);

        while (archivo.exists()) {
            try {
                FileReader fr = new FileReader(archivo);
                int c;
                while ((c = fr.read()) != -1) {
                    char caracter = (char) c;
                    if (c != 10) {
                        concatenar.append(caracter);
                    } else {
                        concatenar.append("\n");
                    }
                }
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(Lectura_Escritura_Doc.class.getName()).log(Level.SEVERE, null, ex);
            }

            numArchivo++;
            nombreArchivo = "_Variables_Aleatorias_" + numArchivo + ".txt";
            archivo = new File("C:\\Num_Pseudo\\Variables_aletorias" + nombreArchivo);
        }

        return concatenar.toString();
    }
    public void escribir_num(String s) {
        String cadena = s;
        /*Es necesario crear una carpeta en el disco C: con nombre "Num_Pseudo" para que funcione
            correctamente el programa*/
        try {
            int numArchivo = 1;
            String nombreArchivo = "_Num_Pseudo_" + numArchivo + ".txt";
            File archivo = new File("C:\\Num_Pseudo\\Numeros_pseudoaleatorios" + nombreArchivo);
            while (archivo.exists()) {
                numArchivo++;
                nombreArchivo = "_Num_Pseudo_" + numArchivo + ".txt";
                archivo = new File("C:\\Num_Pseudo\\Numeros_pseudoaleatorios" + nombreArchivo);
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

    public String leer_num() {
        StringBuilder concatenar = new StringBuilder();
        int numArchivo = 1;
        String nombreArchivo = "_Num_Pseudo_" + numArchivo + ".txt";
        File archivo = new File("C:\\Num_Pseudo\\Numeros_pseudoaleatorios" + nombreArchivo);

        while (archivo.exists()) {
            try {
                FileReader fr = new FileReader(archivo);
                int c;
                while ((c = fr.read()) != -1) {
                    char caracter = (char) c;
                    if (c != 10) {
                        concatenar.append(caracter);
                    } else {
                        concatenar.append("\n");
                    }
                }
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(Lectura_Escritura_Doc.class.getName()).log(Level.SEVERE, null, ex);
            }

            numArchivo++;
            nombreArchivo = "_Num_Pseudo_" + numArchivo + ".txt";
            archivo = new File("C:\\Num_Pseudo\\Numeros_pseudoaleatorios" + nombreArchivo);
        }

        return concatenar.toString();
    }
}
