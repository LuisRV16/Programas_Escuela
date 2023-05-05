package Cola;
public class Cola {

    int frente, atras, max;
    private int elem[];

    public Cola() {}

    public Cola(int n) {
        max = n;
        elem = new int[max];
        frente = -1;
        atras = -1;
    }

    public boolean filaVacia() {
        return frente == -1 && atras == -1;
    }

    public boolean filaLlena() {
        return atras == max - 1;
    }

    public void inserta(int x) {
        if (filaLlena() == false) {
            atras++;
            elem[atras] = x;
            if (atras == 0) {
                frente = 0;
            }
            System.out.println("...Elemento insertado");
        } else {
            System.out.println("Error, Desbordamiento");
        }
    }

    public int elimina() {
        int dato = -1;
        if (filaVacia() == false) {
            dato = elem[frente];
            if (frente == atras) {
                frente = -1;
                atras = -1;
            } else {
                frente++;
            }
        } else {
            System.out.println("Subdesbordamiento");
        }
        return dato;
    }

    public int info() {
        int dato = -1;
        if (filaVacia() == true) {
            System.out.println("No hay información que mostrar");
        } else {
            dato = elem[frente];
        }
        return dato;
    }

    public void vaciarFila() {
        if (filaVacia() == false) {
            frente = -1;
            atras = -1;
            System.out.println("La Fila ha sido vaciada");
        }
    }

    public void imprimeFila() {
        if (filaVacia() == true) {
            System.out.println("No hay datos");
        } else {
            for (int i = frente; i <= atras; i++) {
                System.out.println(elem[i]);
            }
        }
    }

    public int contar() {
        if (filaVacia() == true) {
            return 0;
        } else {
            return atras - frente + 1;
        }
    }

    public boolean buscar(int x) {
        boolean status = false;
        if (filaVacia() == true) {
            System.out.println("No hay datos");
        } else {
            for (int i = frente; i <= atras; i++) {
                if (elem[i] == x) {
                    status = true;
                }
            }
        }
        return status;
    }

    public void invertir() {
        Cola B = new Cola(this.elem.length);
        int j = 0;
        if (filaVacia() == true) {
            System.out.println("No hay datos");
        } else {
            for (int i = atras; i >= frente; i--) {
                B.elem[j] = this.elem[i];
                System.out.println(B.elem[j]);
                j++;
            }
        }
    }
}
