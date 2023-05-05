package Lista_doble;
//@author Luis Ricardo Reyes Villar

public class ListaD {

    private NodoD p, f;

    public ListaD() {
        p = null;
        f = null;
    }

    public boolean listaVacia() {
        return (p == null);
    }

    public void insertaInicio(int n) {
        NodoD q = new NodoD();
        q.info = n;
        q.ligaizq = null;
        q.ligader = p;
        if (!listaVacia()) {
            p.ligaizq = q;
            q.ligaizq = null;
            p = q;
            System.out.println("Elemento insertado");
        } else {
            System.out.println("Primer elemento insertado");
            p = q;
            f = q;
        }
    }

    public void insertaFinal(int n) {
        NodoD q = new NodoD();
        q.info = n;
        if (!listaVacia()) {
            q.ligader = null;
            f.ligader = q;
            q.ligaizq = f;
            f = q;
            System.out.println("Elemento insertado");
        } else {
            q.ligaizq = null;
            q.ligader = p;
            p = q;
            f = q;
            System.out.println("Primer Elemento insertado");
        }
    }

    public void insertaAntes(int n, int ref) {
        if (!listaVacia()) {
            NodoD q = new NodoD();
            NodoD r = new NodoD();
            q = p;
            while (q.ligader != null && q.info != ref) {
                q = q.ligader;
            }
            if (q.info == ref) {
                NodoD aux = new NodoD();
                aux.info = n;
                aux.ligader = q;
                r = q.ligaizq;
                q.ligaizq = aux;
                if (p == q) {
                    aux.ligaizq = null;
                    p = aux;
                } else {
                    r.ligader = aux;
                    aux.ligaizq = r;
                }
                System.out.println("Elemento insertado");
            } else {
                System.out.println("Elemento no encontrado");
            }
        } else {
            System.out.println("LISTA VACIA");
        }
    }

    public void insertaDespues(int n, int ref) {
        if (!listaVacia()) {
            NodoD q = new NodoD();
            NodoD r = new NodoD();
            q = p;
            while (q.ligader != null && q.info != ref) {
                q = q.ligader;
            }
            if (q.info == ref) {
                NodoD aux = new NodoD();
                aux.info = n;
                aux.ligaizq = q;
                r = q.ligader;
                q.ligader = aux;
                if (q == f) {
                    aux.ligader = null;
                    f.ligaizq = aux;
                } else {
                    r.ligaizq = aux;
                    aux.ligader = r;
                }
                System.out.println("Elemento insertado");
            } else {
                System.out.println("Elemento no encontrado");
            }
        } else {
            System.out.println("LISTA VACIA");
        }
    }

    public void eliminarInicio() {
        if (!listaVacia()) {
            NodoD q = new NodoD();
            q = p;
            if (q.ligader == null) {
                p = null;
                f = null;
            } else {
                p = q.ligader;
                p.ligaizq = null;
            }
            q = null;
            System.out.println("Elemento eliminado");
        } else {
            System.out.println("LISTA VACIA");
        }
    }

    public void eliminarFinal() {
        if (!listaVacia()) {
            NodoD q = new NodoD();
            q = f;
            if (p == f) {
                p = null;
                f = null;
            } else {
                f = f.ligaizq;
                f.ligader = null;
            }
            q = null;
            System.out.println("Elemento eliminado");
        } else {
            System.out.println("LISTA VACIA");
        }
    }

    public void eliminarNodoX(int n) {
        if (!listaVacia()) {
            NodoD q = new NodoD();
            boolean band = true;
            q = p;
            while (q.info != n && band == true) {
                if (q.ligader != null) {
                    q = q.ligader;
                } else {
                    band = false;
                }
            }
            if (!band) {
                System.out.println("No existe el valor en la lista");
            } else {
                if (p == q && p == f) {
                    p = null;
                    f = null;
                } else {
                    if (p == q && p != f) {
                        p = q.ligader;
                        p.ligaizq = null;
                    } else {
                        if (f == q) {
                            f = f.ligaizq;
                            f.ligader = null;
                        } else {
                            NodoD aux = new NodoD();
                            NodoD aux1 = new NodoD();
                            aux = q.ligaizq;
                            aux1 = q.ligader;
                            aux.ligader = aux1;
                            aux1.ligaizq = aux;
                        }
                    }
                }
                q = null;
                System.out.println("Elemento eliminado");
            }
        } else {
            System.out.println("LISTA VACIA");
        }
    }

    public boolean buscar(int n) {
        boolean status = false;
        if (!listaVacia()) {
            NodoD q = p;
            while (q != null) {
                if (q.info == n) {
                    status = true;
                }
                q = q.ligader;
            }
        }
        return status;
    }

    public void imprimirIn_F() {
        NodoD q = p;
        String s = "Primero->";
        if (!listaVacia()) {
            while (q != null) {
                s = s + q.info + "->";
                q = q.ligader;
            }
            s = s + "null";
        } else {
            s = "LISTA VACIA";
        }
        System.out.println(s);
    }

    public void imprimirF_In() {
        NodoD q = f;
        String s = "<-null";
        if (!listaVacia()) {
            while (q != null) {
                s = "<-" + q.info + s;
                q = q.ligaizq;
            }
            s = "Primero" + s;
        } else {
            s = "LISTA VACIA";
        }
        System.out.println(s);
    }
}
