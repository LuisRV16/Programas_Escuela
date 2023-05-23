package Gen_Pruebas_Sim;
//@RC
import java.util.Arrays;
import org.apache.commons.math3.distribution.ChiSquaredDistribution;

public class Pruebas_Estadisticas {

    private boolean media = false, varianza = false, uniformidad = false, poker = false, aleatoriedad = false, chiSquare = false;
    private double signV, z;
    private double[] arr;
    private double chiV;
    private String[] arrT;
    private int num_d;
    private double r, lS, lI;
    private double vr;
    private double estadistico;

    public Pruebas_Estadisticas() {
    }

    public void media() {
        for (int i = 0; i < arr.length; i++) {
            r += arr[i];
        }
        r /= arr.length;
        lS = 0.5 + (z / Math.sqrt(12 * arr.length));
        lI = 0.5 - (z / Math.sqrt(12 * arr.length));
        if (r >= lI && r <= lS) {
            media = true;
        }
    }

    public void varianza() {
        ChiSquaredDistribution Chi = new ChiSquaredDistribution(arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            vr += Math.pow(arr[i] - r, 2);
        }
        vr /= arr.length - 1;
        lS = Chi.inverseCumulativeProbability(1 - (signV / 2)) / (12 * (arr.length - 1));
        lI = Chi.inverseCumulativeProbability(signV / 2) / (12 * (arr.length - 1));
        if (vr >= lI && vr <= lS) {
            varianza = true;
        }
    }

