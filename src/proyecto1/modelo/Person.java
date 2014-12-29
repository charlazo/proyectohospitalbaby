
package proyecto1.modelo;

public abstract class Person {
    public Person(){
    name=" ";
    last_name=" ";
    id= "";
    age=0;
    
    }
    public Person(String pName, String pLast_name, String pId, int pAge)
    {name=pName;
    last_name=pLast_name;
    id=pId;
    age=pAge;
    
    }
   public String name (){
   return name;
   }
   public String lastName (){
   return last_name;
   }
   public String id(){
   return id;
   }
   public int age(){
   return age;
   }
   public void setName(String pName){
   name=pName;
   }
   public void setLastName(String pLastName){
   last_name= pLastName;
   }
   @Override
   public abstract String toString();
   
    private String name;
    private String last_name;
    private String id;
    private int age;
}
