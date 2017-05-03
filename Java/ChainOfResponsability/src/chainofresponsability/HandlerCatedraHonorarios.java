/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsability;

/**
 *
 * @author Estudiantes
 */
public class HandlerCatedraHonorarios extends Handler {

    @Override
    public String generarNomina(String Mensaje) {
        if (Mensaje.equals("1")) {
            return "Generando Nomina para Catedra por Horarios...";
        }
        return sucessor.generarNomina(Mensaje);
    }

}
