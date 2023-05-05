package Pila;
//@author Luis Ricardo Reyes Villar
public class Pila {
    private int max, tope;
    private String[] elem;
    public Pila(){}
    public Pila(int n){
        max=n;
        elem=new String[max];
        tope=-1;
    }
    
    public boolean Buscar(String x){
        boolean status = false;
        if (PilaVacia()==true) {
            System.out.println("Error Pila Vacia");
        }else{
            for (int i = 0; i <= tope; i++) {
                if (this.elem[i].equals(x)) {
                    status = true;
                }
            }
        }
        return status;
    }
    
    public boolean PilaVacia(){
        if (tope==-1) {
            return true;
        }else{
            return false;
        }
    }
    
    public boolean PilaLlena(){
        boolean check;
        if (tope==max-1) {
            check=true;
        }else{
            check=false;
        }
        return check;
    }
    
    public void Desapilar(){
        String dato = null;
        if (PilaVacia()==true) {
            System.out.println("NO HAY NADA QUE DESAPILAR");
        }else{
            dato = elem[tope];
            tope = tope-1;
            System.out.println("Dato '"+dato+"' desapilado");
        }
    }
    
    public void Imprimir(){
        if (tope==-1) {
            System.out.println("ERROR NO HAY DATOS");
        }else{
            for (int i = 0; i <= tope; i++) {
                System.out.println(elem[i]);
            }
        }
    }
    
    public void Vaciar(){
        String dato=null;
        for (int i = tope; i >= 0; i--) {
            dato=elem[i];
            tope=tope-1;
        }
    }
    
    public int Top(){
        return tope;
    }
    
    public void Invertir_Pila(){
        String[] B = new String[max];
        for (int i = 0; i <= tope; i++) {
            B[i]=elem[tope-i];
            System.out.println(B[i]);
        }
    }
    public void Invertir(){
        if (PilaVacia()) {
            System.out.println("No hay datos");
        }else{
            Pila a = new Pila(max);
            for (int i = 0; i <= this.tope; i++) {
                a.Apilar(this.elem[this.tope-i]);
                a.Imprimir();
            }
        }
    }
    
    public void Apilar(String x){
        if (PilaLlena()==true) {
            System.out.println("Desbordamiento");
        }else{
            tope++;
            elem[tope]=x;
            System.out.println("Dato Apilado");
        }
    }
    
    public void Info(){
        String dato = null;
        if (PilaVacia()==true) {
            System.out.println("ERROR NO HAY DATOS");
        }else{
            dato = elem[tope];
            System.out.println(dato);
        }
    }
    
    public int Total(){
        return tope+1;
    }
}
