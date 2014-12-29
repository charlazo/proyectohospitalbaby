/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.modelo;

/**
 *
 * @author CARLOS
 */
public class Expedient {
    Expedient(){
    clientin= new Client("","","",0,0);
    }
    Expedient(Client pClientin){
    clientin= pClientin;
    }
    @Override
    public String toString(){
    return clientin.toString();
    }
    private Client clientin;
}
