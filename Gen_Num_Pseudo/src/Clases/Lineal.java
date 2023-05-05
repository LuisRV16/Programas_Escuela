package Clases;
//@RC
public class Lineal {
    protected int x, xi, g, k, c, a, m, r, p;
    protected float ri;
    public Lineal() {
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setG(int g) {
        this.g = g;
    }

    public void setK(int k) {
        this.k = k;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void mod() {
        m = (int) Math.pow(2, g);
    }

    public void a() {
        a = 1 + 4 * k;
    }

    public void xi() {
        xi = (a * x + c) % m;
    }

    public void ri() {
        ri = (float) xi / (m - 1);
    }

    public void periodoV() {
        p = m;
    }

    public void examina_ri() throws limite_ri{
        String ri = String.valueOf(this.ri);
        if (ri.length()<7){
            throw new limite_ri();
        }
    }
    public void examina_g() throws limite_g{
        if (g>31) {
            throw new limite_g();
        }
    }
    public void examina_variables() throws no_negativos{
        if (x<1||k<1||g<1||c<0) {
            throw new no_negativos();
        }
    }
    public void rel_primo() throws r_primo{
        int t1, t2, p, x = 0;
        int M[], C[];
        t1 = t2 = p = 0;
        if (c == m) {
            throw new r_primo();
        } else {
            for (int i = m; i > 0; i--) {
                if (m % i == 0) {
                    t1++;
                }
            }
            for (int i = c; i > 0; i--) {
                if (c % i == 0) {
                    t2++;
                }
            }
            M = new int[t1];
            C = new int[t2];
            for (int i = m; i > 0; i--) {
                if (m % i == 0) {
                    M[p] = m / i;
                    p++;
                }
            }
            p = 0;
            for (int i = c; i > 0; i--) {
                if (c % i == 0) {
                    C[p] = c / i;
                    p++;
                }
            }
            for (int i = M.length - 1; i >= 0; i--) {
                for (int j = C.length - 1; j >= 0; j--) {
                    if (M[i] == C[j]) {
                        x = C[j];
                        break;
                    }
                }
                if (x!=0) {
                    break;
                }
            }
            if (x != 1) {
                throw new r_primo();
            }
        }
    }
    public int getA() {
        return a;
    }

    public int getC() {
        return c;
    }

    public int getG() {
        return g;
    }

    public int getK() {
        return k;
    }

    public int getM() {
        return m;
    }

    public int getP() {
        return p;
    }

    public int getR() {
        return r;
    }

    public float getRi() {
        return ri;
    }

    public int getX() {
        return x;
    }

    public int getXi() {
        return xi;
    }
    public class no_negativos extends Exception{
        public no_negativos(){}
    }
    public class limite_g extends Exception{
        public limite_g(){}
    }
    public class r_primo extends Exception{
        public r_primo(){
        }
    }
    public class limite_ri extends Exception{
        public limite_ri(){
        }
    }
}
