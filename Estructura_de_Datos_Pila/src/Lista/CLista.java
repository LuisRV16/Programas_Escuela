package Lista;
//@author Luis Ricardo Reyes Villar

public class CLista {

    private CNodo p;

    public CLista() {
        p = null;
    }

    public boolean listaVacia() {
        return (p == null);
    }

    public void insertaInicio(int n) {
        CNodo q = new CNodo();
        q.info = n;
        q.liga = p;
        p = q;
        System.out.println("Elemento introducido");
    }

    public void insertaFinal(int n) {
        if (!listaVacia()) {
            CNodo aux;
            aux = p;
            while (aux.liga != null) {
                aux = aux.liga;
            }
            CNodo q = new CNodo();
            q.info = n;
            q.liga = null;
            aux.liga = q;
        } else {
            CNodo q = new CNodo();
            q.info = n;
            q.liga = p;
            p = q;
        }
        System.out.println("Elemento introducido");
    }

    public void insertAntes(int n, int ref) {
        if (!listaVacia()) {
            CNodo aux, aux1 = null;
            boolean band;
            aux = p;
            band = true;
            while ((aux.info != ref) && (band == true)) {
                if (aux.liga != null) {
                    aux1 = aux;
                    aux = aux.liga;
                } else {
                    band = false;
                }
            }
            if (band == true) {
                CNodo q = new CNodo();
                q.info = n;
                System.out.println("Elemento introducido");
                if (p == aux) {
                    q.liga = p;
                    p = q;
                } else {
                    aux1.liga = q;
                    q.liga = aux;
                }
            } else {
                System.out.println("Referencia no encontrada");
            }
        } else {
            System.out.println("Lista Vacia");
        }
    }

    public void insertaDespues(int n, int ref) {
        if (!listaVacia()) {
            CNodo aux;
            boolean band;
            aux = p;
            band = true;
            while ((aux.info != ref) && (band == true)) {
                if (aux.liga != null) {
                    aux = aux.liga;
                } else {
                    band = false;
                }
            }
            if (band == true) {
                CNodo q = new CNodo();
                q.info = n;
                q.liga = aux.liga;
                aux.liga = q;
                System.out.println("Elemento introducido");
            } else {
                System.out.println("Referencia no encontrada");
            }
        } else {
            System.out.println("Lista Vacia");
        }
    }

    public void eliminarPrimero() {
        if (!listaVacia()) {
            CNodo q = p;
            if (q.liga == null) {
                p = null;
            } else {
                p = q.liga;
            }
            q = null;
            System.out.println("Elemento eliminado");
        } else {
            System.out.println("Lista Vacia");
        }
    }

    public void eliminaUltimo() {
        if (!listaVacia()) {
            CNodo q;
            CNodo t = null;
            if (p.liga == null) {
                p = null;
            } else {
                q = p;
                while (q.liga != null) {
                    t = q;
                    q = q.liga;
                }
                t.liga = null;
                q = null;
                System.out.println("Elemento eliminado");
            }
        } else {
            System.out.println("Lista Vacia");
        }
    }

    @Override
    public String toString() {//metodo imprimeLista
        CNodo q = p;
        String s = "Primero->";
        if (!listaVacia()) {
            while (q != null) {
                s = s + q.info + "->";
                q = q.liga;
            }
            s = s + "null";
        } else {
            s = "Lista Vacia";
        }
        return s;
    }

    public void eliminarNodoX(int n) {
        if (!listaVacia()) {
            CNodo q, t = null;
            q = p;
            boolean band = true;
            while ((q.info != n) && (band == true)) {
                if (q.liga != null) {
                    t = q;
                    q = q.liga;
                } else {
                    band = false;
                }
            }
            if (band == false) {
                System.out.println("No existe el valor en la lista");
            } else {
                if (p == q) {
                    p = q.liga;
                } else {
                    t.liga = q.liga;
                }
                q = null;
                System.out.println("Elemento eliminado");
            }
        } else {
            System.out.println("Lista vacia");
        }
    }

    public void eliminarAntes(int ref) {
        if (!listaVacia()) {
            CNodo q, t = null, r = null;
            boolean band;
            band = true;
            if (p.info == ref) {
                System.out.println("Referencia no encontrada");
            } else {
                q = p;
                t = p;
                while ((q.info != ref) && (band == true)) {
                    if (q.liga != null) {
                        r = t;
                        t = q;
                        q = q.liga;
                    } else {
                        band = false;
                    }
                }
                if (band == false) {
                    System.out.println("Referencia no encontrada");
                } else {
                    if (p.liga == q) {
                        p = q;
                    } else {
                        r.liga = q;
                    }
                    t = null;
                    System.out.println("Elemento eliminado");
                }
            }
        } else {
            System.out.println("Lista Vacia");
        }
    }

    public void eliminarPosterior(int ref) {
        if (!listaVacia()) {
            CNodo q, t = null, r = null;
            boolean band;
            band = true;
            if (p.info == ref) {
                System.out.println("Referencia no encontrada");
            } else {
                q = p;
                t = p;
                r = p;
                while ((q.info != ref) && (band == true)) {
                    if (q.liga != null) {
                        t = q;
                        q = q.liga;
                    } else {
                        band = false;
                    }
                }
                if (band == false) {
                    System.out.println("Referencia no encontrada");
                } else {
                    t = q.liga;
                    r = t.liga;
                    q.liga = r;
                }
                t = null;
                System.out.println("Elemento eliminado");
            }
        } else {
            System.out.println("Lista vacia");
        }
    }

    public boolean buscar(int n) {
        boolean status = false;
        if (!listaVacia()) {
            CNodo q = p;
            while (q != null) {
                if (q.info == n) {
                    status = true;
                }
                q = q.liga;
            }
        }
        return status;
    }

    public int total() {
        int cont = 0;
        if (!listaVacia()) {
            CNodo q = p;
            while (q != null) {
                if (q != null) {
                    cont++;
                }
                q = q.liga;
            }
        } else {
            cont = 0;
        }
        return cont;
    }

    public void copiar() {
        if (!listaVacia()) {
            CNodo q = p;
            CLista r = new CLista();
            while(q!=null){
                r.insertaFinal(q.info);
                q=q.liga;
            }
            System.out.println("Lista copiada...\n");
            System.out.println(r);
        } else {
            System.out.println("Lista vacia");
        }
    }
}
