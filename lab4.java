import java.util.Random;
class Account{
  
    double bal;
    //accHolder
    
    void deposit(double bal){
        bal+=bal;
        
    }
    void withdraw(double bal){
        bal-=bal;
        
    }
     void getBal(){
        
    }
}
class Person extends Account{
    String name;
    int age;
     Person(String name,int age){
       //this.bal=bal;
       this.name=name;
       this.age=age;
   }
}
class Ex{
    public static void main(String args[]){
        Random r=new Random();
         int SaccNo=r.nextInt(10000);
         int KaccNo=r.nextInt(10000);
           
        Person s=new Person("smith",20);
        Person k=new Person("kathy",21);
       
        System.out.println("account no:"+accNo);
    }
}