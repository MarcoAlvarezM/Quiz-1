/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz;

import javax.swing.JOptionPane;

/**
 *
 * @author Marco
 */
public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaracion de variables
        int cantidad_empleados;
        int i = 0;
        double salario;
        double total_pagar = 0;
        double sem;
        double ivm;
        //Solicitud de datos
        cantidad_empleados = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de empleados"));
        //Inicia ciclo segun N cantidad empleados
        do {
            i++;
            salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el salario #" + i + " correspondiente"));
            //Calculo de datos
            sem = (salario * 0.0925);
            ivm = (salario * 0.0508);
            total_pagar = total_pagar + (ivm + sem);

        } while (i != cantidad_empleados);

        //Salida de datos
        JOptionPane.showMessageDialog(null, "La empresa deberà abonar a la CCSS el monto de " + total_pagar + " por concepto de SEM y IVM");

    }
    
}
