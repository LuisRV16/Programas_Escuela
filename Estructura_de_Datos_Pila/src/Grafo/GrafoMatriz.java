package Grafo;
public class GrafoMatriz {
    boolean esdirigido;
    int maxNodos;
    int numVertices;
    boolean matAdy[][];
    
    public GrafoMatriz(boolean d){
        //construye un grafo vacio
        maxNodos=numVertices=0;
        esdirigido=d;
    }
    public GrafoMatriz(int n, boolean d){
        //construye un grafo tamaño n
        esdirigido = d;
        maxNodos = n;
        numVertices = 0;
        matAdy = new boolean[n][n];
        //Inicializa el grafo
        for (int i = 0; i < maxNodos; i++) {
            for (int j = 0; j < maxNodos; j++) {
                matAdy[i][j]=false;
            }
        }
    }
    public void InsertaArista(int arista1, int arista2){
        if (arista1>=maxNodos || arista2>=maxNodos) {
            System.out.println("ARISTA INVALIDA\nINGRESE UNA ARISTA VALIDA");
        }else if(arista1<0 || arista2<0){
            System.out.println("ARISTA INVALIDA\nINGRESE UNA ARISTA VALIDA");
        }else{
            matAdy[arista1][arista2]=true;
            matAdy[arista2][arista1]=true;
            System.out.println("Arista Insertada...");
        }
    }
    public void EliminaArista(int arista1, int arista2){
        if (arista1>=maxNodos || arista2>=maxNodos) {
            System.out.println("ARISTA INVALIDA\nINGRESE UNA ARISTA VALIDA");
        }else if(arista1<0 || arista2<0){
            System.out.println("ARISTA INVALIDA\nINGRESE UNA ARISTA VALIDA");
        }else{
            matAdy[arista1][arista2]=false;
            matAdy[arista2][arista1]=false;
            System.out.println("Grafo ["+arista1+"]["+arista2+"]");
            System.out.println("Arista Eliminada...");
        }
    }
    public void Adyacencia(int arista1, int arista2){
        if (!matAdy[arista1][arista2]) {
            System.out.println("Los nodos no estan relacionados");
        }else{
            System.out.println("Los nodos estan relacionados");
        }
    }
    public void MuestraGrafo(){
        for (int i = 0; i < maxNodos; i++) {
            for (int j = 0; j < maxNodos; j++) {
                System.out.println("["+i+"]["+j+"]:"+matAdy[i][j]);
            }
        }
    }
}
