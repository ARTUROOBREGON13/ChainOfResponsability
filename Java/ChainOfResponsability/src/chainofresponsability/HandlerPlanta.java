/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsability;

public class HandlerPlanta extends Handler{
    @Override
    public String generarNomina(String Mensaje) {
        if (Mensaje.equalsIgnoreCase("4")) {
            return "Generando Nomina para profesores de planta...";
        }
        return sucessor.generarNomina(Mensaje);
    }
}
