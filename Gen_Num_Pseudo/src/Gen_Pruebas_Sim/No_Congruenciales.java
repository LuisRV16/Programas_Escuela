package Gen_Pruebas_Sim;
//@RC
import java.math.BigInteger;

public class No_Congruenciales {

    private int x1, x2, largo, n_dig;
    private String n_string, n_string_f, xi;
    private String ri;
    private BigInteger x;

    public No_Congruenciales() {
    }

    public No_Congruenciales(int x1, int x2) {
        setX1(x1);
        setX2(x2);
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void examina_semillas() throws longitud_semillas, semilla_negativa, valor_invalido {
        String x1 = String.valueOf(this.x1);
        String x2 = String.valueOf(this.x2);
        if (x1.length() != x2.length()) {
            throw new longitud_semillas();
        }
        if (this.x1 < 0 || this.x2 < 0) {
            throw new semilla_negativa();
        }
        if (this.x1 > 0 && this.x1 <= 10) {
            throw new valor_invalido();
        }
        if (this.x2 > 0 && this.x2 <= 10) {
            throw new valor_invalido();
        }
    }

    public void n_dig() {
        String x = String.valueOf(x1);
        this.n_dig = x.length();
    }

    public int getX1() {
        return x1;
    }

    public int getX2() {
        return x2;
    }

    public String getN_string() {
        return n_string;
    }

    public String getN_string_f() {
        return n_string_f;
    }

    public String getXi() {
        return xi;
    }

    public String getRi() {
        return ri;
    }

    public void largo() {
        String x;
        x = String.valueOf(x1);
        largo = x.length() * 2;
    }

    public void producto() {
        n_string = String.valueOf((long) x1 * x2);
    }

    public void cadena_f() {
        x = new BigInteger(n_string);
        n_string_f = String.format("%0" + largo + "d", x);
    }

    public void xi() {
        int elim, desde, hasta;
        elim = largo - n_dig;
        desde = elim / 2;
        hasta = desde + n_dig;
        xi = n_string_f.substring(desde, hasta);
    }

    public void ri() {
        ri = "0." + xi;
    }

    public int getLargo() {
        return largo;
    }

    public class longitud_semillas extends Exception {
        public longitud_semillas() {
        }
    }
    public class semilla_negativa extends Exception {
        public semilla_negativa() {
        }
    }
    public class valor_invalido extends Exception {
        public valor_invalido() {
        }
    }
}
