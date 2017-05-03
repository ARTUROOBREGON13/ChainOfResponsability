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
public class HandlerContratistas extends Handler{
    @Override
    public String generarNomina(String Mensaje) {
        if (Mensaje.equalsIgnoreCase("3")) {
            return "Generando Nomina para Contratistas...";
        }
        return sucessor.generarNomina(Mensaje);
    }
}
