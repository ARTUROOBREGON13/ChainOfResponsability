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
public class HandlerDefault extends Handler{

    @Override
    public String generarNomina(String Mensaje) {
        return "ERROR: La opcion " + Mensaje + " no existe.";
    }
    
}
