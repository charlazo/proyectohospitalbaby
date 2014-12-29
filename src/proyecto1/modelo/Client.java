
package proyecto1.modelo;


public class Client extends Person {
    Client(String pName, String pLast_name, String pId, int pAge, float pWeight){
    super(pName,pLast_name,pId,pAge);
    weight=pWeight;
    }
    public float weight(){
    return weight;
    }
    @Override
    public String toString(){
    return("");
    }
    private float weight;
}
