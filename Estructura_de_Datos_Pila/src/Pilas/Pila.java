/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pilas;

/**
 *
 * @author Emmanuel Aran Hernandez
 */
public class Pila {
    private int tope;
    private final int max;
    private final char elem[];
    private final char aux[];
    private boolean band;
    
    public Pila(int n) {
        max = n;
        elem = new char[max];
        aux = new char[max];
        tope = -1;
    }

    public int Top() {
        return tope;
    }

    public boolean PilaLlena() {
        if (tope == max-1) {
            return true;
        }else {
            return false;
        }
    }

    public boolean PilaVacia() {
        if (tope == -1) {
            return true;
        }else {
            return false;
        }
    }

    public void Apilar(char ch) {
        if (PilaLlena() == true) {
            System.out.println("La pila está llena.");
        }else {
            tope++;
            elem[tope] = ch;
        }
    }

    public void Desapilar() {
        char ch;
        if (PilaVacia() == true) {
            System.out.println("La pila esta vacía.");
        }else {
            ch = elem[tope];
            tope--;
        }
    }

    public void Imprimir() {
        if (PilaVacia()==true) {
            System.out.println("La pila no contiene datos.");
        }else{
            for (int i = 0; i <= tope; i++) {
                System.out.println((i + 1) + ". Elemento: " + elem[i]);
            }
        }
    }

    public void Vaciar() {
        tope = -1;
        System.out.println("Se ha vaciado la pila.");
    }

    public void Info() {
        if (tope>-1) {
            System.out.println("El último elemento apilado es: " + elem[tope]);
        }else {
            System.out.println("No existen elementos en la pila");
        }
    }

    public void Invertir() {
        if (PilaVacia()==true) {
            System.out.println("La pila está vacía");
        }else {
            System.out.println("Pila Original");
            Imprimir();
            int n=0;
            System.out.println("");

            System.out.println("Pila Invertida");
            for (int i = tope; i > -1; i--) {
                aux[n] = elem[i];
                System.out.println((n + 1) + ". Elemento: " + aux[n]);
                n++;
            }
        }
    }

    public int Contar() {
        return tope+1;
    }

    public int Buscar(int dato) {
        int pos = -1;

        for (int i = 0; i <= tope; i++) {
            if (dato == elem[i]) {
                pos = i;
                return pos;
            }
        }
        return pos;
    }

    public boolean ValidarPalindromo() {
        for (int i = 0; i <= tope; i++) {
            if (aux[i]!=elem[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean ValidarParentesis(String texto) {
        char ch;

        for (int i = 0; i < texto.length(); i++) {
            if ((texto.charAt(i) == '(') || (texto.charAt(i) == '{') || (texto.charAt(i) == '[')) {
                ch = texto.charAt(i);
                Apilar(ch);
            } else if ((texto.charAt(i) == ')') && (elem[tope] == '(') || (texto.charAt(i) == '}') && (elem[tope] == '{') || (texto.charAt(i) == ']') && (elem[tope] == '[')) {
                Desapilar();
            }
        }
        return PilaVacia();
    }

    public char[] infijaPostfija(String texto) {
        String jerarquia = "^*/+- ";
        int post_inf = 0;
        int post_jer = 0;
        
        for (int i = 0; i < elem.length; i++) {
            elem[i] = texto.charAt(i);
        }

        while (post_jer != jerarquia.length() - 1) {
            if (post_inf==texto.length()) {
                post_inf = 0;
                post_jer++;
            }
            if (texto.charAt(post_inf) == jerarquia.charAt(post_jer)) {
                char aux = ' ';
                aux = elem[post_inf];
                elem[post_inf] = elem[post_inf+1];
                elem[post_inf+1] = aux;
            }
            post_inf++;
        }
        return elem;
    }
}
