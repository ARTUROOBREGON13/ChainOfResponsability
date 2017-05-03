/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsability;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class ChainOfResponsabilityEjemplo {

    public static void main(String[] args) {
        Handler opc[] = new Handler[5];
        opc[0] = new HandlerCatedraHonorarios();
        opc[1] = new HandlerCatedraSalario();
        opc[2] = new HandlerContratistas();        
        opc[3] = new HandlerPlanta();
        opc[4] = new HandlerDefault();
        
        for(int i=0;i < opc.length-1;i++)
            opc[i].setSucessor(opc[i+1]);
        
        Scanner in = new Scanner(System.in);
        System.out.println("Seleccione la opcion para calculo de nomina: \n"
                + "1. Nomina para Catedras por Honorarios \n"
                + "2. Nomina para Catedras por Salario \n"
                + "3. Nomina para Contratistas \n"
                + "4. Nomina para Profesores de Planta \n");
        
        System.out.print("Seleccione su opcion: ");
        String opcion = in.next();
        System.out.println(opc[0].generarNomina(opcion));
    }
    
}