    public void uniformidad() {
        double m,FE;
        m = Math.sqrt(arr.length);
        FE = arr.length/Math.round(m);
        ChiSquaredDistribution Chi = new ChiSquaredDistribution((int) m - 1);
        chiV = Chi.inverseCumulativeProbability(1 - signV);
        double[] subI = new double[(int) m + 1];
        int[] contI = new int[(int) m];
        for (int i = 0; i < subI.length; i++) {
            subI[i] = (double) i / ((int) m);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < contI.length; j++) {
                if (arr[i] > subI[j] && arr[i] <= subI[j + 1]) {
                    contI[j]++;
                }
            }
        }
        for (int i = 0; i < contI.length; i++) {
            estadistico += Math.pow((FE - contI[i]), 2) / m;
        }
        if (estadistico < chiV) {
            uniformidad = true;
        }
    }

    public void poker(){
        int formato = 0;
        int[] cant_n = new int[10];
        int[] FO = null;
        double[] FE = null;
        int ceros, unos, dos, tres, cuatros, cincos, seis, sietes, ochos, nueves;
        int td, par, tercia, poker, quinta;
        switch (num_d) {
            case 5:
                formato = 7;
                FO = new int[7];
                FE = new double[7];
                FE[0] = 0.3024 * arr.length;
                FE[1] = 0.504 * arr.length;
                FE[2] = 0.108 * arr.length;
                FE[3] = 0.009 * arr.length;
                FE[4] = 0.072 * arr.length;
                FE[5] = 0.0045 * arr.length;
                FE[6] = 0.0001 * arr.length;
                break;
            case 4:
                formato = 6;
                FO = new int[5];
                FE = new double[5];
                FE[0] = 0.504 * arr.length;
                FE[1] = 0.432 * arr.length;
                FE[2] = 0.027 * arr.length;
                FE[3] = 0.036 * arr.length;
                FE[4] = 0.001 * arr.length;
                break;
            case 3:
                formato = 5;
                FO = new int[3];
                FE = new double[3];
                FE[0] = 0.72 * arr.length;
                FE[1] = 0.27 * arr.length;
                FE[2] = 0.01 * arr.length;
                break;
        }
        for (int i = 0; i < arrT.length; i++) {
            arrT[i] = arrT[i].substring(2, formato);
            ceros = unos = dos = tres = cuatros = cincos = seis = sietes = ochos = nueves = 0;
            for (int j = 0; j < arrT[i].length(); j++) {
                switch (arrT[i].charAt(j)) {
                    case '0' -> ceros++;
                    case '1' -> unos++;
                    case '2' -> dos++;
                    case '3' -> tres++;
                    case '4' -> cuatros++;
                    case '5' -> cincos++;
                    case '6' -> seis++;
                    case '7' -> sietes++;
                    case '8' -> ochos++;
                    case '9' -> nueves++;
                }
            }
            switch (num_d) {
                case 5:
                    td = par = tercia = poker = quinta = 0;
                    switch (ceros) {
                        case 1 -> td++;
                        case 2 -> par++;
                        case 3 -> tercia++;
                        case 4 -> poker++;
                        case 5 -> quinta++;
                        default -> {
                        }
                    }
                    switch (unos) {
                        case 1 -> td++;
                        case 2 -> par++;
                        case 3 -> tercia++;
                        case 4 -> poker++;
                        case 5 -> quinta++;
                        default -> {
                        }
                    }
                    switch (dos) {
                        case 1 -> td++;
                        case 2 -> par++;
                        case 3 -> tercia++;
                        case 4 -> poker++;
                        case 5 -> quinta++;
                        default -> {
                        }
                    }
                    switch (tres) {
                        case 1 -> td++;
                        case 2 -> par++;
                        case 3 -> tercia++;
                        case 4 -> poker++;
                        case 5 -> quinta++;
                        default -> {
                        }
                    }
                    switch (cuatros) {
                        case 1 -> td++;
                        case 2 -> par++;
                        case 3 -> tercia++;
                        case 4 -> poker++;
                        case 5 -> quinta++;
                        default -> {
                        }
                    }
                    switch (cincos) {
                        case 1 -> td++;
                        case 2 -> par++;
                        case 3 -> tercia++;
                        case 4 -> poker++;
                        case 5 -> quinta++;
                        default -> {
                        }
                    }
                    switch (seis) {
                        case 1 -> td++;
                        case 2 -> par++;
                        case 3 -> tercia++;
                        case 4 -> poker++;
                        case 5 -> quinta++;
                        default -> {
                        }
                    }
                    switch (sietes) {
                        case 1 -> td++;
                        case 2 -> par++;
                        case 3 -> tercia++;
                        case 4 -> poker++;
                        case 5 -> quinta++;
                        default -> {
                        }
                    }
                    switch (ochos) {
                        case 1 -> td++;
                        case 2 -> par++;
                        case 3 -> tercia++;
                        case 4 -> poker++;
                        case 5 -> quinta++;
                        default -> {
                        }
                    }
                    switch (nueves) {
                        case 1 -> td++;
                        case 2 -> par++;
                        case 3 -> tercia++;
                        case 4 -> poker++;
                        case 5 -> quinta++;
                        default -> {
                        }
                    }
                    if (td == 5) {
                        FO[0]++;
                    } else if (tercia == 0 && par == 1) {
                        FO[1]++;
                    } else if (par == 2) {
                        FO[2]++;
                    } else if (tercia == 1 && par == 1) {
                        FO[3]++;
                    } else if (tercia == 1 && par == 0) {
                        FO[4]++;
                    } else if (poker == 1) {
                        FO[5]++;
                    } else if (quinta == 1) {
                        FO[6]++;
                    }
                    break;
                case 4:
                    td = par = tercia = poker = quinta = 0;
                    switch (ceros) {
                        case 1 -> td++;
                        case 2 -> par++;
                        case 3 -> tercia++;
                        case 4 -> poker++;
                        default -> {
                        }
                    }
                    switch (unos) {
                        case 1 -> td++;
                        case 2 -> par++;
                        case 3 -> tercia++;
                        case 4 -> poker++;
                        default -> {
                        }
                    }
                    switch (dos) {
                        case 1 -> td++;
                        case 2 -> par++;
                        case 3 -> tercia++;
                        case 4 -> poker++;
                        default -> {
                        }
                    }
                    switch (tres) {
                        case 1 -> td++;
                        case 2 -> par++;
                        case 3 -> tercia++;
                        case 4 -> poker++;
                        default -> {
                        }
                    }
                    switch (cuatros) {
                        case 1 -> td++;
                        case 2 -> par++;
                        case 3 -> tercia++;
                        case 4 -> poker++;
                        default -> {
                        }
                    }
                    switch (cincos) {
                        case 1 -> td++;
                        case 2 -> par++;
                        case 3 -> tercia++;
                        case 4 -> poker++;
                        default -> {
                        }
                    }
                    switch (seis) {
                        case 1 -> td++;
                        case 2 -> par++;
                        case 3 -> tercia++;
                        case 4 -> poker++;
                        default -> {
                        }
                    }
                    switch (sietes) {
                        case 1 -> td++;
                        case 2 -> par++;
                        case 3 -> tercia++;
                        case 4 -> poker++;
                        default -> {
                        }
                    }
                    switch (ochos) {
                        case 1 -> td++;
                        case 2 -> par++;
                        case 3 -> tercia++;
                        case 4 -> poker++;
                        default -> {
                        }
                    }
                    switch (nueves) {
                        case 1 -> td++;
                        case 2 -> par++;
                        case 3 -> tercia++;
                        case 4 -> poker++;
                        default -> {
                        }
                    }
                    if (td == 4) {
                        FO[0]++;
                    } else if (par == 1) {
                        FO[1]++;
                    } else if (par == 2) {
                        FO[2]++;
                    } else if (tercia == 1) {
                        FO[3]++;
                    } else if (poker == 1) {
                        FO[4]++;
                    }
                    break;
                case 3:
                    td = par = tercia = 0;
                    switch (ceros) {
                        case 1 -> td++;
                        case 2 -> par++;
                        case 3 -> tercia++;
                        default -> {
                        }
                    }
                    switch (unos) {
                        case 1 -> td++;
                        case 2 -> par++;
                        case 3 ->  tercia++;
                        default -> {
                        }
                    }
                    switch (dos) {
                        case 1 -> td++;
                        case 2 -> par++;
                        case 3 -> tercia++;
                        default -> {
                        }
                    }
                    switch (tres) {
                        case 1 -> td++;
                        case 2 -> par++;
                        case 3 -> tercia++;
                        default -> {
                        }
                    }
                    switch (cuatros) {
                        case 1 -> td++;
                        case 2 -> par++;
                        case 3 -> tercia++;
                        default -> {
                        }
                    }
                    switch (cincos) {
                        case 1 -> td++;
                        case 2 -> par++;
                        case 3 -> tercia++;
                        default -> {
                        }
                    }
                    switch (seis) {
                        case 1 -> td++;
                        case 2 -> par++;
                        case 3 -> tercia++;
                        default -> {
                        }
                    }
                    switch (sietes) {
                        case 1 -> td++;
                        case 2 -> par++;
                        case 3 -> tercia++;
                        default -> {
                        }
                    }
                    switch (ochos) {
                        case 1 -> td++;
                        case 2 -> par++;
                        case 3 -> tercia++;
                        default -> {
                        }
                    }
                    switch (nueves) {
                        case 1 -> td++;
                        case 2 ->  par++;
                        case 3 -> tercia++;
                        default -> {
                        }
                    }
                    if (td == 3) {
                        FO[0]++;
                    } else if (par == 1) {
                        FO[1]++;
                    } else if (tercia == 1) {
                        FO[3]++;
                        break;
                    }
            }
        }
        ChiSquaredDistribution Chi = new ChiSquaredDistribution(FO.length - 1);
        chiV = Chi.inverseCumulativeProbability(1 - signV);
        for (int j = 0; j < FO.length; j++) {
            estadistico += Math.pow(FE[j] - FO[j], 2) / FE[j];
        }
        if (estadistico < chiV) {
            this.poker = true;
        }
    }

    public void aleatoriedad() {
        double valorEsp = ((double) (2 * arr.length - 1)) / 3;
        vr = ((double) (16 * arr.length - 29)) / 90;
        double vz = Math.sqrt(vr);
        int cont = 0;
        boolean band = true;
        boolean band2;
        if (arr[1] < arr[0]) {
            band = false;
        }
        band2 = band;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                band = true;
            } else {
                band = false;
            }
            if (band2 != band) {
                cont++;
                band2 = band;
            }
        }
        estadistico = Math.abs((cont - valorEsp) / vz);
        if (estadistico < z) {
            aleatoriedad = true;
        }
    }
    
    public void chiSquare(double array[]){
        double arr[] = array;
        double max, min, rango, amplitud, FE;
        int clases=58;
        Arrays.sort(arr);
        min = arr[0];
        max = arr[arr.length-1];
//        clases = (int) Math.round(Math.sqrt(array.length));
        FE = array.length/clases;
        ChiSquaredDistribution Chi = new ChiSquaredDistribution(clases-1);
        chiV = Chi.inverseCumulativeProbability(1 - signV);
        double arrLM[] = new double [clases+1];
        int arrClases[] = new int [clases];
        rango = max-min;
        amplitud = rango/clases;
        arrLM[0]=0;
        arrLM[1]=min+amplitud;
        for (int i = 2; i < clases; i++) {
            arrLM[i]=arrLM[i-1]+amplitud;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < arrClases.length; j++) {
                if (array[i]>arrLM[j]&&array[i]<=arrLM[j+1]) {
                    arrClases[j]++;
                }
            }
        }
        for (int i = 0; i < arrClases.length; i++) {
            estadistico += Math.pow(arrClases[i]-FE, 2)/FE;
        }
        if (estadistico < chiV) {
            chiSquare = true;
        }
    }
    
