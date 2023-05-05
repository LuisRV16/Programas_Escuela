package TDA;
public class CPila {
  //Propiedades
    CNodo Primero;
  
    public CPila(){Primero=null;}
    
    //************** Clase Nodo
    private class CNodo
    {   //Propiedades de CNodo
        int info;
        CNodo sig;
        //Constructor de CNodo
        private CNodo(){}
        private CNodo(int x){this.info=x;}//Guarda la info en cada nodo creado
    }
    //************* Fin de la clase CNodo
    
    public void insertar(int x)
    {
        CNodo p=new CNodo(x);
        p.sig=Primero;
        Primero=p;
    }
    
    
    public boolean vacia(){return (Primero==null);}
    
    
    @Override
    public String toString()
    {
        if(!vacia())
        {
            String s="Primero->";
            CNodo p=Primero;
            do
            {
                s=s+p.info+"->";
                p=p.sig;
            }while(p!=null);
            s=s+"null";
            return s;
        }
        else
            return "Lista vacia";
    }
    
    public int eliminar()
    {
        if(vacia())
            return -1;
        else
        {
            int x=Primero.info;
            Primero=Primero.sig;
            return x;
        }
    }
  
    public void union(CPila A,CPila B)
    {
        CNodo p=A.Primero;
        do
        {
            this.insertar(p.info);
            p=p.sig;
        }while(p!=null);
        
        p=B.Primero;
        do
        {
            this.insertar(p.info);
            p=p.sig;
        }while(p!=null);
    }
    
    public void bono(int x)
    {
        if(!vacia())
        {
            CNodo p=Primero;
            do
            {
                p.info=p.info+x;
                p=p.sig;
            }while(p!=null);
        }
    }
}
