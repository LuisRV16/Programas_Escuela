package Gen_Pruebas_Sim;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Simulaciones {

    public static void main(String[] args) {
        No_Congruenciales A = new No_Congruenciales();
        Lectura_Escritura_Doc C = new Lectura_Escritura_Doc();
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la cantidad de numeros pseudoaleatorios a generar: ");
        int x = sc.nextInt();
        int cont = 0;
        double mayor = 0, menor = 0;
        mayor = Double.MIN_VALUE;
        menor = Double.MAX_VALUE;
        for (int i = 10000; i <= 99999; i++) {
            double suma = 0, promedio;
            Pruebas_Estadisticas B = new Pruebas_Estadisticas();
            B.setSignV(0.05);
            B.setZ(1.96);
            String s = "";
            String v = "";
            String[] array = new String[x];
            double[] arrayN = new double[x];
            double[] variables = new double[x];
            A.setX1(i);
            A.setX2(i);
            try {
                A.examina_semillas();
            } catch (No_Congruenciales.longitud_semillas | No_Congruenciales.semilla_negativa | No_Congruenciales.valor_invalido ex) {
                Logger.getLogger(Simulaciones.class.getName()).log(Level.SEVERE, null, ex);
            }
            A.n_dig();
            A.largo();
            for (int j = 0; j < x; j++) {
                A.producto();
                A.cadena_f();
                A.xi();
                A.setX1(Integer.parseInt(A.getXi()));
                A.setX2(Integer.parseInt(A.getXi()));
                A.ri();
                s += A.getRi() + "\n";
                array[j] = A.getRi();
                arrayN[j] = Double.parseDouble(A.getRi());
                variables[j] = (-100) * Math.log(1 - arrayN[j]);
                v += variables[j] + "\n";
                suma += variables[j];
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
                            System.out.println("La semilla " + i + " pasa todas las pruebas estadisticas");
                            cont++;
//                            C.escribir(v);
//                            C.escribir_num(s);
                            if (promedio > mayor)
                                mayor = promedio;
                            if (promedio < menor)
                                menor = promedio;
                        } else {
                            System.out.println("La semilla " + i + " no pasa la prueba de aleatoriedad");
                        }
                    } else {
                        System.out.println("Semilla " + i + " no pasa la prueba de poker");
                    }
                } else {
                    System.out.println("Semilla " + i + " no pasa la prueba de Uniformidad");
                }
            } else {
                System.out.println("Semilla " + i + " no pasa las pruebas de Media y Varianza");
            }
        }
        System.out.println("\n" + cont + " semillas pasan las pruebas estadísticas");
        System.out.println("\nPromedio mayor y menor de las "+ cont +" simulaciones");
        System.out.println("El mayor promedio fue: " + mayor);
        System.out.println("El menor promedio fue: " + menor);
    }
}
