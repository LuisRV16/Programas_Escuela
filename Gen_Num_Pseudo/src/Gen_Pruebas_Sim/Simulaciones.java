package Gen_Pruebas_Sim;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Simulaciones {

    public static void main(String[] args) {
        No_Congruenciales A = new No_Congruenciales();
        Lectura_Escritura_Doc C = new Lectura_Escritura_Doc();
        Scanner sc = new Scanner(System.in);
        int x = 60;
//        System.out.print("Introduzca la cantidad de numeros pseudoaleatorios a generar: ");
//        int x = sc.nextInt();
        int cont = 0, cont2 = 0;
        double mayor = 0, menor = 0;
        mayor = Double.MIN_VALUE;
        menor = Double.MAX_VALUE;
        for (int j = 10000; j <= 99999; j++) {
            double suma = 0, promedio;
            Pruebas_Estadisticas B = new Pruebas_Estadisticas();
            B.setSignV(0.05);
            B.setZ(1.96);
            String s = "";
            String v = "";
            String[] array = new String[x];
            double[] arrayN = new double[x];
            double[] variables = new double[x];
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
                            System.out.println("La semilla " + j + " pasa todas las pruebas estadisticas");
                            cont++;
                            B.chiSquare(variables);
                            System.out.println("Las variables pasan las pruebas? "+B.isChiSquare());
                            System.out.println("Estadistico: "+B.getEstadistico());
                            System.out.println("Chi cuadrada teorica: "+B.getChi());
                            if (B.isChiSquare()) {
                                System.out.println("La variables si pasan las pruebas-----------------------------------------------------------------------------------");
                                cont2++;
//                                C.escribir_num(s);
//                                C.escribir(v);
                                if (promedio > mayor)
                                    mayor = promedio;
                                if (promedio < menor)
                                    menor = promedio;
                                System.out.println("Las variables aleatorias de la semilla "+j+" pasaron el ajuste de bondad");
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
        System.out.println("\n" + cont + " semillas pasan las pruebas estadísticas");
        System.out.println("\n"+ cont2 + " distintos conjuntos de variables aleatorias pasan la prueba de bondad");
        System.out.println("\nPromedio mayor y menor de las "+ cont2 +" simulaciones");
        System.out.println("El mayor promedio fue: " + mayor);
        System.out.println("El menor promedio fue: " + menor);
    }
}
