import java.util.*;
class Count{
    
    String cont;
    Scanner sc=new Scanner(System.in);
    public void Pcont(){
    System.out.println("Enter the contient name");
  
    cont=sc.next();
 
    }
}
 class Cou extends Count {
    String cou;
    public void Pcou(){
    System.out.println("Enter the country name");
   
    cou=sc.next();
    }
}
 class State extends Cou{
    String state;
    public void Pstate(){
    System.out.println("Enter the state name");
    state=sc.next();
    }
}
public class Program2 extends State{
    String place;
    
    public void Pplace(){
    System.out.println("Enter the place name");
    place=sc.next();
  
     
    }

public static void main(String args[]){

    Program2 p1=new Program2();
    
   p1.Pcont();
   p1.Pcou();
   p1.Pstate();
   p1.Pplace();

 System.out.println("Contient:"+p1.cont);
 System.out.println("Country:"+p1.cou);
 System.out.println("State:"+p1.state);
 System.out.println("Place:"+p1.place);
}


}



