package Fila_Circular;
//@author Luis Ricardo Reyes Villar

public class Fila_Circular {

    private int atras, frente, max, elem[], cont1 = 0, cont2 = 0;

    public Fila_Circular() {
    }

    public Fila_Circular(int n) {
        max = n;
        atras = frente = -1;
        elem = new int[max];
    }

    public boolean filaLlena() {
        boolean status = false;
        if (((atras == max - 1) && (frente == 0)) || ((atras + 1) == frente)) {
            status = true;
        }
        return status;
    }

    public boolean filaVacia() {
        if (frente == -1 && atras == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void insertaCircular(int x) {
        if (filaLlena() == true) {
            System.out.println("Desbordamiento");
        } else {
            if (atras == max - 1) {
                atras = 0;
            } else {
                atras++;
            }
            elem[atras] = x;
            System.out.println("Elemento insertado!");
            cont1++;
            if (frente == -1) {
                frente = 0;
            }
        }
    }

    public int totalCircular() {
        return cont1 - cont2;
    }
    
    /*public int totalCircular(){
        int cont=0;
        if (filaVacia() == true) {
            cont=0;
        } else {
            if (frente <= atras) {
                for (int i = frente; i <= atras; i++) {
                    cont++;
                }
            } else {
                for (int i = frente; i <= max - 1; i++) {
                    cont++;
                }
                for (int i = 0; i <= atras; i++) {
                    cont++;
                }
            }
        }
        return cont;
    }*/

    public int info() {
        int dato = -1;
        if (filaVacia() == true) {
            System.out.println("No hay información que mostrar");
        } else {
            dato = elem[frente];
        }
        return dato;
    }

    public void imprimeFila() {
        if (filaVacia() == true) {
            System.out.println("No hay informacion que mostrar");
        } else {
            if (frente <= atras) {
                for (int i = frente; i <= atras; i++) {
                    System.out.println("Elemento en la posicion " + (i) + ".- " + elem[i]);
                }
            } else {
                for (int i = frente; i <= max - 1; i++) {
                    System.out.println("Elemento en la posicion " + (i) + ".- " + elem[i]);
                }
                for (int i = 0; i <= atras; i++) {
                    System.out.println("Elemento en la posicion " + (i) + ".- " + elem[i]);
                }
            }
        }
    }

    public void eliminarCircular() {
        int dato = 0;
        if (filaVacia() == true) {
            System.out.println("Subdesbordamiento");
        } else {
            dato = elem[frente];
            System.out.println("Dato Eliminado");
            cont2++;
        }
        if (frente == atras) {
            frente = atras = -1;
        } else {
            if (frente == max - 1) {
                frente = 0;
            } else {
                frente++;
            }
        }
    }

    public void vaciarFila() {
        if (filaVacia() == false) {
            frente = -1;
            atras = -1;
            System.out.println("La Fila ha sido vaciada");
        }
    }

    public boolean buscar(int x) {
        boolean status = false;
        if (filaVacia() == true) {
            System.out.println("No hay datos");
        } else {
            if (frente <= atras) {
                for (int i = frente; i <= atras; i++) {
                    if (elem[i] == x) {
                        status = true;
                    }
                }
            } else {
                for (int i = frente; i <= max - 1; i++) {
                    if (elem[i] == x) {
                        status = true;
                    }
                }
                for (int i = 0; i <= atras; i++) {
                    if (elem[i] == x) {
                        status = true;
                    }
                }
            }
        }
        return status;
    }
    
    public void copiar(){
        int aux[] = new int[max];
        for (int i = 0; i < max; i++) {
            aux[i]=elem[i];
        }
        for (int i = 0; i < max; i++) {
            System.out.println("Elemento en la posicion "+i+": "+aux[i]);
        }
    }
    
    public void invertir(){
        int inv[] = new int[max];
        if (filaVacia()==true) {
            System.out.println("No hay datos");
        } else{
            for (int i = 0; i < max; i++) {
                inv[i]=elem[max-1-i];
            }
            if (frente <= atras) {
                for (int i = frente; i <= atras; i++) {
                    System.out.println("Elemento en la posicion " + (i) + ".- " + inv[i]);
                }
            } else {
                for (int i = frente; i <= max - 1; i++) {
                    System.out.println("Elemento en la posicion " + (i) + ".- " + inv[i]);
                }
                for (int i = 0; i <= atras; i++) {
                    System.out.println("Elemento en la posicion " + (i) + ".- " + inv[i]);
                }
            }    
        }
     }
}
