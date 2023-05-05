package CLASES;
public class CConjunto extends CLista {
    @Override
    public void insertar(int x){
        if (!encontrado(x)) {
            super.insertar(x);
        }
    }
//    public void union(CConjunto A, CConjunto B){
//        CNodo p = A.Primero;
//        do{
//            insertar(p.info);
//            p=p.sig;
//        }while(p!=null);
//        p=B.Primero;
//        do{
//            if (!A.encontrado(p.info)) {
//                insertar(p.info);
//            }
//            p=p.sig;
//        }while(p!=null);
//    }
    public void interseccion(CConjunto A, CConjunto B){
        CNodo p = A.Primero;
        do{
            if (B.encontrado(p.info)) {
                insertar(p.info);
            }
            p=p.sig;
        }while(p!=null);
    }
    public void union(CConjunto A, CConjunto B){
        CNodo p = A.Primero;
        do{
            insertar(p.info);
            p=p.sig;
        }while(p!=null);
        p=B.Primero;
        do{
            insertar(p.info);
            p=p.sig;
        }while(p!=null);
    }
}
