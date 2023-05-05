package APLICACIONES;

import CLASES.CPunto;

public class ApPunto {

    public static void main(String[] args) {
        CPunto A = new CPunto(10, 30);
        CPunto Nave[] = new CPunto[10];
        for (int i = 0; i < 10; i++) {
            Nave[i] = new CPunto((int) (Math.random() * 50 + 1), (int) (Math.random() * 50 + 1));
        }
        int cont = 65;
        for (int i = 0; i < 10; i++) {
            System.out.print((char) cont + " " + Nave[i].toString() + " ");
            cont++;
        }

    }
}
