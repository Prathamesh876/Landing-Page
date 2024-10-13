public class employe {
    
    int id,salary;
    String name,dept;
     
    
    employe(){
        id=0;
        salary=0;
        name="";
        dept="";      
    }

    employe(int id,int salary,String name, String dept){

        this.id=id;
        this.salary=salary;
        this.name=name;
        this.dept=dept;
    }
    void display(){
        
        System.out.println("id:"+id);
        System.out.println("name:"+name);
        System.out.println("department:"+dept);
        System.out.println("salary:"+salary);
    }

    public static void main(String args[]){
        System.out.println("Enter the id of employee:");
        int id=sc.nextInt();
       
    }
}
