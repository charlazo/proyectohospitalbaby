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
public class Doctor extends Person {
    Doctor(String pName, String pLast_name, String pId, int pAge,String pArea){
      super(pName,pLast_name,pId,pAge);
      area=pArea;
    }
    public String area(){
    return area;
    }
    @Override
    public String toString(){
    return("");
    }
    private String area;
}
