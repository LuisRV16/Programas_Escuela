package CLASES;
public class CLista {
    protected CNodo Primero;
    public CLista() {
        Primero = null;
    }
    //Clase Interna CNodo
    protected class CNodo {
        protected int info;
        protected CNodo sig;
        private CNodo() {
        }
        private CNodo(int n) {
            this.info = n;
        }
    }
    //****Fin de la clase****
    public boolean vacia() {
        return (Primero == null);
    }
    public void insertar(int n) {
        CNodo p = new CNodo(n);
        p.sig = Primero;
        Primero = p;
    }
    public boolean encontrado(int x){
        if (vacia()) {
            return false;
        }else{
            CNodo p = Primero;
            do{
                if (x==p.info) {
                    return true;
                }
                p=p.sig;
            }while(p!=null);
        }
        return false;
    }
    @Override
    public String toString() {
        if (!vacia()) {
            String s = "Primero";
            CNodo p = Primero;
            do {
                s = s + "->" + p.info;
                p = p.sig;
            } while (p != null);
            s = s + "->null";
            return s;
        } else {
            return "Lista vacia";
        }
    }
}
