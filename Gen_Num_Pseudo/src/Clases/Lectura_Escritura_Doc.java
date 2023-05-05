package Clases;
//@RC
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Lectura_Escritura_Doc {
    public void escribir(String s){
        String cadena = s;
        try {
            /*Es necesario crear una carpeta en el disco C: con nombre "Num_Pseudo" para que funcione
            correctamente el programa*/
            FileWriter fw = new FileWriter("C:\\Num_Pseudo\\Numeros_pseudoaleatorios.txt");
            for (int i = 0; i < cadena.length(); i++) {
                fw.write(cadena.charAt(i));
            }
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Lectura_Escritura_Doc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public String leer(){
        int c = 0;
        String concatenar = "";
        try {
            FileReader fr = new FileReader("C:\\Num_Pseudo\\Numeros_pseudoaleatorios.txt");
            while(c!=-1){
                c = fr.read();
                char caracter = (char)c;
                if (c!=10) {
                    concatenar+=caracter;
                }else{
                    concatenar+="\n";
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Lectura_Escritura_Doc.class.getName()).log(Level.SEVERE, null, ex);
        }
        return concatenar;
    }
}
