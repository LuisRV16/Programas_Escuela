package CLASES;
public class CListaP {
    protected CNodo Primero;
    public CListaP() {
        Primero = null;
    }
    //Clase Interna CNodo
    protected class CNodo {
        protected CNodo sig;
        int x;
        int y;
        private CNodo() {
        }
        private CNodo(int x,int y) {
            this.x = x;
            this.y = y;
        }
    }
    //****Fin de la clase****
    public boolean vacia() {
        return (Primero == null);
    }
    public void insertar(int x,int y) {
        CNodo p = new CNodo(x,y);
        p.sig = Primero;
        Primero = p;
    }
    @Override
    public String toString() {
        if (!vacia()) {
            String s = "Primero";
            CNodo p = Primero;
            do {
                s = s +"("+p.x+"),("+p.y+")";
                p = p.sig;
            } while (p != null);
            s = s + "->null";
            return s;
        } else {
            return "Lista vacia";
        }
    }
    
    public void traslacion(int tx, int ty){
        CNodo p = Primero;
        do{
            p.x+=tx;
            p.y+=ty;
            p=p.sig;
        }while(p!=null);
    }
    
    public void escalacion(int tx, int ty){
        CNodo p = Primero;
        do{
            p.x*=tx;
            p.y*=ty;
            p=p.sig;
        }while(p!=null);
    }
}