//    public void chiSquare1(double array[]){
//        double max, min, rango, amplitud,FE;
//        int clases;
//        clases = (int) Math.round(Math.sqrt(array.length));
//        FE = array.length/clases;
//        double arrLM[] = new double[clases+1];
//        int arrClases[] = new int[clases];
//        ChiSquaredDistribution Chi = new ChiSquaredDistribution((int) clases - 1);
//        chiV = Chi.inverseCumulativeProbability(1 - signV);
//        max = min = array[0];
//        for (int i = 0; i < array.length; i++) {
//            if (array[i]>max) {
//                max = array[i];
//            }
//            if (array[i]<min) {
//                min = array[i];
//            }
//        }
//        rango = max-min;
//        amplitud = rango/clases;
//        arrLM[0]=0;
//        arrLM[1]=min+amplitud;
//        for (int i = 2; i < clases; i++) {
//            arrLM[i]=arrLM[i-1]+amplitud;
//        }
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < arrClases.length; j++) {
//                if (array[i]>arrLM[j]&&array[i]<=arrLM[j+1]) {
//                    arrClases[i]++;
//                }
//            }
//        }
//        for (int i = 0; i < arrClases.length; i++) {
//            estadistico += Math.pow(arrClases[i]-FE, 2)/FE;
//        }
//        if (estadistico < chiV) {
//            chiSquare = true;
//        }
//    }
    
    

    public void setSignV(double signV) {
        this.signV = signV;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void setArr(double[] arr) {
        this.arr = arr;
    }

    public double getR() {
        return r;
    }

    public double getEstadistico() {
        return estadistico;
    }

    public double getlS() {
        return lS;
    }

    public double getlI() {
        return lI;
    }

    public double getVr() {
        return vr;
    }

    public double getChi() {
        return chiV;
    }

    public boolean isMedia() {
        return media;
    }

    public boolean isVarianza() {
        return varianza;
    }

    public boolean isUniformidad() {
        return uniformidad;
    }

    public boolean isPoker() {
        return poker;
    }

    public boolean isAleatoriedad() {
        return aleatoriedad;
    }

    public boolean isChiSquare(){
        return chiSquare;
    }
    public void setNum_d(int num_d) {
        this.num_d = num_d;

    }

    public void setArrT(String[] arrT) {
        this.arrT = arrT;
    }
}
