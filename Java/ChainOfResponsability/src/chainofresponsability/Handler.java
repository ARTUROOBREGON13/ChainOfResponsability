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
public abstract class Handler {
    protected Handler sucessor; 
    public abstract String generarNomina(String Mensaje);
    public void setSucessor(Handler s) {
        this.sucessor = s;
    }
}
