package Cola;

public class Clasefila {

    int frente, atras, max;
    private int[] elem;

    public Clasefila(int n) {
        max = n;
        elem = new int[max];
        frente = -1;
        atras = -1;
    }

    public boolean filaLlena() {
        return atras == max - 1;
    }

    public boolean filaVacia() {
        return frente == -1 && atras == -1;
    }

    public void insertar(int dato) {
        if (filaLlena()) {
            System.out.println("Desbordamiento");
        } else {
            atras++;
            elem[atras] = dato;
        }
    }

    public void elimina() {
        int dato = 0;
        if (filaVacia()) {
            System.out.println("La fila esta vacía, así que no hay nada que eliminar");
        } else {
            dato = elem[atras];
            atras = atras - 1;
            System.out.println("El dato " + dato + "ha sido eliminado");
        }
    }

    public void vaciarFila() {
        int dato = 0;
        for (int i = atras; i >= 0; i--) {
            dato = elem[i];
            atras = atras - 1;
        }
    }

    public void imprimirFila() {
        if (filaVacia()) {
            System.out.println("No se han ingresado datos a la fila, favor de checar");
        } else {
            for (int i = 0; i <= atras; i++) {
                System.out.println(elem[i]);
            }
        }
    }

    public void info() {
        int dato = 0;
        if (filaVacia()) {
            System.out.println("No se encontraron datos ingresados");
        } else {
            dato = elem[atras];
            System.out.println(dato);
        }
    }

    public int contar() {
        return (atras + 1);
    }

    public boolean buscar(int b) {
        boolean y = false;
        for (int i = 0; i <= atras; i++) {
            if (this.elem[i] == b) {
                y = true;
            } else {

            }
        }
        return y;
    }

    public void invertir() {
        Clasefila a = new Clasefila(this.elem.length);
        int t = 0;
        for (int i = atras; i > frente; i--) {
            a.elem[t] = this.elem[i];
            System.out.println(a.elem[t]);
            t++;
        }
    }

}
