package Gen_Pruebas_Sim;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
  
public class Simulaciones {

    public static void main(String[] args) {

        No_Congruenciales A = new No_Congruenciales();
        Lectura_Escritura_Doc C = new Lectura_Escritura_Doc();
        FrameSimulacion D = new FrameSimulacion();
        Object[] proms;
        int x = 60;//Cantidad de numeros pseudoaleatorios a generar
        int cont_semillas = 0, cont_variables = 0;
        double mayor = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;
        ArrayList<Double> promedios = new ArrayList<>();
        for (int j = 10000; j <= 99999; j++) {//Semillas desde el numero 10,000 hasta el 99,999

            Pruebas_Estadisticas B = new Pruebas_Estadisticas();

            double suma = 0, promedio;//Variables necesarias para obtener la demanda de azúcar promedio
            String s = "";
            String v = "";
            String[] array = new String[x];
            double[] arrayN = new double[x];
            double[] variables = new double[x];

            B.setSignV(0.05);
            B.setZ(1.96);
            A.setX1(j);
            A.setX2(j);

            try {
                A.examina_semillas();
            } catch (No_Congruenciales.longitud_semillas | No_Congruenciales.semilla_negativa | No_Congruenciales.valor_invalido ex) {
                Logger.getLogger(Simulaciones.class.getName()).log(Level.SEVERE, null, ex);
            }

            A.n_dig();
            A.largo();

            for (int k = 0; k < x; k++) {
                A.producto();
                A.cadena_f();
                A.xi();
                A.setX1(Integer.parseInt(A.getXi()));
                A.setX2(Integer.parseInt(A.getXi()));
                A.ri();
                s += A.getRi() + "\n";
                array[k] = A.getRi();
                arrayN[k] = Double.parseDouble(A.getRi());
                variables[k] = (-100) * Math.log(1 - arrayN[k]);
                v += variables[k] + "\n";
                suma += variables[k];
            }

            promedio = suma / variables.length;

            B.setArr(arrayN);
            B.setArrT(array);
            B.media();
            B.varianza();

            if (B.isMedia() || B.isVarianza()) {
                B.uniformidad();

                if (B.isUniformidad()) {
                    B.setNum_d(5);
                    B.poker();

                    if (B.isPoker()) {
                        B.aleatoriedad();

                        if (B.isAleatoriedad()) {
                            System.out.println("\nLa semilla " + j + " pasa todas las pruebas estadisticas");
                            cont_semillas++;

                            B.chiSquare(variables);
                            System.out.println("Prueba de bondad de las variables: ");
                            System.out.print("Estadistico: " + B.getEstadistico());
                            System.out.println(" | Chi cuadrada teorica: " + B.getChi());

                            if (B.isChiSquare()) {
                                cont_variables++;
//                                C.escribir_num(s);
//                                C.escribir_val(v);
                                promedios.add(promedio);
                                System.out.println("Las variables aleatorias de la semilla " + j + " pasaron el ajuste de bondad\n");

                            }else{
                                System.out.println("Las variables aleatorias de la semilla " + j + " no pasaron el ajuste de bondad\n");
                            }

                        } else {
                            System.out.println("La semilla " + j + " no pasa la prueba de aleatoriedad");
                        }

                    } else {
                        System.out.println("Semilla " + j + " no pasa la prueba de poker");
                    }

                } else {
                    System.out.println("Semilla " + j + " no pasa la prueba de Uniformidad");
                }

            } else {
                System.out.println("Semilla " + j + " no pasa las pruebas de Media y Varianza");
            }

        }
        System.out.println("\n---------------------------------------------------------\n");
        proms = promedios.toArray();
//        for (int i = 0; i < proms.length; i++) {
//            System.out.println("Promedio en la posición "+i+": "+proms[i]);
//        }
        Arrays.sort(proms);
//        for (int i = 0; i < proms.length; i++) {
//            System.out.println("Promedio en la posición "+i+": "+proms[i]);
//        }
        menor = (double) proms[0];
        mayor = (double) proms[proms.length - 1];
        int numIntv = (int) mayor - (int) menor + 1;
        System.out.println("\n" + cont_semillas + " semillas pasan las pruebas estadísticas");
        System.out.println("\n" + cont_variables + " distintos conjuntos de variables aleatorias pasan la prueba de bondad");
        System.out.println("\nPromedio mayor y menor de las " + cont_variables + " simulaciones");
        System.out.println("El mayor promedio fue: " + mayor);
        System.out.println("El menor promedio fue: " + menor);
        System.out.println("Cantidad de intervalos para el metodo de MonteCarlo: " + numIntv);

        double[][] montecarlo = new double[numIntv][7];
        for (int i = 0; i < montecarlo.length; i++) {
            montecarlo[i][0] = (int) menor + i;
        }

        for (int i = 0; i < montecarlo.length; i++) {
            for (int j = 0; j < proms.length; j++) {
                if (Double.parseDouble(String.valueOf(proms[j])) > montecarlo[i][0] && Double.parseDouble(String.valueOf(proms[j])) <= montecarlo[i][0] + 1) {
                    montecarlo[i][1]++;
                }
            }
        }
        double suma=0;
        for (int i = 0; i < montecarlo.length; i++) {
            montecarlo[i][1] /= proms.length;
            suma+=montecarlo[i][1];
            montecarlo[i][2]=suma;
            montecarlo[i][3]=suma-montecarlo[i][1];
            montecarlo[i][4]=montecarlo[i][2];
            montecarlo[i][5]=montecarlo[i][3]*1000;
            montecarlo[i][6]=montecarlo[i][4]*1000;
        }
        
    }
}
