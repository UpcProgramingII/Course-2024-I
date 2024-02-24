/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioSueldoSemanal;

import java.util.Scanner;

/**
 *
 * @author Jairo F
 */
public class SueldoSemanal {
    
    public static void main(String[] arg){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Horas laboradas trbajador 1: ");
        int horasLaboradas = entrada.nextInt();
        double sueldo = calcularSalarioSemanal(horasLaboradas);
        imprimirSalario(sueldo, horasLaboradas);
        
        System.out.print("Horas laboradas trbajador 2: ");
        horasLaboradas = entrada.nextInt();
        sueldo = calcularSalarioSemanal(horasLaboradas);
        imprimirSalario(sueldo, horasLaboradas);
        
        
        
    }
    
    public  static void imprimirSalario(double sueldo, int nHorastrabajadas){
        
        System.out.printf("Sueldo para %d horas en la semana = %f%n", nHorastrabajadas, sueldo);
    }
    
    public static double calcularSalarioSemanal(int nHorasSemanalesLaboradas){
        final double VALOR_HORA_ORDINARIA = 1000;
        final double VALOR_HORA_EXTRA = VALOR_HORA_ORDINARIA * 1.5;
        final int LIMITE_MAX_HORAS_ORDINARIA = 37;
        final double IMPUESTO = 0.1; 
        final double LIMITE_SUELDO_CON_IMPUESTO=750;
        
        
        //TRABAJADOR 1
        //int nHorasSemanalesLaboradas = 50;
        double sueldoSemanal;
        
        if(nHorasSemanalesLaboradas<=LIMITE_MAX_HORAS_ORDINARIA){
            sueldoSemanal = nHorasSemanalesLaboradas * VALOR_HORA_ORDINARIA;
        }
        else{
            sueldoSemanal = (LIMITE_MAX_HORAS_ORDINARIA * VALOR_HORA_ORDINARIA) + 
                            ((nHorasSemanalesLaboradas-LIMITE_MAX_HORAS_ORDINARIA) * VALOR_HORA_EXTRA);
        }
        
        if(sueldoSemanal>LIMITE_SUELDO_CON_IMPUESTO){
           sueldoSemanal = sueldoSemanal - (sueldoSemanal * IMPUESTO);
        }
        
        return sueldoSemanal;
        
    }
    
    
}
